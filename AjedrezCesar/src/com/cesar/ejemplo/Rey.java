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
public class Rey extends Pieza {

    public Rey(int color, String nombre) {
        super(color, nombre);
    }

    public Rey(int color) {
        super(color);
    }

    @Override
    public boolean esValidoMovimiento(Movimiento mov, Tablero tabla) {
        boolean respuesta = false;
        if ((mov.saltoHorizontal() == 1 || mov.saltoHorizontal() == -1)
                || ((mov.saltoVertical() == 1 || mov.saltoVertical() == -1))) {
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public void informarMovimiento() {
        System.out.println("En todas las direcciones de 1 en 1");
    }

    @Override
    public void pintarPieza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
