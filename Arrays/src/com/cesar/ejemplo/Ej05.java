package com.cesar.ejemplo;

public class Ej05 {

	public static void main(String[] args) {
		// Creando el array bidimensional de 5x5 con nombre diagonal
		
		int diagonal[][] = new int[5][5];
		
		//Iniciando la matriz para que la diagonal valga 1 y el resto 0
		
		for (int i = 0; i < diagonal.length; i++) {
			for (int j = 0; j < diagonal[i].length; j++) {
				if ((i == 0 && j == 4) || (i == 1 && j == 3) || (i == 2 && j == 2) || (i == 3 && j == 1) || (i == 4 && j == 0) ){
					diagonal[i][j] = 1;
				}
			}
		}
		
		//Imprimiendo el array en pantalla
		
		for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j]);
            }
            System.out.println();
        }
	}
}
