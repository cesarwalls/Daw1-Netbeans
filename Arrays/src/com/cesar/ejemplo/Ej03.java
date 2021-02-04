package com.cesar.ejemplo;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        int numeros[] = new int[15];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca la posicion " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        for (int i = numeros.length-1; i > -1; i--) {
            System.out.print(numeros[i] + " ");
        }

    }
}
