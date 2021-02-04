package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		int num2 = 1;
		for (int i = 1; i <= numero;i++) {
			System.out.println(num2);
			num2 = num2*2;
			
			
		}

	}

}
