package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce otro número");
		double numero2= sc.nextDouble();
		if(numero1<numero2) {
			System.out.println(numero1);
			System.out.println(numero2);
		} else {
			System.out.println(numero2);
			System.out.println(numero1);
		}
		
		sc.close();
	}

}
