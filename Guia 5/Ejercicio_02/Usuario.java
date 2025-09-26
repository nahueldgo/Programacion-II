
package Ejercicio_02;

public class Usuario {
    
    private String nombre;
    private int dni;
    private Celular celular;

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre del titular: "+nombre);
        System.out.println("DNI del titular: "+dni);
        
    }

}
