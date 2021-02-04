package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceme el importe");
		double importe = sc.nextDouble();
		if (importe<10) {
			System.out.println("El importe es "+importe);
		} else if (importe >= 10 && importe <=30) {
			System.out.println("El importe es "+(importe*0.90));
		} else {
			System.out.println("El importe es "+(importe*0.80));
		}
		sc.close();
	}
}
