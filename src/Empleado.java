public class Empleado {
    private String DNI;
    private String nombre;
    private String apellido;
    private double salario;
    private double salarioAnual;
    public Empleado(String DNI, String nombre, String apellido, double salario){
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
        this.salarioAnual=salario*12;
    }
    public Empleado(){
        String DNI=new String();
        String nombre=new String();
        String apellido=new String();
        double salario=0;
        double salarioAnual=0;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                ", salarioAnual=" + salarioAnual +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setSalarioAumentado(double n){
        double aumento = salario * (n / 100);
        salario = salario + aumento;
        salarioAnual=salario*12;
    }
}
