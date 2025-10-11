
package Ejercicio_13;

public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario){
        
        CodigoQR codigoQR = new CodigoQR("123456", usuario);
        System.out.println("Codigo QR generado para " + usuario.getNombre() + ": " + valor);
        
                
        
        
    }
    
}
