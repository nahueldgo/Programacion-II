// 13. Impresión recursiva de arrays antes y después de modificar un elemento.
//
// Crea un programa que:
// 
// a. Declare e inicialice un array con los precios de algunos productos.
// b. Use una función recursiva para mostrar los precios originales.
// c. Modifique el precio de un producto específico.
// d. Use otra función recursiva para mostrar los valores modificados.

package tp.pkg2.programacion.estructurada;

public class Ejercicio_13 {
        
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        
        System.out.println("Precio: $" + precios[indice]);
        imprimirPrecios(precios, indice + 1);
    }
    
    public static void main(String[] args) {
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);
        
        precios[2] = 129.99;
                
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0);
    } 
}
