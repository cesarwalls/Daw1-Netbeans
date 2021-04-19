/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Ahorcado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diccionario diccionario = new Diccionario();
        int opcion;
        do {
            System.out.println("Bienvenido al ahorcado de César");
            System.out.println("Introduce 1 si quieres jugar");
            System.out.println("Introduce 2 si quieres actualizar el diccionario de palabras");
            System.out.println("Introduce 0 si quieres finalizar el juego");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    diccionario.jugar();
                    break;
                case 2:
                    diccionario.menu();
                    break;
                case 0:
                    System.out.println("Fin del juego");
                    break;
                default:
                    System.out.println("Numero incorrecto, vuelve a intentarlo");
            }
        } while (opcion != 0);

    }
}
