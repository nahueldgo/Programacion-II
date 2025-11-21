
package Caso_Practico_02;

public class Main {
    
    public static void main(String[] args) {
        
        Figura[] figuras = new Figura[3];
        
        figuras[0] = new Circulo("Circulo 1", 5);
        figuras[1] = new Rectangulo("Rectangulo 1", 4, 6);
        figuras[2] = new Circulo("Circulo 2", 2.5);

        System.out.println("Areas de las figuras");

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " = Area: " + f.calcularArea());
        }
    }
}
