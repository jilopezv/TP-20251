public class Principal {


    public static void main(String[] args) {
        int a = 5;

        Integer i = 45;
        int valorConvertidoConObjeto = i.parseInt("28"); // invocación de metodo estático usando instancia (no recomendada)
        int valorConvertidoConClase =Integer.parseInt("33"); //invocación de metodo estático usando la clase

        System.out.println(a);
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("1234567890","Juan", 25);
        System.out.println(persona1);

        // Asignar valores a los atributos del objeto persona1
        /*persona1.setIdentificacion("1234567890");
        persona1.setNombres("Juan");
        persona1.setEdad(25);*/

        // Llamar a los métodos del objeto persona1
        persona1.presentarse();
        persona1.trabajar();
        persona1.caminar();


        // Crear un objeto de la clase Persona
        Persona persona2 = new Persona("9876543210", "Ana");
        System.out.println(persona2);

        // Asignar valores a los atributos del objeto persona2
        /*persona2.setIdentificacion("9876543210");
        persona2.setNombres("Ana");
        persona2.setEdad(30);*/
        // Llamar a los métodos del objeto persona2
        persona2.presentarse();
        persona2.trabajar();
        persona2.caminar();

    }
}
