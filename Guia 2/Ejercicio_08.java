// 8. Cálculo del Precio Final con impuesto y descuento.
// Crea un método calcularPrecioFinal(double impuesto, double descuento)
// que calcule el precio final de un producto en un e-commerce.
//
// La fórmula es:
//
// PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
// PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
//
// Desde main(), solicita el precio base del producto, 
// el porcentaje de impuesto y el porcentaje de descuento,
// llama al método y muestra el precio final.


package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_08 {
    
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase){

        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal; 
    
    }
    
    public static void main(String[] args) {
    
        double precio = 0;
        double impuesto = 0;
        double descuento = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio base del producto: ");
        precio = scanner.nextDouble();
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = scanner.nextDouble();
        double impuesto_decimal = impuesto / 100.0;
        
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = scanner.nextDouble();
        double descuento_decimal = descuento / 100.0;
        
        double precioFinalCalculado = calcularPrecioFinal(impuesto_decimal, descuento_decimal, precio);
        
        System.out.println("El precio final del producto es: "+precioFinalCalculado);
    }

}