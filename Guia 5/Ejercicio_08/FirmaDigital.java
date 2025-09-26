
package Ejercicio_08;

public class FirmaDigital {
    
    private int codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(int codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    public int getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(int codigoHash) {
        this.codigoHash = codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void mostrarInfo(){
        System.out.println("Codigo Hash: "+codigoHash);
        System.out.println("Fecha: "+fecha);
    }
    
}
