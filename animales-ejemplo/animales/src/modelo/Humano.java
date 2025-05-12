package modelo;

public class Humano extends Animal implements Volador{
    @Override
    public void hacerRuido() {
        System.out.printf("Bla bla bla");
    }

    @Override
    public void comer() {
        System.out.println("Como como humano");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo como humano");
    }

    public void trabajar(){
        System.out.println("Trabajo como animal");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo en avión");
    }
}
