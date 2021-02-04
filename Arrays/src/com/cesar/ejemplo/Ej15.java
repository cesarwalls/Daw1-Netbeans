package com.cesar.ejemplo;

import java.io.IOException;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		char tabla[] = new char[10];
		char caracter = 0;

		System.out.println("Introduce caracteres");

		for (int i = 0; i < tabla.length; i++) {
			caracter = (char) System.in.read();
			tabla[i] = caracter;

			if (caracter < tabla.length) {
				
			} else {
				System.out.println("Te has pasado de caracteres");
			}

		}

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == 'a' || tabla[i] == 'e' || tabla[i] == 'i' || tabla[i] == 'o' || tabla[i] == 'u') {
				tabla[i] = '*';
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + "    ");
		}

	}

}