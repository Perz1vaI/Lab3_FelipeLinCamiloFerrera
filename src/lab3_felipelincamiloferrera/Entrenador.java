package lab3_felipelincamiloferrera;

public class Entrenador extends Persona {

    protected boolean jugador;
    protected String JugadaFav;

    

    public Entrenador(boolean jugador, String JugadaFav, String nombre, String apellido, int añosP, int salario) {
        super(nombre, apellido, añosP, salario);
        this.jugador = jugador;
        this.JugadaFav = JugadaFav;
    }

    public boolean isJugador() {
        return jugador;
    }

    public void setJugador(boolean jugador) {
        this.jugador = jugador;
    }

    public String getJugadaFav() {
        return JugadaFav;
    }

    public void setJugadaFav(String JugadaFav) {
        this.JugadaFav = JugadaFav;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "jugador=" + jugador + ", JugadaFav=" + JugadaFav + '}';
    }

}
