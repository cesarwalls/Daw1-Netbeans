package Libreria;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		GestionFicheros.crearFichero();
		Tienda t = new Tienda();
		Scanner lector = new Scanner(System.in);
		boolean correcto=true;
		int numero=0;
		
		do {	
		System.out.println("Pulsa un número para seleccionar.");
		do {
			correcto=true;
		System.out.println("1. Acceder a la tienda.");
		System.out.println("2. Gestionar tienda.");
		System.out.println("3. Salir.");
		
		try {
		numero=lector.nextInt();
		switch(numero) {
		case 1:
			int seleccion=0;
			boolean excepcion=false;
			System.out.println("Bienvenid@. ");
			System.out.println("Top 5 más vendidos:");
			t.listarMasVendidos(5);
			System.out.println();
			do {
			do {
			System.out.println("1. Buscar libro.");
			System.out.println("2. Ordenar libros.");
			System.out.println("3. Registrarse.");
			System.out.println("4. Atrás.");
			try {
			seleccion=lector.nextInt();
			switch(seleccion) {
			case 1:
				t.buscarLibros();
				break;
			case 2:
				t.ordenarLibros();
				break;
			case 3:
				t.registrarse();
				break;
			}
			}catch(InputMismatchException e) {
				System.out.println("Por favor, introduce un número en lugar de una letra.");
				lector.nextLine();
				excepcion=true;
			}
			}while(excepcion);
			}while(seleccion!=4);
			break;
		case 2:
			do {
			
			}while(!t.iniciarSesionAdmin());
			int opcion=0;
			boolean correcto2=true;
			do {
			System.out.println("Pulsa un número para seleccionar.");
			do {
			System.out.println("1. Gestionar libros.");
			System.out.println("2. Gestionar ofertas.");
			System.out.println("3. Modificar administrador.");
			System.out.println("4. Gestión de usuarios.");
			System.out.println("5. Gestionar facturas.");
			System.out.println("6. Añadir nuevo administrador.");
			System.out.println("7. Guardar cambios de la tienda.");
			System.out.println("8. Atrás.");
			try {
				opcion=lector.nextInt();
				switch(opcion) {
				case 1:
					t.gestionarLibros();
					break;
				case 2:
					t.gestionarOfertas();
					break;
				case 3:
					t.modificarAdmin();
					break;
				case 4:
					t.gestionarUsuarios();
					break;
				case 5:
					t.gestionarFacturas();
					break;
				case 6:
					t.agregarAdmin();
					break;
				case 7:
					GestionFicheros.escribirFicheroBinario(t);
					GestionFicheros.escribirFicheroTexto(t.getClientes());
					System.out.println("Los cambios de la tienda se han guardado correctamente.");
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
				correcto2=false;
			}
			}while(!correcto);
			}while(opcion!=8);
			break;
		case 3:
			System.out.println("¡Hasta pronto!");
			break;
		default:
			System.out.println("Introduce un número entre 1 y 3 para seleccionar.");
		}
		}catch(InputMismatchException e) {
			System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			correcto=false;
			lector.nextLine();
		}
		}while(!correcto);
		
		}while(numero!=3);
		GestionFicheros.escribirFicheroBinario(t);
		GestionFicheros.escribirFicheroTexto(t.getClientes());
		
	}
}
