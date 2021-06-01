package Libreria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class GestionFicheros {
	public static final String ficheroBinario ="TiendaBinario";
	public static final String ficheroTexto="TiendaTexto";
	
	public static void crearFichero() {
		File f = new File(ficheroBinario);
		File ft=new File(ficheroTexto);
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("Erro de E/E.");
			}
		}
		if(!ft.exists()) {
			try {
				ft.createNewFile();
			} catch (IOException e) {
				System.out.println("Error de E/S.");
			}
		}
	}
	
	public static void escribirFicheroBinario(Tienda t) {
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(ficheroBinario));
			o.writeObject(t);
			o.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error. No se encuentra el archivo.");
		} catch (IOException e) {
			System.out.println("Erro de E/S.");
		}
	}
	public static Tienda leerFicheroBinario() {
		Tienda aux=null;
		try {
			ObjectInputStream o = new ObjectInputStream(new FileInputStream(ficheroBinario));
			aux=(Tienda) o.readObject();
			o.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error. Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error de E/S.");
		} catch (ClassNotFoundException e) {
			System.out.println("Clase no encontrada.");
		}
		return aux;
	}
	public static void escribirFicheroTexto(ArrayList<Cliente> clientes){
		try {
			PrintWriter p = new PrintWriter(ficheroTexto);
			ArrayList<Cliente> f = new ArrayList(clientes);
			for (int i = 0; i < f.size(); i++) {
				p.println(f.get(i).toStringFichero());
			}
			p.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		}
	}
	public static ArrayList<Cliente> leerFicheroTexto(){
		ArrayList<Cliente> aux=new ArrayList();
		String cadena;
		try {
			Scanner lector=new Scanner(new File(ficheroTexto));
			while(lector.hasNextLine()) {
				cadena=lector.nextLine();
				String[] trozos= cadena.split(";");
				String[] fecha=trozos[4].split("-");
				aux.add(new Cliente(trozos[0], trozos[1], LocalDate.of(Integer.valueOf(fecha[0]), Integer.valueOf(fecha[1]), Integer.valueOf(fecha[2]))));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		}
		return aux;
	}

	
}
