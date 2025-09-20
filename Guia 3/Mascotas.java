// 2. Registro de Mascotas
//
// Crear una clase Mascota con los atributos: nombre, especie, edad.
//
// Métodos requeridos: mostrarInfo(), cumplirAnios().
//
// Crear una mascota, mostrar su información, simular el paso 
// el tiempo y verificar los cambios.

package tp.pkg3.introduccion.a.poo;


public class Mascotas {

    private String nombre;
    private String especie;
    private int edad;
    
    public Mascotas(String nombreMascota, String especieMascota, int edadMascota){
        this.nombre = nombreMascota;
        this.especie = especieMascota;
        this.edad = edadMascota;
    }
    
public void mostrarInfo(){
    System.out.println("Informacion de la mascota");
    System.out.println("Nombre: "+nombre);
    System.out.println("Especie: "+especie);
    System.out.println("Edad: "+edad);
    System.out.println("\n");
}
    
public void cumplirAnios(int edadMascota){
    edad += edadMascota;
}

    public static void main(String[] args) {
           Mascotas miMascota = new Mascotas("Leyla", "Caniche", 15);
           
           miMascota.mostrarInfo();
           miMascota.cumplirAnios(1);
           miMascota.mostrarInfo();
    }
    
}
