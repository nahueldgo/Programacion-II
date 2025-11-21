
package Caso_Practico_02;

public class Main {
    
    public static void main(String[] args) {
        
        //Se crea la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        //Se crean tres autores
        Autor autor1 = new Autor("A01", "Gabriel Garcia Marquez", "Colombiano");
        Autor autor2 = new Autor("A02", "Jorge Luis Borges", "Argentino");
        Autor autor3 = new Autor("A03", "Julio Cortazar", "Argentino");
        
        //Se agregan 5 libros a la biblioteca
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del colera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("ISBN004", "Rayuela", 1963, autor3);
        biblioteca.agregarLibro("ISBN005", "Bestiario", 1951, autor3);
        
        //Se listan todos los libros
        System.out.println("==== LISTADO DE LIBROS ====");
        biblioteca.listarLibros();
        
        //Buscar un libro por ISBN
        System.out.println("==== BUSCAR LIBRO ====");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN004");
        if (buscado != null) {
            System.out.println("Libro encontrado:");
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontro ese libro.");
        }
        
        //Filtrar por año de publicación
        System.out.println("==== LIBROS PUBLICADOS EN 1963 ====");
        biblioteca.filtrarLibrosPorAnio(1963);
        
        //Eliminar un libro por ISBN
        System.out.println("==== ELIMINAR LIBRO ====");
        biblioteca.eliminarLibro("ISBN002");
        
        //Mostrar inventario tras eliminar
        System.out.println("==== INVENTARIO ACTUALIZADO ====");
        biblioteca.listarLibros();
        
        //Mostrar cantidad total de libros
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());
        
        //Mostrar autores disponibles
        System.out.println("==== AUTORES EN LA BIBLIOTECA ====");
        biblioteca.mostrarAutoresDisponibles();
    }
}