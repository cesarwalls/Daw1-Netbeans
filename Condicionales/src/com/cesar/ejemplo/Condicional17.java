package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce el segundo n�mero");
		double numero2 = sc.nextDouble();
		System.out.println("Introduce s�mbolo ('+','-',':' o 'x'");
		char tipo = sc.next().charAt(0);
		tipo = Character.toLowerCase(tipo);
		switch (tipo) {
		case '+':
			System.out.println("Ha elegido suma y el resultado es " +(numero1+numero2));
			break;
		case '-':
			System.out.println("Ha elegido resta y el resultado es " +(numero1-numero2));
			break;
		case ':':
		case '/':
			System.out.println("Ha elegido divisi�n y el resultado es " +(numero1/numero2));
			break;
		case 'x':
		case '*':
			System.out.println("Ha elegido multiplicaci�n y el resultado es " +(numero1*numero2));
			break;
		default:
			System.out.println("No ha introducido bien el s�mbolo");
			break;
		}
		sc.close();
	}

}
