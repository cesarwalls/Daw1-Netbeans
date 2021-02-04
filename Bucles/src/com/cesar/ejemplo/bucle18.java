package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1+",");
		System.out.print(num2+",");
		for (int i = 1; i <= numero;i++) {
			int num3 = num1+num2;
			System.out.print(num3+",");
			num1 = num2;
			num2 = num3;
			
			
		}

	}

}
