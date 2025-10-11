
package Ejercicio_12;

public class Main {
    
    public static void main(String[] args){
        
        Calculadora calculadora = new Calculadora();
        Impuesto impuesto = new Impuesto(5000.99);
        Contribuyente contribuyente = new Contribuyente("Nahuel Dugo", 233661727);
        
        contribuyente.mostrarInfo();
        calculadora.calcular(impuesto);
        
    }
    
}
