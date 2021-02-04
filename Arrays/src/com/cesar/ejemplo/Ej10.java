package com.cesar.ejemplo;


public class Ej10 {
	// Hacer un programa que intercambie el primer y el �ltimo elemento de una
	// lista.
	public static void main(String[] args) {
		int array[] = new int[10];
		int transito = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ** ");
			if (i == array.length - 1) {
				transito = array[0];
				array[0] = array[array.length-1];
				array[array.length-1] = transito;
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ** ");
		}
		
	}
}
