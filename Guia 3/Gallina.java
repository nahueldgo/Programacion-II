// 4. Gestión de Gallinas en Granja Digital
//
// Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
//
// Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
//
// Crear dos gallinas, simular sus acciones (envejecer y poner huevos),
// y mostrar su estado.

package tp.pkg3.introduccion.a.poo;


public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina (int id_gallina, int edad_gallina, int huevos){
        this.idGallina = id_gallina;
        this.edad = edad_gallina;
        this.huevosPuestos = huevos;
    }
    
    public void ponerHuevo(){
        huevosPuestos ++;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("Informacion de la granja");
        System.out.println("ID Gallina : "+idGallina);
        System.out.println("Edad: "+edad);
        System.out.println("Huevos puestos: "+huevosPuestos);
        System.out.println("\n--------------------------");
        System.out.println("");
    }
        
    public static void main(String[] args) {

        Gallina gallina1 = new Gallina(208, 3, 2);
        gallina1.mostrarEstado();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        
        Gallina gallina2 = new Gallina(122, 6, 3);
        gallina2.mostrarEstado();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.mostrarEstado();
        
    }
}