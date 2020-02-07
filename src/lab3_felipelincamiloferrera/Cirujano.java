package lab3_felipelincamiloferrera;

public class Cirujano extends Medico {

    private int NumeroDeCirugias;

    public Cirujano(int NumeroDeCirugias, String colegio, String nombre, String apellido, int añosP, int salario) {
        super(colegio, nombre, apellido, añosP, salario);
        this.NumeroDeCirugias = NumeroDeCirugias;
    }

    public int getNumeroDeCirugias() {
        return NumeroDeCirugias;
    }

    public void setNumeroDeCirugias(int NumeroDeCirugias) {
        this.NumeroDeCirugias = NumeroDeCirugias;
    }

    @Override
    public String toString() {
        return "Cirujano{" + "NumeroDeCirugias=" + NumeroDeCirugias + '}';
    }

}
