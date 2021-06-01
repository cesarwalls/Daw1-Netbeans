package roberto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorFicheros {
    public static final File ALOJAMIENTOSB=new File("alojamientosbinario");
    public static final File CASASRURALES=new File("casasrurales");
    public static final File ALOJAMIENTOS=new File("alojamientos");
    public static void guardarBinario(ArrayList<Alojamiento> alojamientos){
        try {
            if(!ALOJAMIENTOSB.exists()){
                ALOJAMIENTOSB.createNewFile();
            }
            if(!CASASRURALES.exists()){
                CASASRURALES.createNewFile();
            }
            ObjectOutputStream guardar1=new ObjectOutputStream(new FileOutputStream(ALOJAMIENTOSB));
            ObjectOutputStream guardar2=new ObjectOutputStream(new FileOutputStream(CASASRURALES));
            guardar1.writeObject(alojamientos);
            for (int i = 0; i < alojamientos.size(); i++) {
                if(alojamientos.get(i) instanceof CasaRural)
                    guardar2.writeObject(alojamientos.get(i));
            }
            guardar1.close();
            guardar2.close();
        } catch (IOException ex) {
                System.out.println("Error al guardar el fichero");
        }
    }
    public static ArrayList<Alojamiento> cargarBinario(){
        ArrayList<Alojamiento> alojamientos=null;
        try {
            ObjectInputStream cargar=new ObjectInputStream(new FileInputStream(ALOJAMIENTOSB));
            alojamientos=(ArrayList<Alojamiento>)cargar.readObject();
            cargar.close();
        } catch (IOException | ClassNotFoundException ex) {
                System.out.println("Error al cargar el fichero");
        }
        return alojamientos;
     }
    public static void guardarFichero(ArrayList<Alojamiento> alojamientos){
        
        try {
            FileWriter guardar = new FileWriter(ALOJAMIENTOS);
            for (int i = 0; i < alojamientos.size(); i++) {
            guardar.write(alojamientos.get(i).toStringFichero()+"\n");
            }
            guardar.close();
        } catch (IOException ex) {
            System.out.println("Error al guardar el fichero");
        }
        
        
    }
    public static ArrayList<Alojamiento> cargarFichero(){
        ArrayList<Alojamiento> alojamientos=new ArrayList();
        try {
            Scanner cargar=new Scanner(new FileReader(ALOJAMIENTOS));
            String [] cachos;
            while(cargar.hasNext()){
                cachos=cargar.nextLine().split(";");
                if(cachos[0].equalsIgnoreCase("Hotel"))
                    alojamientos.add(new Hotel(cachos[1],cachos[2],Integer.parseInt(cachos[3]),cachos[4],Integer.parseInt(cachos[5])));
                else
                    alojamientos.add(new CasaRural(cachos[1],cachos[2],Integer.parseInt(cachos[3]),Boolean.parseBoolean(cachos[4])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error al cargar el fichero");
        }
        return alojamientos;
    }
        
    }
            

