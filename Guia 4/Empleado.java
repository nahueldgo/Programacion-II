package tp.pkg4.poo;

public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    public Empleado (int id, String nombre, String puesto, double salario){
        
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
       
    }

    public Empleado (String nombre, String puesto){
        
        this.id = totalEmpleados+1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 200000;
        totalEmpleados++;
        
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    public void actualizarSalario(double porcentaje){
        salario = salario + (salario * (porcentaje/100));
    }
    
    public void actualizarSalario(int aumento){
        salario = salario + aumento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
 
}