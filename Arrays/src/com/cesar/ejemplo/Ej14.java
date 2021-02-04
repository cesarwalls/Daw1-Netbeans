package com.cesar.ejemplo;

import java.util.Scanner;

public class Ej14 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce cantidad de valores a introducir");
		int n = lector.nextInt();
		int[] numeros = new int[n];
		int[] cont = new int[n];
		int[] repes = new int[n];
		
		System.out.println("Introduce valores");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = lector.nextInt();
			repes[i] = numeros[i];
		}
		
		System.out.println("Repetidos: ");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i; j < numeros.length; j++) {
				if (numeros[i] == repes[j] && i != j) {

					if (cont[i] > 0)
						repes[j] = 0;
					cont[i]++;
				}
			}

		}
		for (int i = 0; i < cont.length; i++) {
			if (cont[i] > 0) {
				System.out.println("El numero " + repes[i] + " se repite " + cont[i] + " veces");

			}
		}

	}

}
