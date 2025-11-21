
package Caso_Practico_03;

public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {

        if (profesor != null) {
            if (profesor.getCursos().contains(this)) {
                profesor.getCursos().remove(this);
            }
        }
        
        profesor = p;

        if (p != null) {
            if (!p.getCursos().contains(this)) {
                p.getCursos().add(this);
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: (sin asignar)");
        }
        System.out.println("-------------------------------------------");
    }
}