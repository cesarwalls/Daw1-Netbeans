package com.cesar.ejemplo;

import java.util.Scanner;

public class ExplicacionArrays {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int horas[] = new int[30];
        //visualizar contenido
        for (int i = 0; i < horas.length; i++) {
            System.out.print(horas[i]+"-");
        }
        System.out.println("");
        // Carga contenido 
        for (int i = 0; i < horas.length; i++) {
            /*System.out.println("Introduce las horas que has dormido");
            horas[i] = lector.nextInt();*/
            horas[i] = (int)(Math.random()*100);//0-99
        }
        //visualizar contenido
        for (int i = 0; i < horas.length; i++) {
            System.out.print(horas[i]+"-");
        }

    }

}
