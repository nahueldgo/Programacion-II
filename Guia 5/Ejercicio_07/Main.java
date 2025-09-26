
package Ejercicio_07;

public class Main {
    
    public static void main(String[] args){
        
        Vehiculo vehiculo = new Vehiculo("ABC987", "Fiat Palio");
        Motor motor = new Motor("Diesel 2.0", 987654);
        Conductor conductor = new Conductor("Nahuel Dugo", 654987);
        
        vehiculo.setMotor(motor);
        vehiculo.setConductor(conductor);
        conductor.setVehiculo(vehiculo);
        
        vehiculo.mostrarInfo();
        motor.mostrarInfo();
        conductor.mostrarInfo();
        
    }
    
}
