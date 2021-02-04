package com.cesar.ejemplo;

import java.io.IOException;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int numA;
		int contador = 0;
		int contador2 = 0;
		int opcion;
		char caracter;

		do {
			System.out.println("Elige una opci�n del menu");
			System.out.println("1 para calcular el producto de los n�meros que sean pares");
			System.out.println("2 para contar cuantas 'A' � 'a' hay en una frase acabada en punto");
			System.out.println("3 para salir del programa");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				int producto = 1;
				do {
					System.out.println("Introduce un n�mero");
					numA = sc.nextInt();
					if (numA % 2 == 0) {
						producto = producto * numA;
					}
				} while (numA != 1);
				System.out.println("Su producto es " + producto);
				break;

			case 2:
				System.out.println("Introduce una frase terminandola con un punto");
				do {
					caracter = (char) System.in.read();
					if (caracter == 'a' || caracter == 'A') {
						contador2++;
					}
				} while (caracter != '.');
				System.out.println("La letra 'a' o 'A' aparece " + contador2 + " veces");
				break;

			case 3:
				System.out.println("El programa ha finalizado");
				break;

			default:
				System.out.println("Se ha equivocado de opci�n, teclee de nuevo");
				break;
			}

		} while (!(opcion == 3));
		sc.close();
	}

}
