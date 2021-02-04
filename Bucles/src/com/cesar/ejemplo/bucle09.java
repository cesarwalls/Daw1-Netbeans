package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número");
		int numero = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <=numero; i++) {
			factorial = factorial*i;
			
		}
		System.out.println(factorial);
	}

}
