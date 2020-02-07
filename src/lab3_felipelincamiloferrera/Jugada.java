package lab3_felipelincamiloferrera;

public class Jugada {

    private String descip;
    private int PorcentajeEfec;

    public Jugada(String descip, int PorcentajeEfec) {
        this.descip = descip;
        this.PorcentajeEfec = PorcentajeEfec;
    }

    public String getDescip() {
        return descip;
    }

    public void setDescip(String descip) {
        this.descip = descip;
    }

    public int getPorcentajeEfec() {
        return PorcentajeEfec;
    }

    public void setPorcentajeEfec(int PorcentajeEfec) {
        this.PorcentajeEfec = PorcentajeEfec;
    }

    @Override
    public String toString() {
        return "Jugadas{" + "descip=" + descip + ", PorcentajeEfec=" + PorcentajeEfec + '}';
    }

}
