// 1. Verificación de Año Bisiesto.
// Escribe un programa en Java que solicite al usuario un año y determine si es
// bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, 
// salvo que sea divisible por 400.

package tp.pkg2.programacion.estructurada;

import java.util.Scanner;


public class  Ejercicio_01 {

      
        public static void main(String[] args) {
            
            Scanner scann = new Scanner(System.in);
            System.out.println("Ingrese un año: ");
            int anio = scann.nextInt();
           
            if((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0))
                System.out.println("El año ingresado es bisiesto");
            else{
                System.out.println("El año no es bisiesto");
            }
        }
    }

 