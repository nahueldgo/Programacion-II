// 9. Composición de funciones para calcular costo de envío y total de compra.
//
// a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
// envío basado en la zona de envío (Nacional o Internacional)
// y el peso del paquete.
//
// Nacional: $5 por kg
// Internacional: $10 por kg
//
// b. calcularTotalCompra(double precioProducto, double costoEnvio):
// Usa calcularCostoEnvio para sumar el costo del producto
// con el costo de envío.
//
// Desde main(), solicita el peso del paquete, la zona de envío y el precio
// del producto. Luego, muestra el total a pagar.


package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_09 {
        
    public static double calcularCostoEnvio(double peso, String zona){
    
        if (zona.equalsIgnoreCase("Nacional")) {
    return peso * 5;
    } else if (zona.equalsIgnoreCase("Internacional")) {
    return peso * 10;
    } else {
    return 0;
    }
}
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalCompra = precioProducto + costoEnvio;
        return totalCompra;
    }
    
    public static void main(String[] args) {
    
        double precio = 0;
        double peso = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        
        System.out.println("Ingrese el peso del paquete: ");
        peso = scanner.nextDouble();
        
        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = scanner.next();
        
        double costoEnvioFinal = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envio es: "+costoEnvioFinal);
        
        double costoTotalCompra = calcularTotalCompra(precio, costoEnvioFinal);
        System.out.println("El total a pagar es: "+costoTotalCompra);
        
        scanner.close();
    }

}