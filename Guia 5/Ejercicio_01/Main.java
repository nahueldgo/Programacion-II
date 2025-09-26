
package Ejercicio_01;

public class Main {
    
    public static void main(String[] args){
        
        Foto foto = new Foto("3x3", "Imagen");
        Pasaporte pasaporte = new Pasaporte(123456789, "01/01/2018");
        Titular titular = new Titular("Nahuel Dugo", 36617276);
        
        pasaporte.setFoto(foto);
        titular.setPasaporte(pasaporte);
        pasaporte.setTitular(titular);
        
        pasaporte.mostrarInfo();
        foto.mostrarInfo();
        titular.mostrarInfo();
    
    }
}

