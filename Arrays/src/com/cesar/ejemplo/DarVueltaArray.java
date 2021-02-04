package com.cesar.ejemplo;


public class DarVueltaArray {

	public static void main(String[] args) {
		int coleccion[] = new int[5];
		int auxiliar = 0;
		int temporal = 0;

		for (int i = 0; i < coleccion.length; i++) {
			coleccion[i] = (int) (Math.random() * 100);

		}

		for (int i = 0; i < coleccion.length; i++) {
			System.out.print(coleccion[i] + " * ");
		}

		System.out.println();
		for (int i = 0; i < coleccion.length; i++) {
			for (int j = 0; j < coleccion.length - 1; j++) {
				if (coleccion[j] > coleccion[j + 1]) {
					auxiliar = coleccion[i];
					coleccion[j] = coleccion[j + 1];
					coleccion[j + 1] = auxiliar;
				}

			}

		}

		System.out.println();

		for (int i = 0; i < coleccion.length; i++) {
			System.out.print(coleccion[i] + " * ");
		}

	}

}
