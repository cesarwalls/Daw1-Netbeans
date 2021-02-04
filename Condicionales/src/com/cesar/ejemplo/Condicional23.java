package com.cesar.ejemplo;

import java.io.IOException;
import java.util.Scanner;

/*En un juego de preguntas a las que se responde “Si” o “No” gana quien responda correctamente 
las tres preguntas. Si se responde mal a cualquiera de ellas ya no se pregunta la siguiente 
y termina el juego. Las preguntas podrían ser:
	1. Colon descubrió América?
	2. La guerra de la independencia fue en el año 1808?
	3. The Doors fue un grupo de rock Americano?*/

public class Condicional23 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Colón descubrió América?");
		char caracter = (char) System.in.read();
		System.in.read();
		if (caracter == 'S') {
			System.out.println("¿La guerra de la independencia fue en el año 1808?");
			System.in.read();
			caracter = (char) System.in.read();
			if (caracter == 'S') {
				System.out.println("¿The Door fue un grupo de rock americano?");
				System.in.read();
				caracter = (char) System.in.read();
				System.in.read();
				if (caracter == 'S') {
					System.out.println("Enhorabuena, has acertado todo");
				} else {
					System.out.println("Te has equivocado, fin del juego");
				}
			} else {
				System.out.println("Te has equivocado, fin del juego");
			}
		} else {
			System.out.println("Te has equivocado, fin del juego");
		}
	}
}
