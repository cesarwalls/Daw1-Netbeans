package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceme los segundos que quieras");
		int cantidad = sc.nextInt();
		int semanas = cantidad / 604800;
		int dias = cantidad % 604800 / 86400;
		int horas = cantidad % 86400 / 3600;
		int minutos = cantidad % 3600 / 60;
		int segundos = cantidad % 60;

		System.out.println("Semanas: " + semanas + " Dias: " + dias + " Horas: " + horas + " Minutos: " + minutos
				+ " Segundos: " + segundos);
		//if para que sólo imprima las variables distintas de 0
		sc.close();
	}
}
