
package Caso_Practico_04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Misu"));
        animales.add(new Vaca("Lola"));

        System.out.println("Sonidos de los animales");

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("--------------------------------");
        }
    }
}
