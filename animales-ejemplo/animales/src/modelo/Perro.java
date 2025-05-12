package modelo;

public class Perro extends Animal {

    // Constructor por defecto
    public Perro() {
        super.nombre = "Perro por defecto";
    }

    // Constructor con parámetro (sobrecarga)
    public Perro(String nombre) {
        super.nombre = nombre;
    }

    public void pasear() {
        System.out.println("Voy a pasear");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }

    @Override
    public void comer() {
        System.out.println("Como como perro");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo como perro");
    }
}
