package lab3_felipelincamiloferrera;

public class Terapeuta extends Medico {

    private int NumeroDeTerapias;

    public Terapeuta(int NumeroDeTerapias, String colegio, String nombre, String apellido, int añosP, int salario) {
        super(colegio, nombre, apellido, añosP, salario);
        this.NumeroDeTerapias = NumeroDeTerapias;
    }

    public int getNumeroDeTerapias() {
        return NumeroDeTerapias;
    }

    public void setNumeroDeTerapias(int NumeroDeTerapias) {
        this.NumeroDeTerapias = NumeroDeTerapias;
    }

    @Override
    public String toString() {
        return "Terapeuta{" + "NumeroDeTerapias=" + NumeroDeTerapias + '}';
    }

}
