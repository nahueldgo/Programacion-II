
package Ejercicio_11;

import java.lang.reflect.Array;

public class Main {
    
    public static void main(String[] args){
     
        Reproductor reproductor = new Reproductor();
        Cancion cancion = new Cancion("Where eagles dare");
        Artista artista = new Artista("Iron Maiden", "Heavy metal");
        
        reproductor.reproducir(cancion);
        cancion.setArtista(artista);
        
        artista.mostrarInfo();
        
    }
    
}
