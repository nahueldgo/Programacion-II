
package Ejercicio_05;

public class Propietario {
    
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String propietario) {
        this.nombre = propietario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre del propietario: "+nombre);
        System.out.println("DNI: "+dni);
    }
    
}
