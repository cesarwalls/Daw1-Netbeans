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
public class Diccionario {

    Scanner sc = new Scanner(System.in);

    private String palabras[];

    public Diccionario() {
        palabras = new String[15];
        for (int i = 0; i < palabras.length; i++) {
            switch (i) {
                case 0:
                    palabras[i] = "Albondiga";
                    break;
                case 1:
                    palabras[i] = "Juez";
                    break;
                case 2:
                    palabras[i] = "Escalera";
                    break;
                case 3:
                    palabras[i] = "Silla";
                    break;
                case 4:
                    palabras[i] = "Mango";
                    break;
                case 5:
                    palabras[i] = "Telefono";
                    break;
                case 6:
                    palabras[i] = "Marron";
                    break;
                case 7:
                    palabras[i] = "Paloma";
                    break;
                case 8:
                    palabras[i] = "Vaso";
                    break;
                case 9:
                    palabras[i] = "Nintendo";
                    break;
                default:
                    palabras[i] = null;
                    break;
            }
        }
    }

    public Diccionario(String[] palabras) {
        this.palabras = palabras;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    public void listarDiccionario() {
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        System.out.println("");
    }

    public void actualizarDiccionario() {
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] == null) {
                System.out.println("Escribe la palabra que desea");
                String palabra = sc.nextLine();
                palabras[i] = palabra;
            }

        }
    }

    public String buscarPalabra() {
        String palabra = null;
        int random = (int) (Math.random() * 10);
        for (int i = 0; i < palabras.length; i++) {
            if (random == i) {
                palabra = palabras[i];
            }
        }
        return palabra;
    }

    public char[] separarPalabra(String palabraDelDiccionario) {
        char[] letras;
        letras = new char[palabraDelDiccionario.length()];
        for (int i = 0; i < palabraDelDiccionario.length(); i++) {
            letras[i] = palabraDelDiccionario.charAt(i);
        }
        return letras;
    }

    public void jugar() {
        int intentosTotales = 10;
        int intentos = 0;
        int aciertos = 0;
        String palabraAleatoria = buscarPalabra();
        System.out.println("Has elegido jugar");

        char[] palabraSeparada = separarPalabra(palabraAleatoria.toLowerCase());
        char[] respuestas = new char[palabraSeparada.length];
        for (int i = 0;
                i < respuestas.length;
                i++) {
            respuestas[i] = '_';
        }
        while (intentos < intentosTotales && aciertos != respuestas.length) {
            imprimePalabraOculta(respuestas);
            System.out.println("Dime una letra");
            char letra = sc.next().toLowerCase().charAt(0);
            for (int i = 0; i < palabraSeparada.length; i++) {
                if (palabraSeparada[i] == letra) {
                    respuestas[i] = palabraSeparada[i];
                    palabraSeparada[i] = ' ';
                    aciertos++;
                }
            }
            intentos++;
        }
        if (aciertos == respuestas.length) {
            System.out.println("Has acertado la palabra: " + palabraAleatoria);
            System.out.println("Enhorabuena");

        } else {
            System.out.println("Lo siento, la palabra era:" + palabraAleatoria);
        }
    }

    public void imprimePalabraOculta(char[] respuestas) {
        for (int i = 0; i < respuestas.length; i++) {
            System.out.print(respuestas[i] + " ");
        }
    }

    public void menu() {
        System.out.println("Has elegido actualizar el diccionario de palabras");
        System.out.println("Introduzca 'password' (sin las comillas) si quiere actualizar diccionario");
        System.out.println("Introduzca 'listar' (sin las comillas) si quiere listar diccionario");
        String dicc = sc.nextLine();
        if (dicc.equalsIgnoreCase("password")) {
            System.out.println("Ha elegido actualizar diccionario");
            actualizarDiccionario();

        } else if (dicc.equalsIgnoreCase("listar")) {
            System.out.println("Ha elegido listar diccionario");
            listarDiccionario();
        } else {
            System.out.println("Se ha equivocado de palabra");
        }
    }
}
