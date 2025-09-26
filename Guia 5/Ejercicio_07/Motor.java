
package Ejercicio_07;

public class Motor {
    
    private String tipo;
    private int numeroSerie;

    public Motor(String tipo, int numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public void mostrarInfo(){
        System.out.println("Tipo de motor: "+tipo);
        System.out.println("Numero de serie: "+numeroSerie);
    }
    
}
