package tp.pkg4.poo;

public class Main {
    
    
    public static void main(String[] args) {
            
            Empleado empleado1 = new Empleado("Nahuel", "Tecnico");
            
            Empleado empleado2 = new Empleado(10, "Leyla", "Manager", 400000);
            
            Empleado empleado3 = new Empleado("Ayelen", "Relaciones humanas");
            
            Empleado empleado4 = new Empleado(8, "Andrea", "Analista", 250000);
            
            System.out.println(empleado1.toString());
            System.out.println(empleado2.toString());
            System.out.println(empleado3.toString());
            System.out.println(empleado4.toString());
            
            empleado1.actualizarSalario(20.0);
            System.out.println(empleado1);
            
            empleado2.actualizarSalario(150000);
            System.out.println(empleado2);
            
            empleado3.actualizarSalario(30.0);
            System.out.println(empleado3);
            
            empleado4.actualizarSalario(50000);
            System.out.println(empleado4);
            
            System.out.println(Empleado.mostrarTotalEmpleados());
            }
            
        }
    


