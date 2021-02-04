package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro número");
		int numero2 = sc.nextInt();
		int suma = 0;
		for (int i = 0; i < numero2; i++) {
			suma = suma+numero1;
			
		}
		System.out.println(suma);

		}
		

	}

