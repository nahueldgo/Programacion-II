/*
Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
Muestra los resultados en la consola.
*/

package tp1.introduccion.a.java;

import java.util.Scanner;


public class Ejercicio_05 {

    
    public static void main(String[] args) {
        Scanner scan_nuevo = new Scanner (System.in);
        
        int numero1, numero2, suma, resta, multiplicacion;
        double division;
        
        System.out.println("Ingrese un numero entero: ");
        numero1 = scan_nuevo.nextInt();
        
        System.out.println("Ingrese otro numero entero: ");
        numero2 = scan_nuevo.nextInt();
        
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1*numero2;
        division = (double) numero1/numero2;
        
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multiplicacion);
        System.out.printf("Division: %.2f%n", division);
        
       
    }
    
}