
package Ejercicio_04;

public class Cliente {
    
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, int dni) {
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

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println("DNI: "+dni);
    }
    
}
