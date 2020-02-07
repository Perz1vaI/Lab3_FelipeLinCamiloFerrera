package lab3_felipelincamiloferrera;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_FelipeLinCamiloFerrera {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList equipos = new ArrayList();
        ArrayList<Persona> jugadores = new ArrayList();
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
                    + "4. Jugar Partido \n"
                    + "5. Imprimir");
            System.out.print("Ingrese opción ó pulse [0] para salir: ");
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
                            + "6. Preparador Fisico \n"
                            + "7. Jugada");
                    System.out.print("Ingrese opción: ");
                    String opcion1 = sc.next();
                    System.out.println();
                    
                    switch (opcion1) {
                        case "1":
                        System.out.println("DATOS PERSONALES");
                        System.out.println();
                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese apellido: ");
                        String apellido = sc.next();
                        System.out.print("Ingrese años como profesional: ");
                        int años = sc.nextInt();
                        System.out.print("Ingrese salario: ");
                        int salario = sc.nextInt();
                        System.out.println();
                            System.out.print("Ingrese Numero de Camiseta: ");
                            int numcamisa = sc.nextInt();
                            System.out.print("Ingrese tiro de tres: ");
                            int tiro3 = sc.nextInt();
                            System.out.print("Ingrese defensa: ");
                            int defensa = sc.nextInt();
                            System.out.print("Ingrese tiro de media distancia: ");
                            int tiromedia = sc.nextInt();
                            System.out.print("Ingrese rebote: ");
                            int rebote = sc.nextInt();
                            System.out.print("Ingrese bandeja: ");
                            int bandeja = sc.nextInt();
                            System.out.print("Ingrese pases: ");
                            int pase = sc.nextInt();
                            System.out.print("Ingrese posteo: ");
                            int posteo = sc.nextInt();
                            System.out.print("Ingrese altura: ");
                            double altura = sc.nextDouble();
                            
                            while (tiro3 > 99 || defensa > 99 || tiromedia > 99 || bandeja > 99 || pase > 99 || posteo > 99) {
                                System.out.println();
                                System.out.println("Hay atributos invalidos");
                                System.out.println();
                                System.out.print("Ingrese tiro de tres: ");
                                tiro3 = sc.nextInt();
                                System.out.print("Ingrese defensa: ");
                                defensa = sc.nextInt();
                                System.out.print("Ingrese tiro de media distancia: ");
                                tiromedia = sc.nextInt();
                                System.out.print("Ingrese rebote: ");
                                rebote = sc.nextInt();
                                System.out.print("Ingrese bandeja: ");
                                bandeja = sc.nextInt();
                                System.out.print("Ingrese pases: ");
                                pase = sc.nextInt();
                                System.out.print("Ingrese posteo: ");
                                posteo = sc.nextInt();            
                            }
                            System.out.println();
                            
                            jugadores.add(new Jugador(numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                            System.out.println("Jugador Creado con Exito");
                            break;
                        default:
                            System.out.println("Opcion Incorrecta");
                            break;
                    }
                    break;
                case "5":
                    System.out.println(jugadores);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
            System.out.println();
        }
    }

}
