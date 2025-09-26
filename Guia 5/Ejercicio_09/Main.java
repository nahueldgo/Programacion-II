
package Ejercicio_09;

public class Main {
    
    public static void main(String[] args){
        
        CitaMedica citaMedica = new CitaMedica("12/10/2025", "10:00Hs");
        Paciente paciente = new Paciente("Nahuel Dugo", "IOMA");
        Profesional profesional = new Profesional("Leyla", "Cardiologia");
        
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        
        citaMedica.mostrarInfo();
        paciente.mostrarInfo();
        profesional.mostrarInfo();
        
    }
    
}
