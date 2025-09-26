
package Ejercicio_02;

public class Main {
    
    public static void main(String[] args){
        
        Bateria bateria = new Bateria("Bateria de litio", 99);
        Celular celular = new Celular(987654, "Samsung", "S23+");
        Usuario usuario = new Usuario("Nahuel Dugo", 36617276);
        
        celular.setBateria(bateria);
        celular.setUsuario(usuario);
        usuario.setCelular(celular);
        
        
        celular.mostrarInfo();
        bateria.mostrarInfo();
        usuario.mostrarInfo();

    }
}
