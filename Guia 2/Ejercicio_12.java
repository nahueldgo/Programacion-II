// 12. Modificación de un array de precios y visualización de resultados.
//
// Crea un programa que:
// 
// a. Declare e inicialice un array con los precios de algunos productos.
// b. Muestre los valores originales de los precios.
// c. Modifique el precio de un producto específico.
// d. Muestre los valores modificados.

package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_12 {
    
    public static void main(String[] args) {
        
        double[] precios = new double[5];
        
        precios[0] = 199.99;
        precios[1] = 299.5;
        precios[2] = 149.75;
        precios[3] = 399.99;
        precios[4] = 89.99;
        
        System.out.println("Precios originales:");
        
        for(double precio : precios){
            System.out.println(precio);
        }
        
        System.out.println("\nPrecios modificados:");
        
        precios[2] = 129.99;
        System.out.println(precios[2]);
       
        }
        
        
}

