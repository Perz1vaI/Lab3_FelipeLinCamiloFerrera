package lab3_felipelincamiloferrera;

public class Entrenador extends Persona {

    protected boolean jugador;
    protected Jugada JugadaFav;

    

    public Entrenador(boolean jugador, Jugada JugadaFav, String nombre, String apellido, int añosP, int salario) {
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

    public Jugada getJugadaFav() {
        return JugadaFav;
    }

    public void setJugadaFav(Jugada JugadaFav) {
        this.JugadaFav = JugadaFav;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "jugador=" + jugador + ", JugadaFav=" + JugadaFav + '}';
    }

}
