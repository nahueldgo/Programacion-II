
package Ejercicio_14;

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
    Render render = new Render(formato, proyecto);
    System.out.println("Proyecto: " + proyecto.getNombre() + ", Duracion: " + proyecto.getDuracionMin() + " min, Formato: " + render.getFormato());
    
    }
    
}
