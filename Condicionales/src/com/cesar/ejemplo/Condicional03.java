package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Intrudoce el dividendo");
		double dividendo = sc.nextDouble();
		System.out.println("Introduce el divisor");
		double divisor = sc.nextDouble();
		double division = dividendo%divisor;
		if (division == 0) {
			System.out.println("Son divisibles");
		} else {
			System.out.println("No son divisibles");
		}
		sc.close();
		

	}

}
