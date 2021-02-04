package com.cesar.ejemplo;

public class Ej06 {

	public static void main(String[] args) {
		// Creando el array bidimensional de 10x5 con nombre datos
		int datos[][] = new int[10][5];
		//Inicializando la matriz para que cada elemento guarde el n�mero de fila a la que pertenece
		/*for (int fila = 0; fila < datos.length; fila++) {
			for (int columna = 0; columna < datos.length; columna++) {
				
			
			}
			
		}*/
		//Imprimiendo el array en pantalla
		for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 5; columna++) {
            	int contador = fila;
                System.out.print(datos[fila][contador]);
            }
            System.out.println();
        }
		

	}
}
