package com.cesar.ejemplo;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int matriculas [][] = new int [6][8];
		
		for (int i = 0; i < matriculas.length; i++) {
			for (int j = 0; j < matriculas[i].length; j++) {
				System.out.println("Introduce fila " + (i+1) + " y columna " + (j+1));
				matriculas[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matriculas.length; i++) {
			for (int j = 0; j < matriculas[i].length; j++) {
				System.out.print(matriculas[i][j]);
			}
			System.out.println();
		}

	}

}
