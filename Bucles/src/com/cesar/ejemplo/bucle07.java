package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número");
		int numero1 = sc.nextInt();
		int suma = 0;
		double media = 0; 
		for (int i = 0; i < numero1; i++) {
			System.out.println("Introduce otro número");
			int numero2 = sc.nextInt();
			suma = numero2+suma;
			media = suma/numero1;
			
			
		}
		System.out.println("Suma " +suma);
		System.out.println("Media "+media);
		
		
		
		

	}

}
