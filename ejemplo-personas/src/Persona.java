public class Persona {
    // Atributos
    private String identificacion;
    private String nombres;
    private int edad;
    public static int contadorPersonas = 0;

    /*public Persona () { //no se permiten personas sin datos
        contadorPersonas++;
    }*/

    // sobrecarga de métodos (constructores)
    public Persona(String identificacion, String nombres, int edad) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.edad = edad;
        contadorPersonas++;
    }

    public Persona(String identificacion, String nombres) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.edad = 18; // Asignar un valor por defecto a la edad
        contadorPersonas++;
    }

    // Métodos
    public void presentarse() {
        System.out.println("Hola, soy " + nombres + " y tengo "
                + edad + " años y mi identificación es: "
                + identificacion + "y soy la creación número: "
                + contadorPersonas);
    }

    public void trabajar() {
        System.out.println("Estoy trabajando");
    }

    public void caminar() {
        System.out.println("Estoy caminando");
    }

    // getters y setters
    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        //Validamos que el valor de la identificación sea correcto
        if (identificacion == null) {
            System.out.println("Error: La identificación no puede ser nula.");
            return;
        }
        if (identificacion.length() < 10 || identificacion.length() > 20) {
            System.out.println("Error: La identificación debe tener entre 10 y 20 caracteres.");
            return;
        }
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
