
package Main;

import Ecommerce.*;
import Excepciones.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -----------------------
        // PARTE 1: E-COMMERCE
        // -----------------------
        System.out.println("SISTEMA DE E-COMMERCE");

        Cliente cliente = new Cliente("Nahuel");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 12000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalDescuento = tarjeta.aplicarDescuento(total);

        tarjeta.procesarPago(totalDescuento);

        System.out.println("Cambiando estado del pedido...");
        pedido.cambiarEstado("ENVIADO");


        // -----------------------
        // PARTE 2: EXCEPCIONES
        // -----------------------
        System.out.println("\nEJERCICIOS DE EXCEPCIONES");

        // 1. División segura
        System.out.println("\n1) Division segura");
        try {
            int a = 10;
            int b = 0;
            int res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero.");
        }

        // 2. Conversión cadena a número
        System.out.println("\n2) Conversion cadena a numero");

        try {
            String texto = "12x";
            int numero = Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("No es un numero valido.");
        }

        // 3. Lectura de archivo
        System.out.println("\n3) Lectura de archivo");

        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo_inexistente.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        }

        // 4. Excepción personalizada
        System.out.println("\n4) Excepción personalizada: Edad invalida");

        try {
            ValidadorEdad.validar(150);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 5. Try-with-resources
        System.out.println("\n5) Try-with-resources");

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo.");
        }

        System.out.println("\nFIN DEL PROGRAMA");
    }
}