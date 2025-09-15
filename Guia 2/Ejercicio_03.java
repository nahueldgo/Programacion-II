// 3. Clasificación de Edad.
// Escribe un programa en Java que solicite al usuario su edad 
// y clasifique su etapa de vida según la siguiente tabla:

// •Menor de 12 años: "Niño"
// •Entre 12 y 17 años: "Adolescente"
// •Entre 18 y 59 años: "Adulto"
// •años o más: "Adulto mayor"

package tp.pkg2.programacion.estructurada;

import java.util.Scanner;

public class Ejercicio_03 {
    
    public static void main(String[] args) {
        Scanner clasificacion = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = clasificacion.nextInt();
        
        if (edad<12)
            System.out.println("Eres un Niño");
        else if(edad<=17)
            System.out.println("Eres un Adolescente");
        else if(edad<=59)
            System.out.println("Eres un Adulto");
        else{
            System.out.println("Eres un Adulto mayor");
        }
        clasificacion.close();
    }
    
}
