/*
Corrige el siguiente código para que funcione correctamente. Explica qué error
tenía y cómo lo solucionaste.

import java.util.Scanner;
public class ErrorEjemplo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String nombre = scanner.nextInt(); // ERROR
System.out.println("Hola, " + nombre);
}
}

*/
package tp1.introduccion.a.java;

import java.util.Scanner;

public class Ejercicio_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");

        String nombre = scanner.nextLine(); // ERROR = "nombre" es un string, y no un entero (int), "nextInt" fue modificado por "nextLine"

        System.out.println("Hola, " + nombre);

    }
}
