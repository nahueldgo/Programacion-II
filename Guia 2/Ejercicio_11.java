// 11. Cálculo de descuento especial usando variable global.
//
// Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
// método calcularDescuentoEspecial(double precio) que use la variable global para
// calcular el descuento especial del 10%.
//
// Dentro del método, declara una variable local descuentoAplicado,
// almacena el valor del descuento y muestra el precio final con descuento.

package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_11 {
    
    public static double entrada_salida = 0.10;
    
    public static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * entrada_salida;
        double precioFinalConDescuento = precio - descuentoAplicado;
        return precioFinalConDescuento;
    }
   
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      
        System.out.println("Ingrese el precio del producto: ");
        double precio_producto = scanner.nextDouble();
        
        System.out.println("El descuento especial aplicado es: "+entrada_salida);
        
        double precio_final = calcularDescuentoEspecial(precio_producto);
        System.out.println("El precio final con descuento es: "+precio_final);
    }
}