
package roberto;

import java.io.Serializable;

public class CasaRural extends Alojamiento implements Serializable{
    private boolean minusvalidos;

    public CasaRural() {
        super();
        minusvalidos=true;
    }

    public CasaRural(String nombre, String provincia, int numHabitaciones, boolean minusvalidos) {
        super(nombre, provincia, numHabitaciones);
        this.minusvalidos=minusvalidos;
    }

    @Override
    public String toString() {
        String minusvalidos;
        if(this.minusvalidos)
            minusvalidos="si";
        else
            minusvalidos="no";
        return super.toString()+ ", minusvalidos=" + minusvalidos;
    }
    @Override
    public String toStringFichero(){
        return super.toStringFichero()+";"+minusvalidos;
    }
    
}
