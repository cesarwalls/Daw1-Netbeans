/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.time.LocalDate;

/**
 *
 * @author prog
 */
public class VueloNacional extends Vuelo{

    public VueloNacional() {
        if (super.fecha.getMonthValue() == 7) {
            super.precioBase = (precioBase * 0.20) + precioBase;
        } else if (fecha.getMonthValue() == 8){
            super.precioBase = (precioBase * 0.30) + precioBase;
        }
    }

    public VueloNacional(int id, String aerolinea, String origen, String destino, LocalDate fecha, int numPasajeros, double precioBase, String nombre) {
        super(id, aerolinea, origen, destino, fecha, numPasajeros, precioBase, nombre);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public String toStringFichero() {
        return super.toStringFichero();
    }
    
    
}
