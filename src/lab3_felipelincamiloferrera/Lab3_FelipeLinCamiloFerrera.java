package lab3_felipelincamiloferrera;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_FelipeLinCamiloFerrera {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Equipo> equipos = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Jugada> jugadas = new ArrayList();
        
        ArrayList<Jugador> agenteslibres = new ArrayList();
        ArrayList<EntrenadorPrincipal> entrenadores = new ArrayList();
        ArrayList<AsistenteEntrenador> entrenadoresasistentes = new ArrayList();
        ArrayList<PreparadorFisico> preparadoresfisicos = new ArrayList();
        ArrayList<MedicoGeneral> medicosgeneralesx = new ArrayList();
        ArrayList<Terapeuta> terapeutasx = new ArrayList();
        ArrayList<Cirujano> cirujanosx = new ArrayList();
        ArrayList<Dueño> dueñosx = new ArrayList();
        
        int cirujanos = 0, entrenadoresp = 0, entrenadoresasist = 0, preparadores = 0, medicosgenerales = 0, terapeutas = 0, dueños = 0;
        
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
                    System.out.println("1. Persona \n"
                            + "2. Equipo \n"
                            + "3. Jugada");
                    System.out.print("Ingrese opción: ");
                    String opcioncrear = sc.next();
                    System.out.println();
                    
                    switch (opcioncrear) {
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
                            
                            System.out.println("1. Jugador \n"
                                    + "2. Entrenador \n"
                                    + "3. Medico \n"
                                    + "4. Dueño");
                            System.out.print("Ingrese opción: ");
                            String opcionpersona = sc.next();
                            System.out.println();
                            
                            switch (opcionpersona) {
                                case "1":
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
                                    
                                    while (altura != 1.93 && altura != 2.05 && altura != 2 && altura != 2.10 && altura != 2.13) {
                                        System.out.println();
                                        System.out.println("Opcion de altura no valida");
                                        System.out.print("Ingrese altura: ");
                                        altura = sc.nextDouble();
                                    }

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
                                    

                                    if (altura == 1.93){
                                        personas.add(new Base (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                        System.out.println("Base creado Exitosamente");
                                        agenteslibres.add(new Base (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                    } else if (altura == 2){
                                        personas.add(new Escolta (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                        System.out.println("Escolta creado Exitosamente");
                                        agenteslibres.add(new Escolta (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                    } else if (altura == 2.05){
                                        personas.add(new Alero (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                        System.out.println("Alero creado Exitosamente");
                                        agenteslibres.add(new Alero (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                    } else if (altura == 2.10){
                                        personas.add(new AleroPivot (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                        System.out.println("Alero-Pivot creado Exitosamente");
                                        agenteslibres.add(new AleroPivot (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                    } else if (altura == 2.13){
                                        personas.add(new Centro (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                        System.out.println("Centro creado Exitosamente");
                                        agenteslibres.add(new Centro (numcamisa,tiro3,defensa,tiromedia,rebote,bandeja,pase,posteo,altura,nombre,apellido,años,salario));
                                    }
                                    break;
                                case "2":
                                    if (jugadas.size() == 0){
                                        System.out.println("No hay jugadas creadas, por lo tanto no se puede crear un Entrenador");
                                    } else {
                                        System.out.print("¿Fue jugador? [S/N]: ");
                                        char resp = sc.next().charAt(0);
                                        boolean jugador;

                                        if (resp == 's' || resp == 'S') {
                                            jugador = true;
                                        } else {
                                            jugador = false;
                                        }
                                        System.out.println();

                                        for (int i = 0; i < jugadas.size(); i++) {
                                            System.out.println((i+1) + ". Descripcion: " + jugadas.get(i).getDescip() + "  Efectividad: " + jugadas.get(i).getPorcentajeEfec());
                                        }
                                        System.out.print("Seleccione jugada favorita: ");
                                        int pos = sc.nextInt();
                                        pos--;

                                        while (pos >= jugadas.size()){
                                            System.out.println();
                                            System.out.println("Jugada no valida");
                                            System.out.print("Seleccione jugada favorita: ");
                                            pos = sc.nextInt();
                                            pos--;
                                        }
                                        System.out.println();

                                        Jugada jugadafav = jugadas.get(pos);

                                        System.out.println("1. Entrenador Principal \n"
                                                + "2. Asistente de Entrenador \n"
                                                + "3. Prepador Fisico");
                                        System.out.print("Seleccione tipo de entrenador: ");
                                        String opcionentrenador = sc.next();
                                        System.out.println();

                                        switch (opcionentrenador) {
                                            case "1":
                                                personas.add(new EntrenadorPrincipal (jugador,jugadafav,nombre,apellido,años,salario));
                                                System.out.println("Entrenador Principal creado con Exito");
                                                entrenadores.add(new EntrenadorPrincipal (jugador,jugadafav,nombre,apellido,años,salario));
                                                entrenadoresp++;
                                                break;
                                            case "2":
                                                personas.add(new AsistenteEntrenador (jugador,jugadafav,nombre,apellido,años,salario));
                                                System.out.println("Asistente de Entrenador creado con Exito");
                                                entrenadoresasistentes.add(new AsistenteEntrenador (jugador,jugadafav,nombre,apellido,años,salario));
                                                entrenadoresasist++;
                                                break;
                                            case "3":
                                                personas.add(new PreparadorFisico (jugador,jugadafav,nombre,apellido,años,salario));
                                                System.out.println("Preparador Fisico creado con Exito");
                                                preparadoresfisicos.add(new PreparadorFisico (jugador,jugadafav,nombre,apellido,años,salario));
                                                preparadores++;
                                            default:
                                                System.out.println("Opcion Incorrecta");
                                                break;
                                        }
                                    }                                        
                                    break;
                                case "3":
                                    System.out.print("Ingrese colegio de donde se egreso el medico: ");
                                    sc.nextLine();
                                    String colegio = sc.nextLine();
                                    System.out.println();
                                    
                                    System.out.println("1. Medico General \n"
                                            + "2. Cirujano \n"
                                            + "3. Terapeuta");
                                    System.out.print("Seleccione especialidad del medico: ");
                                    String opcionmedico = sc.next();
                                    System.out.println();
                                    
                                    switch (opcionmedico) {
                                        case "1":
                                            personas.add(new MedicoGeneral(0,colegio,nombre,apellido,años,salario));
                                            System.out.println("Medico General creado Exitosamente");
                                            medicosgeneralesx.add(new MedicoGeneral(0,colegio,nombre,apellido,años,salario));
                                            medicosgenerales++;
                                            break;
                                        case "2":
                                            personas.add(new Cirujano(0,colegio,nombre,apellido,años,salario));
                                            System.out.println("Cirujano creado Exitosamente");
                                            cirujanosx.add(new Cirujano(0,colegio,nombre,apellido,años,salario));
                                            cirujanos++;
                                            break;
                                        case "3":
                                            personas.add(new Terapeuta(0,colegio,nombre,apellido,años,salario));
                                            System.out.println("Terapeuta creado Exitosamente");
                                            terapeutasx.add (new Terapeuta(0,colegio,nombre,apellido,años,salario));
                                            terapeutas++;
                                            break;
                                        default:
                                            System.out.println("Opcion Incorrecta");
                                            break;
                                    }
                                    break;
                                case "4":
                                    System.out.print("Ingrese NetWorth: ");
                                    int cash = sc.nextInt();
                                    System.out.print("Ingrese ciudad: ");
                                    String ciudad = sc.next();
                                    
                                    personas.add(new Dueño (cash,ciudad,nombre,apellido,años,salario));
                                    System.out.println("Dueño creado Exitosamente");
                                    dueñosx.add(new Dueño (cash,ciudad,nombre,apellido,años,salario));
                                    dueños++;
                                    break;
                                default:
                                    System.out.println("Opcion Incorrecta");
                                    break;
                            }                            
                            break;
                        case "2":
                            if (agenteslibres.size() == 0 || cirujanos == 0 || entrenadoresp == 0 || entrenadoresasist == 0 || preparadores == 0 || medicosgenerales == 0 || terapeutas == 0 || dueños == 0){
                                System.out.println("No hay suficiente personal creado para crear un equipo");
                            } else {
                                System.out.print("Ingrese nombre: ");
                                sc.nextLine();
                                nombre = sc.nextLine();
                                System.out.print("Ingrese año de fundación: ");
                                int añof = sc.nextInt();
                                System.out.print("Ingrese numero de campeonatos: ");
                                int anillos = sc.nextInt();
                            }
                            
                            ArrayList<Jugador> jugadores = new ArrayList();
                            ArrayList<Persona> personal = new ArrayList();
                            
                            System.out.print("Cuantos jugadores desea agregar al equipo: ");
                            int cant = sc.nextInt();
                            
                            for (int i = 0; i < cant; i++) {
                                for (int j = 0; j < agenteslibres.size(); j++) {
                                    System.out.println((j+1) + " " + agenteslibres.get(i).getNombre());
                                }
                                System.out.print("Seleccione jugador: ");
                                int x = sc.nextInt();
                                x--;
                                while (x >= agenteslibres.size() || x < 0) {
                                    System.out.println();
                                    System.out.println("Jugador no valido");
                                    System.out.println("Seleccione jugador: ");
                                    x = sc.nextInt();
                                }
                                jugadores.add(agenteslibres.get(x));
                                agenteslibres.remove(x);
                                System.out.println();
                            }
                            
                            
                            for (int i = 0; i < entrenadores.size(); i++) {
                                System.out.println((i+1) + " " + entrenadores.get(i).getNombre());
                            }
                            System.out.print("Seleccione entrenador: ");
                            int x = sc.nextInt();
                            x--;
                            while (x >= entrenadores.size() || x < 0) {
                                System.out.println();
                                System.out.println("Entrenador no valido");
                                System.out.print("Seleccione entrenador: ");
                                x = sc.nextInt();
                            }
                            System.out.println();
                            personal.add(entrenadores.get(x));
                            
                            for (int i = 0; i < entrenadoresasistentes.size(); i++) {
                                System.out.println((i+1) + " " + entrenadoresasistentes.get(i).getNombre());
                            }
                            System.out.print("Seleccione entrenador asistente: ");
                            x = sc.nextInt();
                            x--;
                            while (x >= entrenadoresasistentes.size() || x < 0) {
                                System.out.println();
                                System.out.println("Entrenador asistente no valido");
                                System.out.print("Seleccione entrenador asistente: ");
                                x = sc.nextInt();
                            }
                            System.out.println();
                            personal.add(entrenadoresasistentes.get(x));
                            
                            for (int i = 0; i < preparadoresfisicos.size(); i++) {
                                System.out.println((i+1) + " " + preparadoresfisicos.get(i).getNombre());
                            }
                            System.out.print("Seleccione preparador fisico: ");
                            x = sc.nextInt();
                            x--;
                            while (x >= preparadoresfisicos.size() || x < 0) {
                                System.out.println();
                                System.out.println("Preparador no valido");
                                System.out.print("Seleccione preparador fisico: ");
                                x = sc.nextInt();
                            }
                            System.out.println();
                            personal.add(preparadoresfisicos.get(x));
                            
                            for (int i = 0; i < medicosgeneralesx.size(); i++) {
                                System.out.println((i+1) + " " + medicosgeneralesx.get(i).getNombre());
                            }
                            System.out.print("Seleccione medico general: ");
                            x = sc.nextInt();
                            x--;
                            while (x >= medicosgeneralesx.size() || x < 0) {
                                System.out.println();
                                System.out.println("Medico general valido");
                                System.out.print("Seleccione medico general asistente: ");
                                x = sc.nextInt();
                            }
                            System.out.println();
                            personal.add(medicosgeneralesx.get(x));
                            break;
                        case "3":
                            System.out.print("Ingrese descripción: ");
                            sc.nextLine();
                            String des = sc.nextLine();
                            System.out.print("Ingrese % de efectividad: ");
                            int efec = sc.nextInt();

                            while (efec < 0 || efec > 99) {
                                System.out.println();
                                System.out.println("% de efectividad no valido");
                                System.out.println("Ingrese % de efectividad: ");
                                efec = sc.nextInt();
                            }
                            System.out.println();

                            jugadas.add(new Jugada(des,efec));
                            System.out.println("Jugada creada con exito");
                            break;
                        default:
                            System.out.println("Opcion Incorrecta");
                            break;
                    }
                    break;
                case "5":
                    System.out.println(personas);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
            System.out.println();
        }
    }

}
