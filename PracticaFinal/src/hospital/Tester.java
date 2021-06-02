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
public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
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
                    System.out.println("Pulse 1 para consultar los pacientes, médicos y visitas");
                    System.out.println("Pulse 2 para consultar un médico mediante su ID");
                    System.out.println("Pulse 3 para añadir un médico");
                    System.out.println("Pulse 4 para añadir un paciente");
                    System.out.println("Pulse 5 para volcar los datos a un fichero de texto");
                    System.out.println("Pulse 6 para volcar los datos a un fichero binario");
                    System.out.println("Pulse 7 para leer del fichero de texto");
                    System.out.println("Pulse 8 para leer del fichero binario");
                    System.out.println("Pulse 9 para comparar Médicos");
                    System.out.println("Pulse 10 para consultar Médicos por ID");
                    System.out.println("Pulse 11 para comparar Pacientes");
                    System.out.println("Pulse 12 para actualizar un Médico");
                    System.out.println("Pulse 13 para actualizar un Paciente");
                    System.out.println("Pulse 14 para añadir una visita");
                    System.out.println("Pulse 15 si quiere consultar los administradores");
                    System.out.println("Pulse 16 si quiere consultar los enfermeros");
                    System.out.println("Pulse 17 si quiere eliminar un paciente");
                    System.out.println("Pulse 18 si quiere eliminar un médico");
                    System.out.println("Pulse 19 si quiere eliminar un médico de un departamento específico");
                    System.out.println("Pulse 0 para salir del programa");

                    eleccion2 = sc.nextInt();
                    switch (eleccion2) {
                        case 0:
                            System.out.println("Adios");
                            break;
                        case 1:
                            hospital.consultaHospital();
                            break;
                        case 2:
                            hospital.consultaDeMedicosID();
                            break;
                        case 3:
                            hospital.anadirMedico();
                            break;
                        case 4:
                            hospital.anadirPaciente();
                            break;
                        case 5:
                            GestorFicheros.escribirFicheroTexto(GestorFicheros.FICHERO, hospital.personal, hospital.pacientes);
                            break;
                        case 6:
                            GestorFicheros.escribirFicheroBinario(GestorFicheros.FICHERO_BINARIO, hospital);
                            break;
                        case 7:
                            GestorFicheros.leerFicheroTexto(GestorFicheros.FICHERO);
                            break;
                        case 8:
                            GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO);
                            hospital.consultaHospital();
                            break;
                        case 9:
                            System.out.println("Has elegido comparar Médicos");
                            System.out.println("Por ID");
                            System.out.println("");
                            hospital.consultaMedicos();
                            Collections.sort(hospital.personal, new porEdadMedico());
                            System.out.println("Por edad");
                            System.out.println("");
                            hospital.consultaMedicos();
                            Collections.sort(hospital.personal, new porDiasTrabajados());
                            System.out.println("Por días trabajados");
                            System.out.println("");
                            hospital.consultaMedicos();
                            Collections.sort(hospital.personal, new porEdadIgualDiasMedico());
                            System.out.println("A igualdad de edad, por días trabajados");
                            System.out.println("");
                            hospital.consultaMedicos();
                            break;
                        case 10:
                            hospital.consultaDeMedicosID();
                            break;
                        case 11:
                            System.out.println("Has elegido comparar Pacientes");
                            System.out.println("Por ID");
                            System.out.println("");
                            hospital.consultaPacientes();
                            ArrayList<Paciente> listaPacientes = new ArrayList(hospital.pacientes);
                            System.out.println("Por edad");
                            System.out.println("");
                            Collections.sort(listaPacientes, new porEdadPaciente());
                            hospital.consultaPacienteArray(listaPacientes);
                            System.out.println("Por dias ingresados");
                            System.out.println("");
                            Collections.sort(listaPacientes, new porDiasIngresados());
                            hospital.consultaPacienteArray(listaPacientes);
                            System.out.println("A igualdad de edad, por días Ingresados");
                            System.out.println("");
                            Collections.sort(listaPacientes, new porEdadIgualDiasPaciente());
                            hospital.consultaPacienteArray(listaPacientes);
                            break;
                        case 12:
                            hospital.actualizarMedico();
                            break;
                        case 13:
                            hospital.actualizarPaciente();
                            break;
                        case 14:
                            hospital.añadirVisita();
                            break;
                        case 15:
                            hospital.consultaAdministradores();
                            break;
                        case 16:
                            hospital.consultaEnfermeros();
                            break;
                        case 17:
                            hospital.eliminarPacientePorID();
                            break;
                        case 18:
                            hospital.eliminarMedicoPorID();
                            break;
                        case 19:
                            hospital.eliminarMedicosPorDepartamentoEiD();
                            break;
                        default:
                            System.out.println("Se ha equivocado de número");
                            break;
                    }
                } while (eleccion2 != 0);
            } else if (eleccion == 2) {
                do {
                    System.out.println("Bienvenido");
                    System.out.println("Pulse 1 para consultar los pacientes, médicos y visitas");
                    System.out.println("Pulse 2 para consultar un médico mediante su ID");
                    System.out.println("Pulse 3 para leer del fichero de texto");
                    System.out.println("Pulse 4 para leer del fichero binario");
                    System.out.println("Pulse 5 para comparar Médicos");
                    System.out.println("Pulse 6 para consultar Médicos por ID");
                    System.out.println("Pulse 7 para comparar Pacientes");
                    System.out.println("Pulse 8 si quiere consultar los administradores");
                    System.out.println("Pulse 9 si quiere consultar los enfermeros");
                    System.out.println("Pulse 0 para salir del programa");

                    eleccion3 = sc.nextInt();
                    switch (eleccion3) {
                        case 0:
                            System.out.println("Adios");
                            break;
                        case 1:
                            hospital.consultaHospital();
                            break;
                        case 2:
                            hospital.consultaDeMedicosID();
                            break;
                        case 3:
                            GestorFicheros.leerFicheroTexto(GestorFicheros.FICHERO);
                            break;
                        case 4:
                            GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO);
                            break;
                        case 5:
                            System.out.println("Has elegido comparar Médicos");
                            System.out.println("Por ID");
                            System.out.println("");
                            hospital.consultaMedicos();
                            Collections.sort(hospital.personal, new porEdadMedico());
                            System.out.println("Por edad");
                            System.out.println("");
                            hospital.consultaMedicos();
                            Collections.sort(hospital.personal, new porDiasTrabajados());
                            System.out.println("Por días trabajados");
                            System.out.println("");
                            hospital.consultaMedicos();
                            Collections.sort(hospital.personal, new porEdadIgualDiasMedico());
                            System.out.println("A igualdad de edad, por días trabajados");
                            System.out.println("");
                            hospital.consultaMedicos();
                            break;
                        case 6:
                            hospital.consultaDeMedicosID();
                            break;
                        case 7:
                            System.out.println("Has elegido comparar Pacientes");
                            System.out.println("Por ID");
                            System.out.println("");
                            hospital.consultaPacientes();
                            ArrayList<Paciente> listaPacientes = new ArrayList(hospital.pacientes);
                            System.out.println("Por edad");
                            System.out.println("");
                            Collections.sort(listaPacientes, new porEdadPaciente());
                            hospital.consultaPacienteArray(listaPacientes);
                            System.out.println("Por dias ingresados");
                            System.out.println("");
                            Collections.sort(listaPacientes, new porDiasIngresados());
                            hospital.consultaPacienteArray(listaPacientes);
                            System.out.println("A igualdad de edad, por días Ingresados");
                            System.out.println("");
                            Collections.sort(listaPacientes, new porEdadIgualDiasPaciente());
                            hospital.consultaPacienteArray(listaPacientes);
                            break;
                        case 8:
                            hospital.consultaAdministradores();
                            break;
                        case 9:
                            hospital.consultaEnfermeros();
                            break;
                        default:
                            System.out.println("Se ha equivocado de número");
                            break;
                    }
                } while (eleccion3 != 0);
            }
        } while (eleccion == 1 || eleccion == 2);
    }
}
