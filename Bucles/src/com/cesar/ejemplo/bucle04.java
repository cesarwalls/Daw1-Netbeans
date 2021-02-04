package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro");
		int numero2 = sc.nextInt();
		int auxiliar;
		if (numero1>numero2) {
			auxiliar = numero2;
			numero2 = numero1;
			numero1 = auxiliar;
			for (int i = numero1+1; i < numero2; i++) {
				System.out.println(i);
				
			}
		}

	}

}


