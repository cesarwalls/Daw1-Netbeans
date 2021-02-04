package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce otro número");
		double numero2 = sc.nextDouble();
		if (numero1 < numero2) {
			double division = numero2 % numero1;
			if (division == 0) {
				double resta = numero2 - numero1;
				System.out.println("La resta es " + resta);
			} else {
				double suma = numero1 + numero2;
				System.out.println("La suma es " + suma);
			}

		} else {
			double division = numero1 % numero2;
			if (division == 0) {
				double resta = numero1 - numero2;
				System.out.println("La resta es " + resta);
			} else {
				double suma = numero1 + numero2;
				System.out.println("La suma es " + suma);
			}
		}
		sc.close();

	}
}
