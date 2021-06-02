/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class TesterVisitas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalVisitas hospitalvisitas = new HospitalVisitas();
        GestorFicheros.crearFicheros();
        int eleccion;
        int eleccion2;
        int eleccion3;

        do {
            System.out.println("Bienvenido a la gestión del Hospital Infanta Leonor");
            System.out.println("Si usted es administrador pulse 1");
            System.out.println("Si usted es usuario pulse 2");
            System.out.println("Si quiere salir del programa pulse cualquier otro número");
            eleccion = sc.nextInt();
            if (eleccion == 1) {

                do {
                    System.out.println("Bienvenido");
                    System.out.println("Pulse 1 para consultar los pacientes y médicos del hospital");
                    System.out.println("Pulse 2 para consultar un médico mediante su ID");
                    System.out.println("Pulse 3 para añadir un médico o un paciente al hospital");
                    System.out.println("Pulse 4 para volcar los datos a un fichero de texto");
                    System.out.println("Pulse 5 para volcar los datos a un fichero binario");
                    System.out.println("Pulse 6 para leer del fichero de texto");
                    System.out.println("Pulse 7 para leer del fichero binario");
                    System.out.println("Pulse 8 para comparar Médicos");
                    System.out.println("Pulse 9 para consultar Médicos por ID");
                    System.out.println("Pulse 10 para comparar Pacientes");
                    System.out.println("Pulse 11 para actualizar un Médico");
                    System.out.println("Pulse 12 para actualizar un Paciente");
                    System.out.println("Pulse 0 para salir del programa");

                    eleccion2 = sc.nextInt();
                    switch (eleccion2) {
                        case 0:
                            System.out.println("Adios");
                            break;
                        case 1:
                            hospitalvisitas.consultaHospital();
                            break;
                        case 2:
                            hospitalvisitas.consultaDeMedicosID();
                            break;
                        case 3:
                            hospitalvisitas.añadirPersonal();
                            break;
                        case 4:
                            GestorFicheros.escribirFicheroTexto(GestorFicheros.FICHERO, hospitalvisitas.personal, hospitalvisitas.pacientes);
                            break;
                        case 5:
                            //GestorFicheros.escribirFicheroBinario(GestorFicheros.FICHERO_BINARIO, hospitalvisitas);
                            break;
                        case 6:
                            GestorFicheros.leerFicheroTexto(GestorFicheros.FICHERO);
                            break;
                        case 7:
                            GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO);
                            break;
                        case 8:
                            System.out.println("Has elegido comparar Médicos");
                            System.out.println("Por orden natural");
                            hospitalvisitas.consultaMedicos();
                            Collections.sort(hospitalvisitas.personal, new porEdadMedico());
                            System.out.println("Por edad");
                            hospitalvisitas.consultaMedicos();
                            Collections.sort(hospitalvisitas.personal, new porDiasTrabajados());
                            System.out.println("Por días trabajados");
                            hospitalvisitas.consultaMedicos();
                            Collections.sort(hospitalvisitas.personal, new porEdadIgualDiasMedico());
                            System.out.println("A igualdad de edad, por días trabajados");
                            hospitalvisitas.consultaMedicos();
                            break;
                        case 9:
                            hospitalvisitas.consultaDeMedicosID();
                            break;
                        case 10:
                            //Tengo dudas
                            System.out.println("Has elegido comparar Pacientes");
                            System.out.println("Por orden natural");
                            hospitalvisitas.consultaPacientes();
                            ArrayList<Paciente> listaPacientes = new ArrayList(hospitalvisitas.pacientes);
                            System.out.println("Por edad");
                            Collections.sort(listaPacientes, new porEdadPaciente());
                            System.out.println(listaPacientes);
                            System.out.println("Por dias ingresados");
                            Collections.sort(listaPacientes, new porDiasIngresados());
                            System.out.println(listaPacientes);
                            Collections.sort(listaPacientes, new porEdadIgualDiasPaciente());
                            System.out.println(listaPacientes);
                            break;
                        case 11:
                            hospitalvisitas.actualizarMedico();
                            break;
                        case 12:
                            hospitalvisitas.actualizarPaciente();
                            break;
                        case 13:
                            
                        default:
                            System.out.println("Se ha equivocado de número");
                            break;
                    }
                } while (eleccion2 != 0);
            } else if (eleccion==2){
                do {
                    System.out.println("Bienvenido");
                    System.out.println("Pulse 1 para consultar los pacientes y médicos del hospital");
                    System.out.println("Pulse 2 para consultar un médico mediante su ID");
                    System.out.println("Pulse 3 para leer del fichero de texto");
                    System.out.println("Pulse 4 para leer del fichero binario");
                    System.out.println("Pulse 5 para comparar Médicos");
                    System.out.println("Pulse 6 para consultar Médicos por ID");
                    System.out.println("Pulse 7 para comparar Pacientes");
                    System.out.println("Pulse 0 para salir del programa");

                    eleccion3 = sc.nextInt();
                    switch (eleccion3) {
                        case 0:
                            System.out.println("Adios");
                            break;
                        case 1:
                            hospitalvisitas.consultaHospital();
                            break;
                        case 2:
                            hospitalvisitas.consultaDeMedicosID();
                            break;
                        case 3:
                            GestorFicheros.leerFicheroTexto(GestorFicheros.FICHERO);
                            break;
                        case 4:
                            GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO);
                            break;
                        case 5:
                            System.out.println("Has elegido comparar Médicos");
                            System.out.println("Por orden natural");
                            hospitalvisitas.consultaMedicos();
                            Collections.sort(hospitalvisitas.personal, new porEdadMedico());
                            System.out.println("Por edad");
                            hospitalvisitas.consultaMedicos();
                            Collections.sort(hospitalvisitas.personal, new porDiasTrabajados());
                            System.out.println("Por días trabajados");
                            hospitalvisitas.consultaMedicos();
                            Collections.sort(hospitalvisitas.personal, new porEdadIgualDiasMedico());
                            System.out.println("A igualdad de edad, por días trabajados");
                            hospitalvisitas.consultaMedicos();
                            break;
                        case 6:
                            hospitalvisitas.consultaDeMedicosID();
                            break;
                        case 7:
                            System.out.println("Has elegido comparar Pacientes");
                            System.out.println("Por orden natural");
                            hospitalvisitas.consultaPacientes();
                            ArrayList<Paciente> listaPacientes = new ArrayList(hospitalvisitas.pacientes);
                            System.out.println("Por edad");
                            Collections.sort(listaPacientes, new porEdadPaciente());
                            System.out.println(listaPacientes);
                            System.out.println("Por dias ingresados");
                            Collections.sort(listaPacientes, new porDiasIngresados());
                            System.out.println(listaPacientes);
                            Collections.sort(listaPacientes, new porEdadIgualDiasPaciente());
                            System.out.println(listaPacientes);
                            break;
                        default:
                            System.out.println("Se ha equivocado de número");
                            break;
                    }
                } while (eleccion3 != 0);
            }
        } while (eleccion ==1 || eleccion == 2);
    }
}
