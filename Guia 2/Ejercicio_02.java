// 2. Determinar el Mayor de Tres Números.
// Escribe un programa en Java que pida al usuario tres números enteros y
// determine cuál es el mayor.

package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_02 {
             
    public static void main(String[] args) {

    Scanner scann = new Scanner(System.in);
    System.out.println("Ingrese 3 numeros enteros: ");
    int num1 = scann.nextInt();
    int num2 = scann.nextInt();
    int num3 = scann.nextInt();   
    
    if (num1>=num2 && num1>=num3)
            System.out.println("El mayor es: "+num1);
    else if(num2>=num1 && num2>=num3){
            System.out.println("El mayor es: "+num2);
    }
    else{
        System.out.println("El mayor es: "+num3);
        }
    }
}
