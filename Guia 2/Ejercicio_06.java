// 6. Contador de Positivos, Negativos y Ceros (for).
// Escribe un programa que pida al usuario ingresar 10 números enteros
// y cuente cuántos son positivos, negativos y cuántos son ceros.


package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_06 {
    
        public static void main(String[] args) {
            
            int contador_pos = 0;
            int contador_neg = 0;
            int contador_ceros = 0;
                  
            
            System.out.println("Ingrese 5 numeros enteros: ");
            Scanner scan = new Scanner(System.in);
            
            for(int i=0;i<10;i++){
            
            int num = scan.nextInt();
            
            if(num>0){
                contador_pos++;
            }
            else if(num==0){
                contador_ceros++;
            } else{
                contador_neg++;
            }
            
            }
            
            System.out.println("Numeros positivos: "+contador_pos);
            System.out.println("Numeros negativos: "+contador_neg);
            System.out.println("Cantidad de ceros: "+contador_ceros);
     }   
       
}
