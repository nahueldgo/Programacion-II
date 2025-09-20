// 3. Encapsulamiento con la Clase Libro
//
// Crear una clase Libro con atributos privados:
// titulo, autor, añoPublicacion.
//
// Métodos requeridos: Getters para todos los atributos.
// Setter con validación para añoPublicacion.

package tp.pkg3.introduccion.a.poo;


public class Libros {

    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libros(String nombreTitulo, String nombreAutor, int añoDePublicacion) {
        this.titulo = nombreTitulo;
        this.autor = nombreAutor;
        setAñoPublicacion(añoDePublicacion);
    }

    public void mostrarInfo() {
        System.out.println("Informacion del libro");
        System.out.println("Nombre: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025) {
            this.añoPublicacion = año;
        } else {
            System.out.println("Año de publicacion invalido");
        }
    }

    public static void main(String[] args) {
        Libros miLibro = new Libros("Los arboles mueren de pie", "Alejandro Casona", 2026);
        miLibro.setAñoPublicacion(1949);
        miLibro.mostrarInfo();
    }
}




  