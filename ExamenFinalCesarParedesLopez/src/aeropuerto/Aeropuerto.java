/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author prog
 */
public class Aeropuerto {

    ArrayList<Vuelo> listaVuelos;

    public Aeropuerto() {
        listaVuelos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                listaVuelos.add(new VueloInternacional());
            } else {
                listaVuelos.add(new VueloNacional());
            }
        }
    }

    public Aeropuerto(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    public void listarVuelosTotales() {
        for (int i = 0; i < listaVuelos.size(); i++) {
            System.out.println(listaVuelos.get(i).toStringFichero());

        }
    }

    public void consultaVuelo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el origen del vuelo");
        String origen = sc.nextLine();
        System.out.println("Dime el destino del vuelo");
        String destino = sc.nextLine();
        System.out.println("Dime el precio mínimo del vuelo");
        int precioMinimo = sc.nextInt();
        System.out.println("Dime el precio máximo del vuelo");
        int precioMaximo = sc.nextInt();

        for (int i = 0; i < listaVuelos.size(); i++) {
            if (listaVuelos.get(i).origen.equalsIgnoreCase(origen) && listaVuelos.get(i).destino.equalsIgnoreCase(destino)
                    && listaVuelos.get(i).getPrecioBase() <= precioMaximo && listaVuelos.get(i).getPrecioBase() >= precioMinimo) {
                System.out.println("Este es tu vuelo");
                System.out.println(listaVuelos.get(i).toStringFichero());
            }
        }
    }

    public void consultaVueloPorPrecio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el origen del vuelo");
        String origen = sc.nextLine();
        System.out.println("Dime el destino del vuelo");
        String destino = sc.nextLine();
        for (int i = 0; i < listaVuelos.size(); i++) {
            if (listaVuelos.get(i).origen.equalsIgnoreCase(origen) && listaVuelos.get(i).destino.equalsIgnoreCase(destino)) {
                Collections.sort(listaVuelos, new porPrecio());
                System.out.println(listaVuelos.get(i).toStringFichero());

            }
        }
    }

    public void eliminarVuelos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el origen del vuelo");
        String origen = sc.nextLine();
        System.out.println("Dime el destino del vuelo");
        String destino = sc.nextLine();
        for (int i = 0; i < listaVuelos.size(); i++) {
            if (listaVuelos.get(i).origen.equalsIgnoreCase(origen) && listaVuelos.get(i).destino.equalsIgnoreCase(destino)) {
                System.out.println("Este es su vuelo");
                System.out.println(listaVuelos.get(i).toStringFichero());
                System.out.println("Si desea eliminar pulse 1, si no pulse cualquier otra número");
                int eleccion = sc.nextInt();
                if (eleccion == 1) {
                    listaVuelos.remove(i);
                    i = 0;
                    System.out.println("Su vuelvo ha sido eliminado");
                }
            }
        }
    }

    public void leerFicheroTexto() {
        //GestorFicheros.leerFichero(GestorFicheros.FICHERO_TEXTO);
    }

    public void escribirFicheroTexto() {
        GestorFicheros.escribirFicheroTexto(GestorFicheros.FICHERO_TEXTO, listaVuelos);
    }

    public void anadirVuelo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija 1 si quiere Vuelo Internacional o 2 si quiere Vuelo Nacional");
        int eleccion = sc.nextInt();
        if (eleccion == 1) {
            System.out.println("Si hace escala pulse 1 si no hace pulse 0");
            boolean escala;
            int numEscalas;
            int eleEsca = sc.nextInt();
            String escalas = null;
            ArrayList<String> listaEscalas = null;
            if (eleEsca == 1) {
                escala = true;
                System.out.println("Dime cuantas escalas quieres");
                numEscalas = sc.nextInt();
                for (int j = 0; j < numEscalas; j++) {
                    System.out.println("Dime cuales son sus escalas");
                    sc.next();
                    escalas = sc.nextLine();
                }
                for (int j = 0; j < numEscalas; j++) {
                    listaEscalas.add(escalas);
                }
            } else {
                escala = false;
                numEscalas = 0;
                escalas = "No hay escalas";
            }
            System.out.println("Dime su ID");
            int id = sc.nextInt();
            System.out.println("Dime su Aerolinea");
            sc.next();
            String aerolinea = sc.nextLine();
            System.out.println("Dime su origen");
            String origen = sc.nextLine();
            System.out.println("Dime su destino");
            String destino = sc.nextLine();
            System.out.println("Vamos a decir su fecha");
            System.out.println("Dime su día");
            int dia = sc.nextInt();
            System.out.println("Dime su mes");
            int mes = sc.nextInt();
            System.out.println("Dime su anyo");
            int anyo = sc.nextInt();
            LocalDate fecha = LocalDate.of(anyo, mes, dia);
            System.out.println("Dime el numero de pasajeros");
            int numPasajeros = sc.nextInt();
            System.out.println("Dime el precio del vuelo");
            double precioVuelo = sc.nextDouble();
            System.out.println("Dime el nombre del vuelo");
            sc.next();
            String nombre = sc.nextLine();
            VueloInternacional vueloInternacional = new VueloInternacional(escala, numEscalas, listaEscalas, id, aerolinea, origen, destino, fecha, numPasajeros, precioVuelo, nombre);
            listaVuelos.add(vueloInternacional);
            System.out.println("Su vuelo ha sido añadido");
            System.out.println("Su vuelo " + vueloInternacional.toStringFichero() + " ha sido añadido");
            System.out.println("Aquí está");
            listarVuelosTotales();

        } else if (eleccion == 2) {
            System.out.println("Ha elegido Vuelo Nacional");
            System.out.println("Dime su ID");
            int id = sc.nextInt();
            System.out.println("Dime su Aerolinea");
            sc.next();
            String aerolinea = sc.nextLine();
            System.out.println("Dime su origen");
            String origen = sc.nextLine();
            System.out.println("Dime su destino");
            String destino = sc.nextLine();
            System.out.println("Vamos a decir su fecha");
            System.out.println("Dime su día");
            int dia = sc.nextInt();
            System.out.println("Dime su mes");
            int mes = sc.nextInt();
            System.out.println("Dime su anyo");
            int anyo = sc.nextInt();
            LocalDate fecha = LocalDate.of(anyo, mes, dia);
            System.out.println("Dime el numero de pasajeros");
            int numPasajeros = sc.nextInt();
            System.out.println("Dime el precio del vuelo");
            double precioVuelo = sc.nextDouble();
            System.out.println("Dime el nombre del vuelo");
            sc.next();
            String nombre = sc.nextLine();
            Vuelo vueloNacional = new VueloNacional(id, aerolinea, origen, destino, fecha, numPasajeros, precioVuelo, nombre);
            listaVuelos.add(vueloNacional);
            System.out.println("Su vuelo " + vueloNacional.toStringFichero() + " ha sido añadido");
            System.out.println("Aquí está");
            listarVuelosTotales();
        }
    }

    public void ordenarRentabilidadAscendente() {
        Collections.sort(listaVuelos, new porRentabilidadAscendente());
        listarVuelosTotales();
    }

    public void ordenarRentabilidadDescente() {
        Collections.sort(listaVuelos, new porRentabilidadDecendente());
        listarVuelosTotales();
    }
    
    public void ordenarRentabilidad() {
        Collections.sort(listaVuelos, new porRentabilidad());
        listarVuelosTotales();
    }
    
    

    public void actualizarVuelo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime su ID");
        int ID = sc.nextInt();
        for (int i = 0; i < listaVuelos.size(); i++) {
            if (listaVuelos.get(i) instanceof VueloInternacional && listaVuelos.get(i).id == ID) {
                ((VueloInternacional) listaVuelos.get(i)).setEscala(true);
                System.out.println("Tu vuelo ahora tiene escala");
                System.out.println("Dime cuantas escalas quieres");
                int numEscalas = sc.nextInt();
                String escalas = null;
                for (int j = 0; j < numEscalas; j++) {
                    System.out.println("Dime cuales son sus escalas");
                    sc.next();
                    escalas = sc.nextLine();
                }
                ArrayList<String> listaEscalas = null;
                for (int j = 0; j < numEscalas; j++) {
                    listaEscalas.add(escalas);
                }
                ((VueloInternacional) listaVuelos.get(i)).setNumEscalas(numEscalas);
                ((VueloInternacional) listaVuelos.get(i)).setListaPaises(listaEscalas);
                System.out.println("Vuelo modificado");
                System.out.println("Ahora es " + ((VueloInternacional) listaVuelos.get(i)).toStringFichero());
            }
        }

    }
}
