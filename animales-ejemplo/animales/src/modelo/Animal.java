package modelo;

public abstract class Animal {
    protected String nombre;

    public abstract void hacerRuido();

    public abstract void comer();

    public abstract void dormir();

    public void mostrarNombre() {
        System.out.println("El nombre del animal es: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() { //este metodo se sobreescribe desde la clase Object
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
