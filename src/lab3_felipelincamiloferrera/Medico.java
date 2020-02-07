package lab3_felipelincamiloferrera;

public class Medico {

    protected String colegio;

    public Medico(String colegio) {
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
