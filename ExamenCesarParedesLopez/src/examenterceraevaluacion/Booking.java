/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenterceraevaluacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prog He tenido que meter toda la clase del GestorFicheros aquí porque
 * no se por qué, no me podía leer el ArrayList listaAlojamientos Y además no me
 * dejaba usar sus métodos aun creándome un gestor ficheros.
 */
public class Booking {

    public ArrayList<Alojamiento> listaAlojamientos;

    public Booking() {
        listaAlojamientos = new ArrayList();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                listaAlojamientos.add(new Hotel());
            } else {
                listaAlojamientos.add(new CasaRural());
            }
        }
    }

    public Booking(ArrayList<Alojamiento> listaAlojamientos) {
        this.listaAlojamientos = listaAlojamientos;
    }

    /**
     * Esta funcion solo es para ver los alojamientos
     */
    public void consultaAlojamientos() {
        for (int i = 0; i < listaAlojamientos.size(); i++) {
            System.out.println(listaAlojamientos.get(i).toString());

        }
    }

    public void añadirAlojamiento() throws ExcepcionPropia {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime qué tipo de alojamiento quieres");
        System.out.println("Si quieres hotel pulsa 1");
        System.out.println("Si quieres casa rural pulsa 2");
        int eleccion = sc.nextInt();
        if (eleccion == 1) {
            System.out.println("Introduce nombre");
            String nombre = sc.next();
            sc.nextLine();
            System.out.println("Introduce provincia");
            String provincia = sc.next();
            sc.nextLine();
            System.out.println("Introduce numero de habitaciones");
            int numHabitaciones = sc.nextInt();
            System.out.println("Introduce el servicio");
            String servicio = sc.next();
            sc.nextLine();
            System.out.println("Introduce categoria");
            int categoria = sc.nextInt();
            if (categoria < 0 || categoria > 5) {
                throw new ExcepcionPropia();
            }
            Hotel h = new Hotel(servicio, categoria, nombre, provincia, numHabitaciones);
            listaAlojamientos.add(h);
            //Aquí te pongo de nuevo los alojamientos para que lo veas
            System.out.println("Los alojamientos son:");
            consultaAlojamientos();
        } else if (eleccion == 2) {
            System.out.println("Introduce nombre");
            String nombre = sc.next();
            sc.nextLine();
            System.out.println("Introduce provincia");
            String provincia = sc.next();
            sc.nextLine();
            System.out.println("Introduce numero de habitaciones");
            int numHabitaciones = sc.nextInt();
            System.out.println("Introduce si tiene acceso para minusvalidos");
            System.out.println("Diga 1 si lo tiene o 0 si no");
            int acceso = sc.nextInt();
            boolean minusvalido;
            if (acceso == 1) {
                minusvalido = true;
            } else {
                minusvalido = false;
            }
            CasaRural c = new CasaRural(minusvalido, nombre, provincia, numHabitaciones);
            listaAlojamientos.add(c);
            //Aquí te pongo de nuevo los alojamientos para que lo veas
            System.out.println("Los alojamientos son:");
            consultaAlojamientos();
        }
    }

    public void consultaAlojamientosProvincia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la provincia que quieres");
        String provincia = sc.nextLine();
        for (int i = 0; i < listaAlojamientos.size(); i++) {
            if (listaAlojamientos.get(i).provincia.equalsIgnoreCase(provincia)) {
                System.out.println("Dime el numero de habitaciones que quieres");
                int numHab = sc.nextInt();
                if (listaAlojamientos.get(i).numHabitaciones > numHab) {
                    System.out.println("Hemos encontrado alojamientos a tu disposicion");
                    System.out.println(listaAlojamientos.get(i).toString());
                } else {
                    System.out.println("No hay alojamientos con esas características");
                }

            }
        }
    }

    public void actualizarCategoria() throws ExcepcionPropia {
        //No puedo acceder a la categoría del hotel
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del hotel");
        String nombre = sc.nextLine();
        for (int i = 0; i < listaAlojamientos.size(); i++) {
            if (listaAlojamientos.get(i).nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Hemos encontrado alojamientos a tu disposicion");
                System.out.println(listaAlojamientos.get(i).toString());
                System.out.println("Dime el su nueva categoria");
                int categ = sc.nextInt();

            }
        }
        sc.close();
    }

    public void eliminarAlojamientos() {
        //Elimina bien pero cuando le digo que no elimine me repite el bucle varias veces (tantas para llegar a la posicion del alojamiento en el array)
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la pronvincia");
        String provincia = sc.next();
        for (int i = 0; i < listaAlojamientos.size(); i++) {
            if (listaAlojamientos.get(i).provincia.equalsIgnoreCase(provincia)) {
                for (int j = 0; j < listaAlojamientos.size(); j++) {
                    System.out.println("Hemos encontrado alojamientos a tu disposicion");
                    System.out.println("Desea elimninar el alojamiento");
                    System.out.println(listaAlojamientos.get(i).toString());
                    System.out.println("Si es así pulse 1 si es que no pulse 0");
                    int eleccion = sc.nextInt();
                    if (eleccion == 1) {
                        listaAlojamientos.remove(i);
                        System.out.println("Se ha eliminado el alojamiento");
                    } else {
                        System.out.println("No se ha eliminado");
                    }
                }
            }
        }
    }
    
    
    public void consultaOrdenadaNombre(){
            Collections.sort(listaAlojamientos);
            consultaAlojamientos();
    }

    public String FICHERO = "Alojamientos";

    public void crearFicheros() {
        File f = new File(FICHERO);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void escribirFichero(String fichero, ArrayList<Alojamiento> listaAlojamientos) {
        try {
            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 0; i < listaAlojamientos.size(); i++) {
                pw.println(listaAlojamientos.get(i).toString());
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Alojamiento> leerFichero(String fichero) {
        System.out.println("Leyendo el fichero");
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList();
        try {
            Scanner sc = new Scanner(new File(fichero));
            String cadena;
            while (sc.hasNextLine()) {
                cadena = sc.nextLine();
                System.out.println(cadena);
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAlojamientos;
    }

    public void volcarInfoFicheroTexto() {
        escribirFichero(FICHERO, listaAlojamientos);
    }

    public void cargarInfoFicheroTexto() {
        leerFichero(FICHERO);
    }

}
