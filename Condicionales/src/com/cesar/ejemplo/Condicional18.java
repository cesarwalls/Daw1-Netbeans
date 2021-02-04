package com.cesar.ejemplo;

import java.io.IOException;
import java.util.Scanner;

public class Condicional18 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce el segundo número");
		double numero2 = sc.nextDouble();
		System.out.println("Introduce caracter (a, b, c o d)");
		char tipo = (char)System.in.read();
		//char tipo = sc.next().charAt(0);
		tipo = Character.toLowerCase(tipo);
		switch (tipo) {
		case 'a':
			double perimetro = numero1*2 + numero2*2;
			System.out.println("El perímetro del rectángulo es " + perimetro);
			break;
		case 'b':
			double area = numero1*numero2;
			System.out.println("El area del rectángulo es " +area);
			break;
		case 'c':
			double areatriangulo = (numero2*numero1)/2;
			System.out.println("El area del triángulo es " +areatriangulo);
			break;
		case 'd':
			//double hipotenusacuadrado = (numero1*numero1) + (numero2*numero2);
			//double hipotenusa = Math.sqrt(hipotenusacuadrado);
			double hipotenusa = Math.hypot(numero1, numero2);
			System.out.println("La hipotenusa del triángulo es "+hipotenusa);
			break;
		default:
			System.out.println("No ha introducido bien el caracter");
			break;
		}
		sc.close();
	}

}
