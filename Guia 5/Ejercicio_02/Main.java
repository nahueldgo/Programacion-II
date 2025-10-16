
package Ejercicio_02;

public class Main {
    
    public static void main(String[] args){
        
        Bateria bateria = new Bateria("Bateria de litio", 99);
        Celular celular = new Celular(123456, "Samsung", "S23+", bateria);
        Usuario usuario = new Usuario("Nahuel Dugo", 36617276);

        usuario.setCelular(celular);
        
        celular.mostrarInfo();
        bateria.mostrarInfo();
        usuario.mostrarInfo();

    }
}
