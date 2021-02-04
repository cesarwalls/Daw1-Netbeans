package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce otro número");
		double numero2 = sc.nextDouble();
		if (numero1 < numero2) {
			System.out.println("El número 1: " + numero1 + " es el menor");
			System.out.println("El número 2: " + numero2 + " es el mayor");

		} else if (numero1 == numero2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("El número 2: " + numero2 + " es el menor");
			System.out.println("El número 1: " + numero1 + " es el mayor");

		}

		sc.close();
	}

}
