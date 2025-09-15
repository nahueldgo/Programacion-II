// 10. Actualización de stock a partir de venta y recepción de productos.
//
// Crea un método actualizarStock(int stockActual, int cantidadVendida,
// int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
// de productor:
//
// NuevoStock = StockActual − CantidadVendida + CantidadRecibida
// NuevoStock = CantidadVendida + CantidadRecibida
//
// Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
// cantidad recibida, y muestra el stock actualizado.


package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_10 {
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        int cantidadStockTotal = cantidadVendida + cantidadRecibida;
        return nuevoStock;
        
    }
    
    public static void main(String[] args) {

        int stock = 0;
        int ventas = 0;
        int stockrecibido = 0;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese el stock actual del producto: ");
        stock = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad vendida: ");
        ventas = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad recibida: ");
        stockrecibido = scanner.nextInt();
        
        int stockTotal = actualizarStock(stock, ventas, stockrecibido);
        System.out.println("El stock total es: "+stockTotal);
                
        
    }

}