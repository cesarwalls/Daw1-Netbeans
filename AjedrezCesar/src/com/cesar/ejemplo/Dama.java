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
public class Dama extends Pieza {

    public Dama(int color, String nombre) {
        super(color, nombre);
    }

    public Dama(int color) {
        super(color);
    }

    @Override
    public boolean esValidoMovimiento(Movimiento mov, Tablero tabla) {
        boolean respuesta = false;
        if (mov.esDiagonal() || mov.esHorizontal() || mov.esVertical()) {
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public void informarMovimiento() {
        System.out.println("Cualquier movimiento menos en la forma de caballo");
    }

    @Override
    public void pintarPieza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
