/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocolecciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesar
 */
public class Gestor {

    public static final String FICHERO = "Fichero";
    public static final String FICHERO_BINARIO = "Fichero_Binario";

    public static void crearFicheros() throws IOException {
        File f1 = new File(FICHERO);
        File f2 = new File(FICHERO_BINARIO);
        if (!f1.exists()) {
            f1.createNewFile();
        } else if (!f2.exists()) {
            f2.createNewFile();
        }
    }
    
    public static void escribirFicheroBinario(String fichero, Censo censo) {
        try {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
        os.writeObject(censo);
       
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
}
    
    public static Censo leerFicheroBinario (String fichero){
        Censo censoE = null;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            censoE = (Censo)os.readObject();
            os.close();
        } catch (IOException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return censoE;
    } 
    
    public static void escribirFicheroTexto (String fichero, )
    
}
