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
public class Alfil extends Pieza {

    public Alfil(int color, String nombre) {
        super(color, nombre);
    }

    public Alfil(int color) {
        super(color);
    }

    @Override
    public boolean esValidoMovimiento(Movimiento mov, Tablero tabla) {
        boolean respuesta = false;
        if (mov.esDiagonal()) {
            respuesta = true;
        }
        return respuesta;
    }

@Override
public void pintarPieza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
public void informarMovimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
