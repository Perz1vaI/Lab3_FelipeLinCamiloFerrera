package lab3_felipelincamiloferrera;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_FelipeLinCamiloFerrera {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList equipos = new ArrayList();
        ArrayList jugadores = new ArrayList();
        ArrayList dueños = new ArrayList();
        ArrayList medicosgenerales = new ArrayList();
        ArrayList cirujanos = new ArrayList();
        ArrayList terapeutas = new ArrayList();
        ArrayList asistentes = new ArrayList();
        ArrayList preparadoresfisicos = new ArrayList();
        
        while (true) {
            System.out.println("1. Crear \n"
                    + "2. Modificar \n"
                    + "3. Eliminar \n"
                    + "4. Jugar Partido: ");
            System.out.println("Ingrese opción ó pulse [0] para salir: ");
            String opcionmenu = sc.next();
            System.out.println();
            
            switch (opcionmenu) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    System.out.println("1. Jugador \n"
                            + "2. Equipo \n"
                            + "3. Medico \n"
                            + "4. Entrenador \n"
                            + "5. Asistente \n"
                            + "6. Preparador Fisico");
                    System.out.print("Ingrese opción: ");
                    String opcion1 = sc.next();
                    System.out.println();
                    
                    switch (opcion1) {
                        case "1":
                            
                            break;
                        default:
                            System.out.println("Opcion Incorrecta");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
            System.out.println();
        }
    }

}
