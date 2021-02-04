package com.cesar.ejemplo;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        int numeros[] = new int[30];
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0, neutros = 0;
        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = (int)(Math.random()*40-20);
        }
        for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>0){
				positivos++;
			} else if (numeros[i]<0) {
				negativos++;
			} else {
				neutros++;
			}
			
		}
        for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ** ");
		}
        System.out.println();
        System.out.println("N�meros positivos= "+positivos+ " ,n�meros negativos= "+negativos+ " y n�meros neutros= "+neutros);
        sc.close();
    }
}
