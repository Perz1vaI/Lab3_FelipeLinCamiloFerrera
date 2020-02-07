package lab3_felipelincamiloferrera;

public class PreparadorFisico extends Entrenador {

    private int salarioF = 800000;

    public PreparadorFisico(boolean jugador, Jugada JugadaFav, String nombre, String apellido, int añosP, int salario) {
        super(jugador, JugadaFav, nombre, apellido, añosP, salario);
        salario = this.salarioF;
    }

    public int getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(int salarioF) {
        this.salarioF = salarioF;
    }

}