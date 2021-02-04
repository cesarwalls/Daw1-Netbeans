package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro");
		int numero2 = sc.nextInt();
		if (numero2 > numero1) {
			for (int i = numero2 - 1; i > numero1; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("No se puede hacer");
		}

	}

}
