
package Excepciones;

public class ValidadorEdad {

    public static void validar(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: " + edad);
        }
        System.out.println("Edad valida.");
    }
}