
package Ejercicio_05;

public class Main {
    
    public static void main(String[] args){
        
        Computadora computadora = new Computadora("Alienware", 6549873);
        PlacaMadre placaMadre = new PlacaMadre("Alien99", "AL13N");
        Propietario propietario = new Propietario("Nahuel Dugo", 36617276);
        
        computadora.setPlacaMadre(placaMadre);
        computadora.setPropietario(propietario);
        propietario.setComputadora(computadora);
        
        computadora.mostrarInfo();
        placaMadre.mostrarInfo();
        propietario.mostrarInfo();
        
    }
}
