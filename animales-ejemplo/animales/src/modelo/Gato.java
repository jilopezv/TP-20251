package modelo;

public class Gato extends Animal {

    // Constructor por defecto
    public Gato() {
        super.nombre = "Gato por defecto";
    }

    // Constructor con parámetro (sobrecarga)
    public Gato(String nombre) {
        super.nombre = nombre;
    }

    @Override
    public void hacerRuido() { // Sobreescribo el metodo hacerRuido
        // super.hacerRuido();
        System.out.println("Miau");
    }

    @Override
    public void comer() {
        System.out.println("Como como gato");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo como gato");
    }
}
