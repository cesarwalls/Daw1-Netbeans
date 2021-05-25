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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class GestorFicheros {

    public static final String FICHERO = "Personal";
    public static final String FICHERO_BINARIO = "PersonalBinario";

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

    public static void escribirFicheroPW(String fichero, ArrayList<Medico> listaMedicos) {
        try {
            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 0; i < listaMedicos.size(); i++) {
                pw.println(listaMedicos.get(i).toString());
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public static ArrayList<Medico> leerFichero(String fichero) {
        System.out.println("leyedo fichero....");
        ArrayList<Medico> listaMedicos = new ArrayList();
        int i = 0;
        try {
            Scanner lf = new Scanner(new File(fichero));
            String cadena;

            while (lf.hasNextLine()) {
                cadena = lf.nextLine();
                String trozos[] = cadena.split(";");
                System.out.println(cadena);
                listaMedicos.add(new Medico(Integer.parseInt(trozos[0]), trozos[1], trozos[2], trozos[3], trozos[4]);
            }

            lf.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaMedicos;
    }
    //Escribir y Leer Ficheros Binario, el array completo de una vez

    public static void escribirFicheroBinario(String fichero, Censo censo) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
            os.writeObject(censo);
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Censo leerFicheroBinario(String fichero) {
        Censo censoE = null;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            censoE = (Censo) os.readObject();
            os.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Clase Censo no encontrada");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return censoE;
    }
//Escribir y Leer Ficheros Binario, elemento por elemento

    public static void escribirFicheroBinarioUnoPorUno(String fichero, ArrayList<Individuo> lista) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i < lista.size(); i++) {
                os.writeObject(lista.get(i));
            }

            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Individuo> leerFicheroBinarioUnoPorUno(String fichero) {
        ArrayList<Individuo> lista = new ArrayList();
        boolean EOF = false; //end of file
        int i = 0;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            while (!EOF) {
                try {
                    lista.add((Individuo) os.readObject());
                } catch (EOFException e) {
                    System.out.println("Se ha alcanzado el final del fichero");
                    EOF = true;
                }
            }
            os.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Clase Individuo [] no encontrada");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

}
