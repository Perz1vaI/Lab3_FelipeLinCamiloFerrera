package lab3_felipelincamiloferrera;

public class PreparadorFisico extends Entrenador {

    private int salarioF = 800000;

    public PreparadorFisico(boolean jugador, String JugadaFav, String nombre, String apellido, int añosP, int salario) {
        super(jugador, JugadaFav, nombre, apellido, añosP, salario);
    }

    public int getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(int salarioF) {
        this.salarioF = salarioF;
    }

    @Override
    public String toString() {
        return "PreparadorFisico{" + "salarioF=" + salarioF + '}';
    }

}
