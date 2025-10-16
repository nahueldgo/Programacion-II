
package Ejercicio_03;

public class Libro {
    
    private String titulo;
    private int isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, int isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo:"+titulo);
        System.out.println("ISBN: "+isbn);
        if (autor != null) {
        autor.mostrarInfo();
    }
    
    if (editorial != null) {
        editorial.mostrarInfo();
    }
    }
    
}
