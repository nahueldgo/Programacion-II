
package Ejercicio_10;

public class Titular {
 
    private String nombre;
    private int dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, int dni) {
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

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre del titular: "+nombre);
        System.out.println("DNI: "+dni);
    }
    
}
