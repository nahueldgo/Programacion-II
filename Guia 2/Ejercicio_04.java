// 4. Calculadora de Descuento según categoría.
// Escribe un programa que solicite al usuario el precio de un producto
// y su categoría (A, B o C).
//
// Luego, aplique los siguientes descuentos:
//
// Categoría A: 10% de descuento
// Categoría B: 15% de descuento
// Categoría C: 20% de descuento
//
// El programa debe mostrar el precio original, el descuento aplicado 
// y el precio final


package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_04 {
        
   public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese el precio del producto: ");
       double precio = scanner.nextDouble();
       
       double precio_final = 0;
      
       
       System.out.println("Ingrese la categoria del producto (A, B o C): ");
       String categoria = scanner.next();
       
       if (categoria.equalsIgnoreCase("A")){
       double descuento = precio * 0.10;
       precio_final = precio - descuento;
       System.out.println("Precio inicial: "+precio);
       System.out.println("Descuento aplicado: 10%");
       System.out.println("Precio final: "+precio_final);
       
       
       } else if (categoria.equalsIgnoreCase("B")){
       double descuento = precio * 0.15;
       precio_final = precio - descuento;
       System.out.println("Precio inicial: "+precio);
       System.out.println("Descuento aplicado: 15%");
       System.out.println("Precio final: "+precio_final);
       }
       
       else if (categoria.equalsIgnoreCase("C")){
       double descuento = precio * 0.20;
       precio_final = precio - descuento;
       System.out.println("Precio inicial: "+precio);
       System.out.println("Descuento aplicado: 20%");
       System.out.println("Precio final: "+precio_final);
       }  
    }
 }
  
   
   
   
       
   
   
