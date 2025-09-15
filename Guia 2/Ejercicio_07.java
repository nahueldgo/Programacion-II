// 7. Validación de Nota entre 0 y 10 (do-while).
// Escribe un programa que solicite al usuario una nota entre 0 y 10.
// Si el usuario ingresa un número fuera de este rango,
//
//
//
//

package tp.pkg2.programacion.estructurada;


import java.util.Scanner;

public class Ejercicio_07 {
    
        public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int nota;
                
        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota = scann.nextInt();
            
            if (nota<0 || nota>10){
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            } 
          
        }  
        while(nota<0 || nota>10);
            System.out.println("Nota guardada correctamente.");
    }
}
        
