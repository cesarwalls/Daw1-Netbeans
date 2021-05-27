/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenterceraevaluacion;

/**
 *
 * @author prog
 */
public class CasaRural extends Alojamiento {

    protected boolean minusvalido;

    public CasaRural() {
        super();
        int minus = (int) (Math.random() * 2 + 1);
        if (minus == 1) {
            minusvalido = true;
        } else {
            minusvalido = false;
        }
    }

    public CasaRural(boolean minusvalido, String nombre, String provincia, int numHabitaciones) {
        super(nombre, provincia, numHabitaciones);
        this.minusvalido = minusvalido;
    }

    public boolean isMinusvalido() {
        return minusvalido;
    }

    public void setMinusvalido(boolean minusvalido) {
        this.minusvalido = minusvalido;
    }

    @Override
    public String toString() {
        return super.toString() + " minusvalido=" + minusvalido + '}';
    }
    
    

}
