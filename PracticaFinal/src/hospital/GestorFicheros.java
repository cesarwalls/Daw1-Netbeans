/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesar
 */
public class GestorFicheros {

    public static final String FICHERO = "Hospital";
    public static final String FICHERO_BINARIO = "HospitalBinario";

    public static void crearFicheros() {
        File f = new File(FICHERO);
        File f2 = new File(FICHERO_BINARIO);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            if (!f2.exists()) {
                f2.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void escribirFicheroTexto(String fichero, ArrayList<Personal> listaPersonal, TreeSet<Paciente> listaPacientes) {
        try {
            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 0; i < listaPersonal.size(); i++) {
                pw.println(listaPersonal.get(i).toStringFichero());
            }
            
            Iterator<Paciente> it = listaPacientes.iterator();
            for (int i = 0; i < listaPacientes.size(); i++) {
                pw.println(it.next().toStringFichero());
            }
            pw.close();

        } catch (IOException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void leerFicheroTexto(String fichero) {
        System.out.println("leyendo fichero....");
        ArrayList<Personal> listaPersonal = new ArrayList();
        TreeSet<Paciente> listaPacientes = new TreeSet<>();
        int i = 0;
        try {
            Scanner lf = new Scanner(new File(fichero));
            String cadena;
            while (lf.hasNextLine()) {
                cadena = lf.nextLine();
                String trozos[] = cadena.split(";");
                System.out.println(cadena);
                if (trozos[3].equalsIgnoreCase("Medico")) {
                    listaPersonal.add(new Medico(Integer.parseInt(trozos[0]), Integer.parseInt(trozos[1]), Boolean.parseBoolean(trozos[2]), trozos[3], Integer.parseInt(trozos[4]), trozos[5]));
                } else {
                    listaPacientes.add(new Paciente(Integer.parseInt(trozos[0]), Integer.parseInt(trozos[1]), Boolean.parseBoolean(trozos[2]), trozos[3], Integer.parseInt(trozos[4])));
                }
            }
            lf.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error al encontrar el fichero");
        }
    }

    
    public static void escribirFicheroBinario(String fichero, Hospital hospital) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
            os.writeObject(hospital);
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Hospital leerFicheroBinario(String fichero) {
        Hospital hospitalE = null;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            hospitalE = (Hospital) os.readObject();
            os.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Clase Hospital no encontrada");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return hospitalE;
    }

}
