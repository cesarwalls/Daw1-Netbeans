package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número");
		int numero1 = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i*numero1);
		}

	}

}
