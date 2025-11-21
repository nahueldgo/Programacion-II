
package Caso_Practico_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Laura", 250000));
        empleados.add(new EmpleadoTemporal("Carlos", 120, 1500));
        empleados.add(new EmpleadoPlanta("Sofia", 300000));
        empleados.add(new EmpleadoTemporal("Nahuel", 80, 2000));

        System.out.println("ueldos de empleados");

        for (Empleado e : empleados) {
            System.out.println(
                e.getNombre() + " = Sueldo: $" + e.calcularSueldo()
            );

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }

            System.out.println("-------------------------------");
        }
    }
}
