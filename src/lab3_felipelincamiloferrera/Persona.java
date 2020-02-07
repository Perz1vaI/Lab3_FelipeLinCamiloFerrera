package lab3_felipelincamiloferrera;

public class Persona {

    protected String nombre, apellido;
    protected int añosP, salario;

    public Persona(String nombre, String apellido, int añosP, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.añosP = añosP;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getAñosP() {
        return añosP;
    }
    public int getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setAñosP(int añosP) {
        this.añosP = añosP;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", a\u00f1osP=" + añosP + ", salario=" + salario + '}';
    }
    
    
}