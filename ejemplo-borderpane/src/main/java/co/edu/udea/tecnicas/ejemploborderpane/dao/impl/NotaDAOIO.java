package co.edu.udea.tecnicas.ejemploborderpane.dao.impl;

import co.edu.udea.tecnicas.ejemploborderpane.dao.NotaDAO;
import co.edu.udea.tecnicas.ejemploborderpane.model.Nota;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NotaDAOIO implements NotaDAO {
    private File notasDB;

    public NotaDAOIO() {
        System.out.println("Inicializando la base de datos de notas en disco con IO");
        // Inicializar la base de datos de notas
        this.notasDB = new File("notas");
        if (!notasDB.exists()) {
            try {
                notasDB.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void guardarNota(Nota nota) {
        String notaString = nota.getNombre() + "," + nota.getDescripcion() + "," + nota.getPorcentaje() + "\n";
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(notasDB, true);
            bw = new BufferedWriter(fw);
            bw.write(notaString);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Nota> obtenerNotas() {
        List<Nota> resultado = new ArrayList<>();
        try {
            FileReader fr = new FileReader(notasDB);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                Nota nota = transformarNotaString(linea);
                resultado.add(nota);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    private Nota transformarNotaString(String linea) {
        String[] partes = linea.split(",");
        return new Nota(partes[0], partes[1], Float.parseFloat(partes[2]));
    }
}
