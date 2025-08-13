/*
Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos.
*/


package tp1.introduccion.a.java;

import java.util.Scanner;


public class Ejercicio_04 {

    
    public static void main(String[] args) {
        Scanner nuevo_scan = new Scanner (System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = nuevo_scan.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = nuevo_scan.nextInt();
        
        System.out.println("Tu nombre es " + nombre + ", y tu edad es " + edad + " años.");
        
    }
    
}