// 5. Simulación de Nave Espacial
// 
// Crear una clase NaveEspacial con los atributos: nombre, combustible.
//
// Métodos requeridos: despegar(), avanzar(distancia),
// recargarCombustible(cantidad), mostrarEstado().
//
// Validar que haya suficiente combustible antes de avanzar
// y evitar que se supere el límite al recargar.
//
// Crear una nave con 50 unidades de combustible.
// intentar avanzar sin recargar, luego recargar 
// y avanzar correctamente. Mostrar el estado al final

package tp.pkg3.introduccion.a.poo;


public class NaveEspacial {
        
    private String nombre;
    private double combustible;
    
    public NaveEspacial(String nombreNave, double combustibleNave){
        this.nombre = nombreNave;
        this.combustible = combustibleNave;
    }
    
    public void despegar(){
        System.out.println("3, 2, 1, despegue!");
    }
    
    public void avanzar(double distancia){
         double combustibleNecesario = distancia * 2;
         if (combustible >= combustibleNecesario){
             combustible -= combustibleNecesario;
             System.out.println("La nave avanzo "+distancia+". Combustible restante: "+combustible );
         } else {
             System.out.println("No hay suficiente combustible para avanzar "+distancia+" unidades de distancia");
         }
             
    }
    
    public void recargarCombustible(double cantidad){
        if (combustible + cantidad <= 100){
            combustible += cantidad;
            System.out.println("Has recargado "+cantidad+ " unidades. Combustible actual: "+combustible);
        } else {
            System.out.println("Error. No se puede recargar "+cantidad+" unidades, se excede el máximo de 100");
        }
}
    
    public void mostrarEstado(){
        System.out.println("Estado de la nave");
        System.out.println("Nombre: "+nombre);
        System.out.println("Combustible: "+combustible);
    }
   
    public static void main(String[] args) {
            
        NaveEspacial miNave = new NaveEspacial("Voyager", 50);
        
        miNave.despegar();
        miNave.avanzar(30);
        miNave.recargarCombustible(40);
        miNave.avanzar(30);
        miNave.mostrarEstado();
    }
    
}