
package Caso_Practico_03;

public class Main {
    
    public static void main(String[] args) {
        
        Profesor p1 = new Profesor("P01", "Laura Gomez", "Matematica");
        Profesor p2 = new Profesor("P02", "Daniel Perez", "Programacion");
        Profesor p3 = new Profesor("P03", "Carla Gonzalez", "Fisica");
        
        Curso c1 = new Curso("C001", "Programacion I");
        Curso c2 = new Curso("C002", "Algebra");
        Curso c3 = new Curso("C003", "Fisica I");
        Curso c4 = new Curso("C004", "Estructura de Datos");
        Curso c5 = new Curso("C005", "Analisis Matemático");
        
        Universidad univ = new Universidad("UTN");
        
        univ.agregarProfesor(p1);
        univ.agregarProfesor(p2);
        univ.agregarProfesor(p3);

        univ.agregarCurso(c1);
        univ.agregarCurso(c2);
        univ.agregarCurso(c3);
        univ.agregarCurso(c4);
        univ.agregarCurso(c5);

        univ.asignarProfesorACurso("C001", "P02");
        univ.asignarProfesorACurso("C004", "P02");
        univ.asignarProfesorACurso("C002", "P01");
        univ.asignarProfesorACurso("C005", "P01");
        univ.asignarProfesorACurso("C003", "P03");
        
        System.out.println("==== LISTA DE CURSOS ====");
        univ.listarCursos();

        System.out.println("==== LISTA DE PROFESORES ====");
        univ.listarProfesores();

        System.out.println("==== CAMBIO DE PROFESOR DE C004 ====");
        univ.asignarProfesorACurso("C004", "P01");

        univ.listarProfesores();

        System.out.println("==== ELIMINAR CURSO C005 ====");
        univ.eliminarCurso("C005");

        System.out.println("==== PROFESORES TRAS ELIMINAR CURSO ====");
        univ.listarProfesores();

        System.out.println("==== ELIMINAR PROFESOR P02 ====");
        univ.eliminarProfesor("P02");

        System.out.println("==== LISTA DE CURSOS TRAS ELIMINAR PROFESOR ====");
        univ.listarCursos();

        System.out.println("==== REPORTE FINAL ====");
        for (Profesor p : univ.buscarTodosLosProfesores()) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
}