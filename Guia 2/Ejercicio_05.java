// 5. Suma de Números Pares (while).
// Escribe un programa que solicite números al usuario y sume solo los
// números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0
// momento en el que se debe mostrar la suma total de los pares ingresados.

package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_05 {
    
    public static void main(String[] args) {
        
        
        int contador = 0;
        
        System.out.println("Ingrese un numero entero positivo: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        while (num!=0){
            if(num % 2 == 0){
                contador=contador+num;
            }
        
        System.out.println("Siga ingresando numeros, el programa se detendra cuando ingrese '0': ");
        num = scan.nextInt();
       } 
        System.out.println("La suma de los numeros pares ingresador es "+contador);

    }
        
}
