
package Ejercicio_04;

public class Main {
    
    public static void main(String[] args){
        
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(400567782, "25/11/2028");
        Cliente cliente = new Cliente("Nahuel Dugo", 36617276);
        Banco banco = new Banco("Macro", 88556622);
        
        tarjetaDeCredito.setCliente(cliente);
        tarjetaDeCredito.setBanco(banco);
        cliente.setTarjetaDeCredito(tarjetaDeCredito);
     
        tarjetaDeCredito.mostrarInfo();
        cliente.mostrarInfo();
        banco.mostrarInfo();
    }
    
}
