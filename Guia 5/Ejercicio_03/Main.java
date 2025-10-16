
package Ejercicio_03;

public class Main {
    
    public static void main(String[] args){
         
        Editorial editorial = new Editorial("Editorial ABC", "Calle Falsa 123");
        Libro libro = new Libro("Cien Años de Soledad", 123456, editorial);
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiana");
        
        libro.setAutor(autor);
        libro.mostrarInfo();

    }   

}