// 1. Registro de Estudiantes
//
// Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
// Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
//
// Instanciar a un estudiante, mostrar su información, 
// aumentar y disminuir calificaciones.

package tp.pkg3.introduccion.a.poo;

public class Estudiantes {
    
    private String nombre; 
    private String apellido;
    private int curso;
    private double calificacion;

    public Estudiantes(String nombreEstudiante, String apellidoEstudiante, int cursoEstudiante, double calificacionEstudiante){

    this.nombre = nombreEstudiante;
    this.apellido = apellidoEstudiante;
    this.curso = cursoEstudiante;
    this.calificacion = calificacionEstudiante; 
        
    }
    public void mostrarInfo(){
        System.out.println("Informacion");
        System.out.println("\nNombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("Calificacion: "+calificacion);
    }
    
    public void subirCalificacion(double puntos) {
    calificacion += puntos;
}

    public void bajarCalificacion(double puntos) {
    calificacion -= puntos;
}

    public static void main(String[] args) {
        
      Estudiantes miEstudiante = new Estudiantes("Nahuel", "Dugo", 3, 7.50);
      
      miEstudiante.mostrarInfo();
      miEstudiante.subirCalificacion(1.5);
      miEstudiante.mostrarInfo();
      miEstudiante.bajarCalificacion(2);
      miEstudiante.mostrarInfo();
  
    }

}

