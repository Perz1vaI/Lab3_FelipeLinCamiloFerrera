package lab3_felipelincamiloferrera;

public class Dueño extends Persona {

    private int Networth;
    private String ciudad;

    public Dueño(int Networth, String ciudad, String nombre, String apellido, int añosP, int salario) {
        super(nombre, apellido, añosP, salario);
        this.Networth = Networth;
        this.ciudad = ciudad;
    }

    public int getNetworth() {
        return Networth;
    }

    public void setNetworth(int Networth) {
        this.Networth = Networth;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "Networth=" + Networth + ", ciudad=" + ciudad + '}';
    }

}
