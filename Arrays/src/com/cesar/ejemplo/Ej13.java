package com.cesar.ejemplo;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        char [] hexadecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.println("Introduce un numero entre el 0 y el 32000");
        int numero=lector.nextInt();
        int resto, i=3;
        char caracter;
        char [] resultado = new char [4];
        if(numero<0 || numero>32000)
            System.out.println("N�mero no v�lido");
        else{
            do {
               resto=numero%16;
               resultado[i]=hexadecimal[resto];
               i--;
               numero=numero/16;
            } while (numero!=0); 
            System.out.print("Resultado: ");
            for (int j = 0; j < resultado.length; j++) {
                System.out.print(resultado[j]);
                
            }
                
            }
        }
    }        
 
           
            
    
          
    

