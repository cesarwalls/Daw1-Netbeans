package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce el segundo número");
		double numero2 = sc.nextDouble();
		System.out.println("Introduce el tercer número");
		double numero3 = sc.nextDouble();
		
		if ((numero1>numero2) && (numero1 > numero3)) {
			System.out.println("El número 1 es el mayor");
		} else if ((numero2>numero1) && (numero2>numero3)) {
			System.out.println("El número 2 es el mayor");
		} else if ((numero3>numero1) && (numero3>numero2)) {
			System.out.println("El número 3 es el mayor");
		} else {
			System.out.println("No hay un número mayor a todos");
		}

		sc.close();
	}

}
