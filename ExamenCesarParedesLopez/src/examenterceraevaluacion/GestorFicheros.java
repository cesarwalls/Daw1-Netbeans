package examenterceraevaluacion;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prog
 */
public class GestorFicheros {

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
  

}
