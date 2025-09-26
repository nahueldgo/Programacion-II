
package Ejercicio_10;

public class ClaveSeguridad {
 
    private int codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(int codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("Clave de seguridad: "+codigo);
        System.out.println("Ultima modificacion: "+ultimaModificacion);
    }
    
}
