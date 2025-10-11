
package Ejercicio_12;

public class Contribuyente {
    
    private String nombre;
    private int cuil;

    public Contribuyente(String nombre, int cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }
    
    public void mostrarInfo(){
        System.out.println("Contribuyente: "+nombre);
        System.out.println("CUIL: "+cuil);
    }
    
}
