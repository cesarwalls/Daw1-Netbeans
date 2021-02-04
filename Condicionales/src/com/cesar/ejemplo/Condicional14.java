package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int numero2 = sc.nextInt();
		System.out.println("Introduce el tercer numero");
		int numero3 = sc.nextInt();
		System.out.println("Introduce el cuarto numero");
		int numero4 = sc.nextInt();

		if (numero2 == 0 || numero4 == 0) {
			System.out.println("No se pueden dividir");
		} else {

			if ((numero1 / numero2) > (numero3 / numero4)) {
				System.out.println(numero1 + numero2 + numero3 + numero4);

			} else {
				System.out.println(numero2+numero4);
			}
		}
		sc.close();

	}

}
