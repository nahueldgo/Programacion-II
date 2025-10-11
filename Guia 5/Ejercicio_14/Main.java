
package Ejercicio_14;

public class Main {
    
    public static void main(String[] args){
        
        EditorVideo editorVideo = new EditorVideo();
        Proyecto proyecto = new Proyecto("La vida de Leyla", 26);
        
        editorVideo.exportar("MP4", proyecto);
        
    }
    
}
