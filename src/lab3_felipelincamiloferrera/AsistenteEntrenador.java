package lab3_felipelincamiloferrera;

public class AsistenteEntrenador extends Entrenador {

    private int salarioA = 1000000;

    public AsistenteEntrenador(boolean jugador, Jugada JugadaFav, String nombre, String apellido, int añosP, int salario) {
        super(jugador, JugadaFav, nombre, apellido, añosP, salario);
        salario = this.salarioA;
    }

    public int getSalarioA() {
        return salarioA;
    }

    public void setSalarioA(int salarioA) {
        this.salarioA = salarioA;
    }


}
