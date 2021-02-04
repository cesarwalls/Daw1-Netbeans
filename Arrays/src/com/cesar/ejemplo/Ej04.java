package com.cesar.ejemplo;

public class Ej04 {

	public static void main(String[] args) {
		// TODO code application logic here
		int tabla[][] = new int[10][10];
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				if (i % 2 != 0) {
					tabla[i][j] = 1;
				}
			}

		}

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print(tabla[i][j]);
			}
			System.out.println();
		}

	}

}
