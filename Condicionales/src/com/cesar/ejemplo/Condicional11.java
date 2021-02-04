package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce el segundo número");
		double numero2 = sc.nextDouble();
		System.out.println("Introduce el tercer número");
		double numero3 = sc.nextDouble();
		double Mayor;
		double Menor;
		double Medio;
		if (numero1 > numero2 && numero2 > numero3) {
			Mayor = numero1;
		} else if (numero2 > numero1 && numero2 > numero3) {
			Mayor = numero2;
		} else {
			Mayor = numero3;
		}

		if (numero1 < numero2 && numero1 < numero3) {
			Menor = numero1;
		} else if (numero2 < numero1 && numero2 < numero3) {
			Menor = numero2;
		} else {
			Menor = numero3;
		}
		Medio = (numero1 + numero2 + numero3) - (Mayor + Menor);
		System.out.println("El orden ascendente de los numero es " + Menor + "_" + "_" + Medio + "_" + "_" + Mayor);

		sc.close();
	}

}
