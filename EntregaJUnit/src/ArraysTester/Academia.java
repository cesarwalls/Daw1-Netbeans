/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysTester;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Academia {

    private Miembro miembros[];

    public Academia() {
        miembros = new Miembro[10];
        for (int i = 0; i < miembros.length; i++) {
            if (i % 2 == 0) {
                miembros[i] = new Alumno();
            } else {
                miembros[i] = new Profesor();
            }
        }

    }

    public Academia(Miembro[] miembros) {
        this.miembros = miembros;
    }

    public void mostrarInfo() {
        for (int i = 0; i < miembros.length; i++) {
            System.out.println(miembros[i]);
        }
        System.out.println("");
    }

    public void añadirProfesorAleatorio() {
        for (int i = 0; i < miembros.length; i++) {
            if (miembros[i] == null) {
                miembros[i] = new Profesor();
            }
        }
    }

    public void eliminarMiembroAleatorio() {
        int numAleatorio = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < miembros.length; i++) {
            if (i == numAleatorio) {
                miembros[i] = null;
            }
        }
    }

    public void cambiarCodigoAleatorio() {
        int numAleatorio = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < miembros.length; i++) {
            if (i == numAleatorio) {
                miembros[i].setCodigo(0000);
            }
        }
    }
}
