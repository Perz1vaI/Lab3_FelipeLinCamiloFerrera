package lab3_felipelincamiloferrera;

public class Medico extends Persona {

    protected String colegio;

   

    public Medico(String colegio, String nombre, String apellido, int añosP, int salario) {
        super(nombre, apellido, añosP, salario);
        this.colegio = colegio;
    }
    

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Medico{" + "colegio=" + colegio + '}';
    }

}
