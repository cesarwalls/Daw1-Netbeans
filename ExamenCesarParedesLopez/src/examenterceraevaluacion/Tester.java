/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenterceraevaluacion;

import java.util.Scanner;

/**
 *
 * @author prog
 */
public class Tester {

    public static void main(String[] args) throws ExcepcionPropia {
        Scanner sc = new Scanner(System.in);
        Booking listado = new Booking();
        int eleccion;
        System.out.println("Le presento los alojamientos que hay");
        listado.consultaAlojamientos();

        do {
            System.out.println("Bienvenido");
            System.out.println("Pulse 1 para consultar alojamientos por provincia");
            System.out.println("Pulse 2 para actualizar la categoría de un hotel");
            System.out.println("Pulse 3 para añadir alojamiento");
            System.out.println("Pulse 4 para volcar la información al fichero de texto");
            System.out.println("Pulse 5 para cargar la información del fichero de texto");
            System.out.println("Pulse 6 para consultar por nomnbre");
            System.out.println("Pulse 0 para salir del programa");

            eleccion = sc.nextInt();
            switch (eleccion) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    listado.consultaAlojamientosProvincia();
                    break;
                case 2:
                    listado.actualizarCategoria();
                    break;
                case 3:
                    listado.añadirAlojamiento();
                    break;
                case 4:
                    listado.volcarInfoFicheroTexto();
                    break;
                case 5:
                    listado.cargarInfoFicheroTexto();
                    break;
                case 6:
                    listado.consultaOrdenadaNombre();
                    break;
                default:
                    System.out.println("Se ha equivocado de número");
                    break;
            }
        } while (eleccion != 0);

    }
}
