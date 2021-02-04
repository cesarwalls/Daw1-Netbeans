package com.cesar.ejemplo;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = (int) (Math.random() * 10) + 1;
		int numB;
		int contador = 0;
		do {
			System.out.println("El numero aleatorio es " + numA); // para comprobar el n�mero
			System.out.println("Introduce un n�mero");
			numB = sc.nextInt();
			if (numB < 0 || numB > 10) {
				System.out.println("Te has equivocado");
				System.out.println();
			} else {
				contador++;
				if (contador == 3) {
					System.out.println("Te has pasado de intentos");
				} else {
					System.out.println("Ronda " + contador); // para ver el n�mero de rondas
					if (numB == numA) {
						System.out.println("Ha adivinado el n�mero");
					} else {
						System.out.println("Vuelva a intentarlo");
						if (((numA - numB) > 2) || ((numA - numB) < -2)) {
							System.out.println("La resta es " + (numA - numB));
							System.out.println("Fr�o, fr�o");
						} else {
							System.out.println("La resta es " + (numA - numB));
							System.out.println("Caliente, caliente");
						}
					}
				}
			}

		} while ((numB < 0) || (numB > 10) || ((numB != numA) && (contador != 3)));
		sc.close();
	}
}
