
package lab3_felipelincamiloferrera;


public class EntrenadorPrincipal extends Entrenador {
    
    private int salarioP=2000000;

    public EntrenadorPrincipal(boolean jugador, String JugadaFav, String nombre, String apellido, int añosP, int salario) {
        super(jugador, JugadaFav, nombre, apellido, añosP, salario);
    }
    
    

    public int getSalarioP() {
        return salarioP;
    }

    public void setSalarioP(int salarioP) {
        this.salarioP = salarioP;
    }

    @Override
    public String toString() {
        return "EntrenadorPrincipal{" + "salarioP=" + salarioP + '}';
    }
    
    
    
    
}
