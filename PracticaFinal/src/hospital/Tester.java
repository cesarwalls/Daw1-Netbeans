/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author prog
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        GestorFicheros.crearFicheros();
        int eleccion;
        do {
            System.out.println("Bienvenido");
            System.out.println("Pulse 1 para consultar los pacientes y médicos del hospital");
            System.out.println("Pulse 2 para consultar un médico mediante su ID");
            System.out.println("Pulse 3 para añadir un médico o un paciente al hospital");
            System.out.println("Pulse 4 para volcar los datos a un fichero de texto");
            System.out.println("Pulse 5 para volcar los datos a un fichero binario");
            System.out.println("Pulse 6 para leer del fichero de texto");
            System.out.println("Pulse 7 para leer del fichero binario");
            System.out.println("Pulse 0 para salir del programa");

            eleccion = sc.nextInt();
            switch (eleccion) {
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
                    hospital.añadirPersonal();
                    break;
                case 4:
                    GestorFicheros.escribirFicheroTexto(GestorFicheros.FICHERO, hospital.personal, hospital.pacientes);
                    break;
                case 5:
                    GestorFicheros.escribirFicheroBinario(GestorFicheros.FICHERO_BINARIO, hospital);
                    break;
                case 6:
                    GestorFicheros.leerFicheroTexto(GestorFicheros.FICHERO);
                    break;
                case 7:
                    GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO);
                    break;
                default:
                    System.out.println("Se ha equivocado de número");
                    break;
            }
        } while (eleccion != 0);

    }
}
