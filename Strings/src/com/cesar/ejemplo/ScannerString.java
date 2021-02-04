/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesar.ejemplo;
import java.util.Scanner;
/**
 *
 * @author gema
 */
public class ScannerString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector_teclado = new Scanner(System.in);
        String cadena=new String();
        int num_palabras=0;
        int resultado=1;
        //1.-Metodo nextLine sirve para leer una frase hasta introducir enter
        System.out.println("Introduzca una frase");
        cadena=lector_teclado.nextLine();
        System.out.println(cadena);
        
        
        //2.-Metodo next permite obtener el siguiente "token" del texto utilizando como delimitador el espacio en blanco.
        //El metodo hastNext().
        System.out.println("Introduzca otra frase que la voy a descomponer en palabras. Introduzca la palabra FIN para acabar.");
        while (!lector_teclado.hasNext("FIN")){//mira si el siguiente token o palabra es la palabra FIN
            cadena=lector_teclado.next();
            System.out.println(cadena);
            num_palabras++;
        }
        System.out.printf("%d",num_palabras);
        
        
        //3.-Cambiando el delimitador
        cadena=lector_teclado.next(); //avanzo el FIN previo
        lector_teclado.useDelimiter(";");
        System.out.println("Introduzca otra frase que la voy a descomponer en palabras. Introduzca la palabra FIN para acabar.");
        num_palabras=0;
        while (!lector_teclado.hasNext("FIN")){
            cadena=lector_teclado.next();
            System.out.println(cadena);
            num_palabras++;
        }
        System.out.printf("%d",num_palabras);
        //4.-Como analizador lexico directamente sobre un String
        num_palabras=0;
        Scanner analizador = new Scanner("hola como estas FIN");
        while (!analizador.hasNext("FIN")){
            cadena=analizador.next();
            System.out.println(cadena);
            num_palabras++;
        }
        System.out.printf("%d",num_palabras);
    }
}