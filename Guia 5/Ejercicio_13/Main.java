
package Ejercicio_13;

public class Main {
    
    public static void main(String[] args){
        
        Usuario usuario = new Usuario("Nahuel Dugo", "nahueldgo@gmail.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("123456", usuario);

    }

}
