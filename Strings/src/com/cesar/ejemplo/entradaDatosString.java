/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cesar.ejemplo;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author Gema
 */
public class entradaDatosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO code application logic here
        BufferedReader Lector= new BufferedReader(new InputStreamReader(System.in));
        String linea= new String();
        int entero;
        float real;
        System.out.printf("Introduce un texto");
        linea = Lector.readLine();
        System.out.printf("%s",linea);
        System.out.printf("Introduce un numero entero");
        linea = Lector.readLine();
        entero = Integer.parseInt(linea);
        System.out.printf("Introduce un numero real");
        linea = Lector.readLine();
        real = Float.parseFloat(linea);
        System.out.printf("%s %d %f",linea,entero,real);


    }

}