package modelo;

public class Ave extends Animal implements Volador {

    @Override
    public void hacerRuido() {
        System.out.println("Hago ruido de ave");
    }

    @Override
    public void comer() {
        System.out.println("Como como ave");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo como ave");
    }

    public void volar(){
        System.out.println("Estoy volando");
    }
}
