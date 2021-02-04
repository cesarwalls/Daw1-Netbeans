package com.cesar.ejemplo;

import java.io.IOException;
//import java.util.Scanner;

public class Condicional13 {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char letra;
		letra = (char) System.in.read();
		if ((letra >= 65) && (letra <=90)) {
			System.out.println("El caracter " + letra + " es mayúscula");
		} else if ((letra >= 97) && (letra <=122)){
			System.out.println("El caracter " + letra + " es minúscula");
		} else {
			System.out.println("Es caracter " + letra + " es otro caracter");
		}
		/*char caracter = sc.next().charAt(0);
		int ascii = (int)caracter;
		if ((ascii >= 65) && (ascii <=90)) {
			System.out.println("El caracter " + caracter + " es mayúscula");
		} else if ((ascii >= 97) && (ascii <=122)){
			System.out.println("El caracter " + caracter + " es minúscula");
		} else {
			System.out.println("Es caracter " + caracter + " es otro caracter");
		}
		sc.close();*/
	}

}
