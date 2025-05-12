import modelo.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class Principal {

    public static void main(String[] args) {
        /*Animal a = new Animal(); no se puede instanciar un objeto de tipo Animal porque es una clase abstracta
        System.out.println(a);
        a.setNombre("Animal uno");*/
        //a.nombre = "modelo.Animal uno"; //inválido, nombre es protected en modelo.Animal

        // lo opuesto a una clase abstracta es una clase concreta
        Animal perro = new Perro();
        System.out.println(perro);
        perro.setNombre("Perro uno");
        perro.comer();
        perro.hacerRuido();
        perro.dormir();

        // perro.pasear(); no se puede llamar a pasear() porque perro es de tipo Animal
        // perro.nombre = "modelo.Perro uno"; inválido, nombre es protected en modelo.Animal

        Perro perroConvertido = (Perro) perro; //top down casting
        perroConvertido.pasear(); //ahora si se puede llamar a pasear() porque perroConvertido es de tipo Perro

        Animal g = new Gato("Gato uno");
        System.out.println(g);
        g.comer();
        g.hacerRuido();
        g.dormir();

        Animal perroReconvertido = perroConvertido; //bottom up casting
        // perroReconvertido.pasear(); no se puede llamar a pasear() porque perroReconvertido es de tipo Animal

        // Object o = a; //bottom up casting Object es la clase madre de todas las clases

        //Perro perro2 = new Animal(); no se puede instanciar un objeto de tipo Animal y asignarlo a una variable de tipo Perro

        // Volador v = new Volador(); // no se puede instanciar un objeto de tipo Volador porque es una interfaz

        // Volador v = new Gato(); // no se puede instanciar un objeto de tipo Gato porque no implementa la interfaz Volador

        Volador v = new Ave();
        v.volar();
        // v.dormir(); // no se puede llamar a dormir() porque v es de tipo Volador


        List<Animal> animales = new ListaPropia();
        animales.add(new Perro("Perro dos"));
        animales.add(new Gato("Gato dos"));
        animales.add(new Ave());
        animales.add(new Perro("Perro tres"));
        animales.add(new Humano());
        animales.add(new Gato("Gato cuatro"));

        System.out.println("ANIMALES");
        /*for (Animal a : animales) {
            a.hacerRuido();
            a.comer();
            a.dormir();
            if (a instanceof Volador) {
                Volador volador = (Volador) a; //top down casting
                volador.volar();
            }
        }*/

        for(Animal a: animales){
            if(a instanceof Volador){
                Volador volador = (Volador) a; //top down casting
                volador.volar();
            }
        }


    }
}
