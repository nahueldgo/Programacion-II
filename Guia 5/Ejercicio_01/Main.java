
package Ejercicio_01;

public class Main {
    
    public static void main(String[] args){
        
        Pasaporte pasaporte = new Pasaporte(123456789, "1/1/2018", "3x3", "JPEG");
        Titular titular = new Titular("Nahuel Dugo", 36617276);
        
        
        pasaporte.setTitular(titular);
        titular.setPasaporte(pasaporte);
        pasaporte.mostrarInfo();
        titular.mostrarInfo();
    
    }
}

 