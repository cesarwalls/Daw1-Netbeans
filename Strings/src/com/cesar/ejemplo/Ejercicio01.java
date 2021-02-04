package com.cesar.ejemplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) throws IOException {
   // TODO code application logic here
        Scanner lector_teclado = new Scanner(System.in);
        BufferedReader Lector= new BufferedReader(new InputStreamReader(System.in));
        String cadena1=new String("Hola ");
        String cadena2= new String();
        int num=0;
        int resultado=1;
 /*
        //Opci�n1: leer una l�nea
          System.out.println("nueva linea");
          cadena2=lector_teclado.nextLine();
          System.out.print(cadena2);
          System.out.println(cadena1.indexOf(cadena2));
 */      
 /*
        //Opci�n 2: leer una l�nea despu�s de un n�mero (con String.next())
         System.out.println("Introduzca un numero");
         num=lector_teclado.nextInt();
         System.out.printf("%d",num);
         System.out.println("nueva linea");
         cadena2=lector_teclado.next();
         System.out.print(cadena2);
         System.out.println(cadena1.indexOf(cadena2));
 */
/*         
        //Opci�n 3: usando InputStreamReader
         System.out.println("Introduce un texto");
         cadena2 = Lector.readLine();
         System.out.printf("%s",cadena2);
         System.out.println(cadena1.indexOf(cadena2));
*/         
/*
         //Opci�n 4: usando InputStreamReader, cuando hay que leer despu�s de leer n�meros
         System.out.println("Introduzca un numero");
         num=lector_teclado.nextInt();
         System.out.printf("%d",num);
         System.out.println("Introduce un texto");
         cadena2 = Lector.readLine();
         System.out.printf("%s",cadena2);
         System.out.println(cadena1.indexOf(cadena2));
*/
 
    }
}