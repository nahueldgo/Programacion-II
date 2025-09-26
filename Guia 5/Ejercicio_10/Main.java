
package Ejercicio_10;

public class Main {
    
    public static void main(String[] args){
        
        CuentaBancaria cuentaBancaria = new CuentaBancaria(6549870, 950000.00 );
        ClaveSeguridad claveSeguridad = new ClaveSeguridad(9510, "20/9/2025");
        Titular titular = new Titular("Leyla Dugo", 45617842);
        
        cuentaBancaria.setClaveSeguridad(claveSeguridad);
        cuentaBancaria.setTitular(titular);
        titular.setCuentaBancaria(cuentaBancaria);
        
        cuentaBancaria.mostrarInfo();
        claveSeguridad.mostrarInfo();
        titular.mostrarInfo();
        
    }
    
}
