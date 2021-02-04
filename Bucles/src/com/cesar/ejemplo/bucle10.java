package com.cesar.ejemplo;

import java.util.Scanner;

public class bucle10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número");
		int numero = sc.nextInt();
		int par=0;
		int impar=0;
		for (int i = 0; i <numero; i++) {
			if (i%2==0) {
				par++;
			} else {
				impar++;
			}
			
		}
		System.out.println("El número de números pares es " +par);
		System.out.println("El número de números impares es " +impar);
	}

}
