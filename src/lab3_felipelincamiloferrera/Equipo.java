package lab3_felipelincamiloferrera;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private int año, campeonatos;
    private ArrayList personal = new ArrayList();
    private Dueño dueño;
    private ArrayList<Jugada> jugadas = new ArrayList();

    public Equipo(String nombre, int año, int campeonatos, Dueño dueño) {
        this.nombre = nombre;
        this.año = año;
        this.campeonatos = campeonatos;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public ArrayList getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList personal) {
        this.personal = personal;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public ArrayList<Jugada> getJugadas() {
        return jugadas;
    }

    public void setJugadas(ArrayList<Jugada> jugadas) {
        this.jugadas = jugadas;
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", a\u00f1o=" + año + ", campeonatos=" + campeonatos + ", personal=" + personal + ", due\u00f1o=" + dueño + ", jugadas=" + jugadas + '}';
    }

}
