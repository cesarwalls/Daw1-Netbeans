/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.Comparator;

/**
 *
 * @author prog
 */
public class Ordenados {
    
}

    class porRentabilidadDecendente implements Comparator<Vuelo> {

        @Override
        public int compare(Vuelo o1, Vuelo o2) {
            int aux = (int) ((o1.precioBase / o1.numPasajeros) - (o2.precioBase / o2.numPasajeros));
            if (aux == 0) {
                aux = o1.numPasajeros - o2.numPasajeros;
            }
            return aux;

        }

    }

    class porRentabilidadAscendente implements Comparator<Vuelo> {

        @Override
        public int compare(Vuelo o1, Vuelo o2) {
            int aux = (int) ((o1.precioBase / o1.numPasajeros) - (o2.precioBase / o2.numPasajeros));
            if (aux == 0) {
                aux = o2.numPasajeros - o1.numPasajeros;
            }
            return aux;

        }

    }

class porRentabilidad implements Comparator<Vuelo> {

        @Override
        public int compare(Vuelo o1, Vuelo o2) {
            return (int) ((o1.precioBase / o1.numPasajeros) - (o2.precioBase / o2.numPasajeros));

        }

    }

class porPrecio implements Comparator<Vuelo>{

    @Override
    public int compare(Vuelo o1, Vuelo o2) {
        return (int) (o1.precioBase - o2.precioBase);
    }
    
}




