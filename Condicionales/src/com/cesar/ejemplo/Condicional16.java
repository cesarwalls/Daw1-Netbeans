package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tipo de Zanahoria (A, B, C, D o F)");
		char tipo = sc.next().charAt(0);
		tipo = Character.toLowerCase(tipo);
		System.out.println("Introduce la cantidad");
		double cantidad = sc.nextDouble();
		double precio;
		switch (tipo) {
		case 'a':
			precio = cantidad*1.5;
			System.out.println("El precio de las zanahorias es " +precio + "€");
			break;
		case 'b':
			precio = cantidad*1.8;
			System.out.println("El precio de las zanahorias es " +precio + "€");
			break;
		case 'c':
			precio = cantidad*2.1;
			System.out.println("El precio de las zanahorias es " +precio + "€");
			break;
		case 'd':
			precio = cantidad*2.5;
			System.out.println("El precio de las zanahorias es " +precio + "€");
			break;
		case 'f':
			precio = cantidad*3.2;
			System.out.println("El precio de las zanahorias es " +precio + "€");
		default:
			System.out.println("No ha introducido bien el tipo de zanahoria");
			break;
		}
		sc.close();
	}

}
