/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prog
 */
public class GestorFicheros {

    public static final String FICHERO_TEXTO = "AeropuertoTexto";

    public static final String FICHERO_BINARIO = "AeropuertoBinario";

    public static void crearFicheros() {
        File f1 = new File(FICHERO_TEXTO);
        File f2 = new File(FICHERO_BINARIO);
        if (!f1.exists()) {
            f1 = new File(FICHERO_TEXTO);
        }
        if (!f2.exists()) {
            f2 = new File(FICHERO_BINARIO);
        }

    }

    public static void escribirFicheroTexto(String fichero, ArrayList<Vuelo> listaVuelos) {
        try {
            PrintWriter pw = new PrintWriter(FICHERO_TEXTO);
            for (int i = 0; i < listaVuelos.size(); i++) {
                  pw.println(listaVuelos.get(i).toStringFichero());
            }
            pw.close();
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

  /* public static void leerFichero(String fichero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Leyendo fichero...");
        ArrayList<Vuelo> listaVuelos = null;
        String cadena = null;
        if (sc.hasNextLine()) {
            cadena = sc.nextLine();
        }
        String trozos[] = cadena.split(";");
        System.out.println(cadena);
        for (int i = 0; i < trozos.length; i++) {
            if (listaVuelos.get(i).nombre.contains("Internacional")) {
                listaVuelos.add(new VueloInternacional(Boolean.parseBoolean(trozos[0]), Integer.parseInt(trozos[1]), trozos[2], Integer.parseInt(trozos[3]), trozos[4],
                        trozos[5], trozos[6], LocalDate.parse(trozos[7]), Integer.parseInt(trozos[8]), Double.parseDouble(trozos[9]), trozos[10]));
            } else if (listaVuelos.get(i).nombre.contains("Nacional")) {
                listaVuelos.add(new VueloNacional(Integer.parseInt(trozos[0]), trozos[1], trozos[2], trozos[3],
                        LocalDate.parse(trozos[4]), Integer.parseInt(trozos[5]), Double.parseDouble(trozos[6]), trozos[7]));
            }

        }
    }*/

}
