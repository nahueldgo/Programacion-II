
package Caso_Practico_02;

import java.util.ArrayList;

public class Biblioteca {
    
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
    }

    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro eliminado correctamente:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró un libro con ese ISBN.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        ArrayList<String> autoresMostrados = new ArrayList<>();
        
        System.out.println("Autores disponibles en la biblioteca:");
        
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            
            if (!autoresMostrados.contains(nombreAutor)) {
                autoresMostrados.add(nombreAutor);
                System.out.println("- " + nombreAutor);
            }
        }
    }
}
