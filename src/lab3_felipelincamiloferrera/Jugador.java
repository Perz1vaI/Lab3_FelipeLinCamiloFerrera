package lab3_felipelincamiloferrera;

public class Jugador extends Persona {

    protected int numerocamisa,tirode3,defensa,tirodemedia,rebote,bandeja,pases,posteo;
    protected double altura;

    public Jugador(int numerocamisa, int tirode3, int defensa, int tirodemedia, int rebote, int bandeja, int pases, int posteo, double altura, String nombre, String apellido, int añosP, int salario) {
        super(nombre, apellido, añosP, salario);
        this.numerocamisa = numerocamisa;
        this.tirode3 = tirode3;
        this.defensa = defensa;
        this.tirodemedia = tirodemedia;
        this.rebote = rebote;
        this.bandeja = bandeja;
        this.pases = pases;
        this.posteo = posteo;
        this.altura = altura;
    }

    

    public int getNumerocamisa() {
        return numerocamisa;
    }
    public int getTirode3() {
        return tirode3;
    }
    public int getDefensa() {
        return defensa;
    }
    public int getTirodemedia() {
        return tirodemedia;
    }
    public int getRebote() {
        return rebote;
    }
    public int getBandeja() {
        return bandeja;
    }
    public int getPases() {
        return pases;
    }
    public int getPosteo() {
        return posteo;
    }
    public double getAltura() {
        return altura;
    }

    
    
}