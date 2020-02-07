package lab3_felipelincamiloferrera;

public class AsistenteEntrenador extends Entrenador {

    private int salarioA = 1000000;

    public AsistenteEntrenador(boolean jugador, String JugadaFav, String nombre, String apellido, int añosP, int salario) {
        super(jugador, JugadaFav, nombre, apellido, añosP, salario);
    }

    public int getSalarioA() {
        return salarioA;
    }

    public void setSalarioA(int salarioA) {
        this.salarioA = salarioA;
    }

    @Override
    public String toString() {
        return "AsistenteEntrenador{" + "salarioA=" + salarioA + '}';
    }

}
