package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		for (int i = numero; i > 0; i--) {
			for (int j = i; j <= numero; j++) {
				System.out.print('*');
			}

			System.out.println();

		}

	}
}
