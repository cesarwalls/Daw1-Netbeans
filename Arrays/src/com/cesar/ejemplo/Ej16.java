package com.cesar.ejemplo;

import java.io.IOException;
import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) throws IOException {
		Scanner lector = new Scanner(System.in);

		char caracter;
		System.out.println("Introduce la cantidad de car�cteres que quieres usar");
		int numerocaracteres = lector.nextInt();

		char tabla[] = new char[numerocaracteres];
		System.out.println("Introduce car�cteres");
		for (int i = 0; i < numerocaracteres; i++) {
			tabla[i] = caracter = (char) (System.in.read());
		}

		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i]);
		}

		System.out.println();

		for (int i = 0, j = tabla.length - 1; i < tabla.length; i++, j--) {
			if (tabla[i] == tabla[j]) {
				System.out.println("Es un pal�ndromo");
			}

		}

	}
}
