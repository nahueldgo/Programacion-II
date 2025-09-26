
package Ejercicio_06;

public class Main {
    
    public static void main(String[] args){
        
        Reserva reserva = new Reserva("30/9/2025", "21Hs");
        Cliente cliente = new Cliente("Nahuel Dugo", 155260918);
        Mesa mesa = new Mesa(12, 6);
        
        reserva.setCliente(cliente);
        reserva.setMesa(mesa);
        
        reserva.mostrarInfo();
        cliente.mostrarInfo();
        mesa.mostrarInfo();
        
    }
    
}
