package com.cesar.ejemplo;


public class Ej08 {

	public static void main(String[] args) {
		int numeros [] = new int [20];
		int numeromayor = 0;
		int posicion = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*100);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ** ");
		}
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>numeromayor) {
				numeromayor = numeros[i];
				posicion = i;
				
			}
		}
		
		System.out.println("El n�mero mayor del array es "+numeromayor);
		System.out.println("La posici�n del n�mero mayor es " +posicion);
		
	}
}
