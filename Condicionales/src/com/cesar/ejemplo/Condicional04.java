package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del lado 1 del triangulo");
		double lado1 = sc.nextDouble();
		System.out.println("Introduce el tamaño del lado 2 del triangulo");
		double lado2 = sc.nextDouble();
		System.out.println("Introduce el tamaño del lado 3 del triangulo");
		double lado3 = sc.nextDouble();
		if((lado1<(lado2+lado3)) && (lado2<(lado1+lado3)) && (lado3< (lado1+lado2))) {
			System.out.println("Se puede formar el triángulo");
		} else {
			System.out.println("No se puede formar el triángulo");
		}

		sc.close();
	}

}
