package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceme tu nombre");
		String nombre = sc.next();
		System.out.println("Introduceme las horas trabajadas en una semana");
		int horas = sc.nextInt();
		double sueldo;
		if (horas <= 35) {
			sueldo = horas * 9;

		} else {
			sueldo = (35 * 9) + ((horas - 35) * 10.35);

		}

		if (sueldo < 1262) {
			System.out.println(
					"El trabajador: " + nombre + " trabajando " + horas + " horas" + " gana en bruto " + sueldo + "pagando en impuestos 0€");
		} else if (sueldo > 1262 && sueldo < 1532) {
			double impuestos = (sueldo - 1262) * 0.20;
			System.out.println("El trabajador: " + nombre + " trabajando " + horas + " horas" + " gana en bruto "
					+ sueldo + " pagando en impuestos " + impuestos);

		} else {
			double impuestos = 270 * 0.20 + (sueldo - 1532) * 0.30;
			System.out.println("El trabajador: " + nombre + " trabajando " + horas + " horas" + " gana en bruto "
					+ sueldo + " pagando en impuestos " + impuestos);

		}

	}
}
