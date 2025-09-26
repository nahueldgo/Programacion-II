
package Ejercicio_03;

public class Main {
    
    public static void main(String[] args){
    
        Libro libro = new Libro("Cien años de soledad", 123456);
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Editorial ABC", "Calle Falsa 123");
        
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        libro.mostrarInfo();
        autor.mostrarInfo();
        editorial.mostrarInfo();
    
        
    }   

}