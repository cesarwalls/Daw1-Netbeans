package com.cesar.ejemplo;

import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aux = 0;
		int nummayor = 0;
		int nummenor = 0;
		int posicionmayor = 0;
		int posicionmenor = 0;
		int opcion;
		int array[] = new int[7];

		do {
			System.out.println("Introduce 1 si quieres introducir el n�mero de ejercicios que has hecho a mano");
			System.out.println("Introduce 2 si quieres que el n�mero de ejercicios se te asigne aleatoriamente ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				for (int i = 0; i < array.length; i++) {
					System.out.println("Introduce desde el 1 al 20 los ejercicios que has hecho");
					if (i == 0) {
						System.out.println("Lunes");

					} else if (i == 1) {
						System.out.println("Martes");

					} else if (i == 2) {
						System.out.println("Mi�rcoles");

					} else if (i == 3) {
						System.out.println("Jueves");

					} else if (i == 4) {
						System.out.println("Viernes");

					} else if (i == 5) {
						System.out.println("S�bado");

					} else if (i == 6) {
						System.out.println("Domingo");

					}
					array[i] = sc.nextInt();
				}
				break;

			case 2:
				for (int i = 0; i < array.length; i++) {
					array[i] = (int) (Math.random() * 20) + 1;
				}
				break;

			default:
				System.out.println("Te has equivocado de opci�n, vuelve a empezar");
				System.out.println();
				break;
			}

		} while (opcion < 0 || opcion > 3);

		System.out.println();
		System.out.println("Imprimiendo array original");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " * ");
		}

		int array2[] = new int[7];

		for (int i = 0; i < array2.length; i++) {
			array2[i] = array[i];

		}

		System.out.println();
		System.out.println("Imprimiendo copia");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " * ");
		}

		for (int j = 0; j < array2.length - 1; j++) {
			for (int i = 0; i < array2.length - 1; i++) {
				if (array2[i] > array2[i + 1]) {
					aux = array2[i];
					array2[i] = array2[i + 1];
					array2[i + 1] = aux;
				}
			}

		}

		System.out.println();
		System.out.println("Imprimiendo la ordenaci�n");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " * ");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > nummayor) {
				nummayor = array[i];
				posicionmayor = i + 1;

			}

		}
		nummenor = nummayor;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] < nummenor) && (array[i] != 0)) {
				nummenor = array[i];
				posicionmenor = i + 1;

			}

		}
		System.out.println();
		switch (posicionmayor) {
		case 1:
			System.out.println("El numero mayor es " + nummayor + " y su d�a es Lunes");
			break;
		case 2:
			System.out.println("El numero mayor es " + nummayor + " y su d�a es Martes");
			break;
		case 3:
			System.out.println("El numero mayor es " + nummayor + " y su d�a es Mi�rcoles");
			break;
		case 4:
			System.out.println("El numero mayor es " + nummayor + " y su d�a es Jueves");
			break;
		case 5:
			System.out.println("El numero mayor es " + nummayor + " y su d�a es Viernes");
			break;
		case 6:
			System.out.println("El numero mayor es " + nummayor + " y su d�a es S�bado");
			break;
		default:
			System.out.println("El numero mayor es " + nummayor + " y su d�a es Domingo");
			break;
		}

		switch (posicionmenor) {
		case 1:
			System.out.println("El n�mero menor es " + nummenor + " y su d�a es Lunes");
			break;
		case 2:
			System.out.println("El n�mero menor es " + nummenor + " y su d�a es Martes");
			break;
		case 3:
			System.out.println("El n�mero menor es " + nummenor + " y su d�a es Mi�rcoles");
			break;
		case 4:
			System.out.println("El n�mero menor es " + nummenor + " y su d�a es Jueves");
			break;
		case 5:
			System.out.println("El n�mero menor es " + nummenor + " y su d�a es Viernes");
			break;
		case 6:
			System.out.println("El n�mero menor es " + nummenor + " y su d�a es S�bado");
			break;
		default:
			System.out.println("El n�mero menor es " + nummenor + " y su d�a es Domingo");
			break;
		}
		sc.close();

	}

}
