package com.cesar.ejemplo;

public class Ej02 {

    public static void main(String[] args) {
        int origen[] = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};// TODO code application logic here
        // Lo recorre metiendo en un segundo array de nombre destino todos aquellos elementos que sean pares y mayores de 25ç
        
        System.out.println(" \n Array de origen");
        for (int i = 0; i < origen.length; i++) {
            System.out.printf(origen[i] + " ");
        }
        
        int tamanyo=0;
        for (int i = 0; i < origen.length; i++) {
            if ((origen[i] > 25) && (origen[i] % 2 == 0)) {    
                tamanyo++;
            }
        }
        int destino[];
        destino = new int[tamanyo];
        System.out.println(" \n Array destino");
        for (int i = 0; i < destino.length; i++) {
            System.out.printf("%2d ",destino[i]);
        }
        System.out.println("-----------proceso------------");
        for (int i = 0, j=0; i < origen.length; i++) {
            if ((origen[i] > 25) && (origen[i] % 2 == 0)) {
                destino[j] = origen[i];
                System.out.printf(destino[j] + " ");
                j++;
            }
            

        }
        //Muestre en pantalla el contenido de los dos arrays unidimensionales
        System.out.println(" \n Array destino");
        for (int i = 0; i < destino.length; i++) {
            System.out.printf(destino[i] + " ");
        }
        System.out.println(" \n Array de origen");
        for (int i = 0; i < origen.length; i++) {
            System.out.printf(origen[i] + " ");
        }
    }
}
