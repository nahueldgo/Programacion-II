/*
Manejar conversiones de tipo y división en Java.
a. Escribe un programa que divida dos números enteros ingresados por el
usuario.
b. Modifica el código para usar double en lugar de int y compara los
resultados.
*/

package tp1.introduccion.a.java;

import java.util.Scanner;

public class Ejercicio_08_a {

    
    public static void main(String[] args) {
         
        Scanner nuevo_scan = new Scanner (System.in);
        
         int numero1, numero2, division;
        
        System.out.println("Division de dos numeros enteros\n"); 
         
        System.out.println("Ingrese un numero entero: ");
        numero1 = nuevo_scan.nextInt();
        
        System.out.println("Ingrese otro numero entero: ");
        numero2 = nuevo_scan.nextInt();
        
        division = numero1/numero2;
        
        System.out.println("Resultado de la division: "+division);
        
        
    }
    
}
