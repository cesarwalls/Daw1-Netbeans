/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesar.ejemplo;

/**
 *
 * @author cesar
 */
public class Movimiento {

    protected Posicion posInicial;
    protected Posicion posFinal;

    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    public Posicion getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }

    public Posicion getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(Posicion posFinal) {
        this.posFinal = posFinal;
    }

    public boolean esVertical() {
        boolean respuesta = false;
        if (posInicial.columna == posFinal.columna) {
            respuesta = true;
        }
        return respuesta;
    }

    public boolean esHorizontal() {
        boolean respuesta = false;
        if (posInicial.fila == posFinal.fila) {
            respuesta = true;
        }
        return respuesta;
    }

    public boolean esDiagonal() {
        boolean respuesta = false;
        if (Math.abs(saltoVertical()) == Math.abs(saltoHorizontal())) {
            respuesta = true;
        }
        return respuesta;
    }

    public int saltoVertical() {
        return posFinal.fila - posInicial.fila;
    }

    public int saltoHorizontal() {
        return posFinal.columna - posInicial.columna;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "posIni=" + posInicial + ", posFin=" + posFinal + '}';
    }

}
