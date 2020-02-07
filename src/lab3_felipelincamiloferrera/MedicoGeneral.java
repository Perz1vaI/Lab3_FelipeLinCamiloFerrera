package lab3_felipelincamiloferrera;

public class MedicoGeneral extends Medico {

    private int NumeroDeEnfermedadesCuradas;

    public MedicoGeneral(int NumeroDeEnfermedadesCuradas, String colegio, String nombre, String apellido, int añosP, int salario) {
        super(colegio, nombre, apellido, añosP, salario);
        this.NumeroDeEnfermedadesCuradas = NumeroDeEnfermedadesCuradas;
    }

    public int getNumeroDeEnfermedadesCuradas() {
        return NumeroDeEnfermedadesCuradas;
    }

    public void setNumeroDeEnfermedadesCuradas(int NumeroDeEnfermedadesCuradas) {
        this.NumeroDeEnfermedadesCuradas = NumeroDeEnfermedadesCuradas;
    }

    @Override
    public String toString() {
        return "MedicoGeneral{" + "NumeroDeEnfermedadesCuradas=" + NumeroDeEnfermedadesCuradas + '}';
    }

}
