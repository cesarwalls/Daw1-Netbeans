package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char caracter = sc.next().charAt(0);
		int ascii = (int)caracter;
		if ((ascii >= 65) && (ascii <=90)) {
			System.out.println("El caracter " + caracter + " es mayúscula");
		} else {
			System.out.println("El caracter " + caracter + " es minúscula");
		}

	}

}
