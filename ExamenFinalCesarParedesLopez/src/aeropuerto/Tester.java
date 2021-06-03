/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author prog
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorFicheros.crearFicheros();
        Aeropuerto barajas = new Aeropuerto();
        System.out.println("Bienvenido al menu");
        int eleccion;
        do {
            System.out.println("Elija 0 para salir");
            System.out.println("Elija 1 para añadir vuelo");
            System.out.println("Elija 2 para consultar vuelo de origen y destino por rango de precios");
            System.out.println("Elija 3 para actualizar vuelo");
            System.out.println("Elija 4 para eliminar vuelos");
            System.out.println("Elija 5 para escribir en fichero de texto");
            System.out.println("Elija 6 para escribir en fichero binario");
            System.out.println("Elija 7 para leer del fichero de texto");
            System.out.println("Elija 8 para leer del fichero binario");
            System.out.println("Elija 9 para consultar por precio los vuelos ddado un origen y destino");
            System.out.println("Elija 10 para consultar por rentabilidad");
      
            
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    barajas.anadirVuelo();
                    break;
                case 2:
                    barajas.consultaVuelo();
                    break;
                case 3:
                    barajas.actualizarVuelo();
                    break;
                case 4:
                    barajas.eliminarVuelos();
                    break;
                case 5:
                    barajas.escribirFicheroTexto();
                    break;
                case 6:
                   
                    break;
                case 7:
                    barajas.leerFicheroTexto();
                    break;
                case 8:
                  
                    break;
                    
                case 9:
                    barajas.consultaVueloPorPrecio();
                    break;
                case 10:
                    System.out.println("Quiere consultar los vuelos por rentabilidad");
                    barajas.ordenarRentabilidad();
                    System.out.println("Por numero de pasajeros a igualdad de rentabilidad Ascendente");
                    barajas.ordenarRentabilidadAscendente();
                    System.out.println("Por numero de pasajeros a igualdad de rentabilidad Descendente");
                    barajas.ordenarRentabilidadDescente();
                default:
                    System.out.println("Se ha equivocado de número");
                    break;
            }

        } while (eleccion != 0);

       
    }

}
