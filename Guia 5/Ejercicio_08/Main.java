
package Ejercicio_08;

public class Main {
    
    public static void main(String[] args){
        
        Documento documento = new Documento("Sr.", "Nombre y Apellido, numero de DNI, Direccion");
        FirmaDigital firmaDigital = new FirmaDigital(654321, "25/5/2025");
        Usuario usuario = new Usuario("Nahuel Dugo", "nahueldgo@gmail.com");
        
        documento.setFirmaDigital(firmaDigital);
        firmaDigital.setUsuario(usuario);
        
        documento.mostrarInfo();
        firmaDigital.mostrarInfo();
        usuario.mostrarInfo();
        
    }
    
}
