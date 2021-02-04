package com.cesar.ejemplo;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int vector[] = new int[15];
        //Carga aleatoria
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        //Mostrar el contenido
        for (int i = 0; i < vector.length - 1; i++) {
            System.out.print(vector[i] + "-");
        }
        System.out.println(vector[14]);
        //System.out.print(vector[vector.length-1]);
        int cantidad;
        do{
            System.out.println("Introduce cuantos elementos del array vector quieres sumar");
            cantidad = lector.nextInt();
        } while (cantidad>vector.length);
        
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
             suma = suma + vector[i];
        }
        System.out.println("La suma de los " + cantidad + " elementos de vector es " + suma);
   
    }

}
