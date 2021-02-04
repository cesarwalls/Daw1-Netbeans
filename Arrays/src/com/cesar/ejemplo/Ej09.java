package com.cesar.ejemplo;


public class Ej09 {
	//Hacer un programa que sume los n�meros que hay en las posiciones pares de una lista de diez elementos.
	public static void main(String[] args) {
		int array [] = new int [10];
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100);
		}
		for (int i = 0; i < array.length; i++) {
			if (i%2==0) {
				suma = suma+array[i];
			}
			System.out.print(array[i] + " ** ");
		}
		System.out.println();
		System.out.println(suma);
	}

}
