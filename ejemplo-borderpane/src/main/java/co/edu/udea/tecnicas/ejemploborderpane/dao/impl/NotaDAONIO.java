package co.edu.udea.tecnicas.ejemploborderpane.dao.impl;

import co.edu.udea.tecnicas.ejemploborderpane.dao.NotaDAO;
import co.edu.udea.tecnicas.ejemploborderpane.model.Nota;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class NotaDAONIO implements NotaDAO {

    private final static int LONGITUD_REGISTRO = 74;
    private final static int LONGITUD_NOMBRE = 20;
    private final static int LONGITUD_DESCRIPCION = 50;
    private final static int LONGITUD_PORCENTAJE = 4;

    private final static Path ARCHIVO = Paths.get("notas_nio");

    public NotaDAONIO() {
        System.out.println("Inicializando la base de datos de notas en disco con NIO");
        if (!Files.exists(ARCHIVO)) {
            try {
                Files.createFile(ARCHIVO);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    @Override
    public void guardarNota(Nota nota) {
        String registro = parseNota(nota);
        byte[] bytes = registro.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        try (FileChannel fileChannel = FileChannel.open(ARCHIVO, APPEND)) {
            fileChannel.write(byteBuffer);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private String parseNota(Nota nota) {
        StringBuilder sb = new StringBuilder();
        sb.append(ajustarCampo(nota.getNombre(), LONGITUD_NOMBRE))
                .append(ajustarCampo(nota.getDescripcion(), LONGITUD_DESCRIPCION))
                .append(ajustarCampo(String.valueOf(nota.getPorcentaje()), LONGITUD_PORCENTAJE));
        return sb.toString();
    }

    private String ajustarCampo(String campo, int longitud) {
        if (campo.length() > longitud) {
            return campo.substring(0, longitud);
        }
        return String.format("%1$-" + longitud + "s", campo);
    }

    @Override
    public List<Nota> obtenerNotas() {
        List<Nota> resultado = new ArrayList<>();
        try (SeekableByteChannel sbc = Files.newByteChannel(ARCHIVO)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(LONGITUD_REGISTRO);
            while (sbc.read(byteBuffer) > 0) {
                byteBuffer.rewind();
                CharBuffer registro = Charset.defaultCharset().decode(byteBuffer);
                Nota nota = parseRegistro(registro);
                resultado.add(nota);
                byteBuffer.flip();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return resultado;
    }

    private Nota parseRegistro(CharBuffer registro) {
        Nota nota = new Nota();

        String nombre = registro.subSequence(0, LONGITUD_NOMBRE).toString().trim();
        registro.position(LONGITUD_NOMBRE);
        registro = registro.slice();

        String descripcion = registro.subSequence(0, LONGITUD_DESCRIPCION).toString().trim();
        registro.position(LONGITUD_DESCRIPCION);
        registro = registro.slice();

        String porcentajeStr = registro.subSequence(0, LONGITUD_PORCENTAJE).toString().trim();
        float porcentaje = Float.parseFloat(porcentajeStr);

        nota.setNombre(nombre);
        nota.setDescripcion(descripcion);
        nota.setPorcentaje(porcentaje);
        return nota;


    }
}
