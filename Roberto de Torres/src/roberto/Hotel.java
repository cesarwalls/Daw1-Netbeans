
package roberto;

import java.io.Serializable;
import java.util.Comparator;

public class Hotel extends Alojamiento implements Serializable {
    private String servicio;
    private int categoria;

    public Hotel() {
        super();
        servicio = "Desayunos";
        categoria = (int)(Math.random()*5+1);
    }

    public Hotel(String nombre, String provincia, int numHabitaciones, String servicio, int categoria) {
        super(nombre, provincia, numHabitaciones);
        this.servicio = servicio;
        this.categoria = categoria;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", servicio=" + servicio + ", categoria=" + categoria;
    }
    @Override
    public String toStringFichero() {
        return super.toStringFichero() + ";" + servicio + ";" + categoria;
    }
    public int CompareTo(Alojamiento o){
        int var;
            var=categoria-((Hotel) o).getCategoria();
            if(var==0)
                var=super.getNombre().compareTo(o.getNombre());
        return var;
    }
}
class porPuntuacion implements Comparator<Hotel>{

    @Override
    public int compare(Hotel a1, Hotel a2) {
         int var;
            var=a1.getCategoria()-a2.getCategoria();
            if(var==0)
                var=a1.getNombre().compareTo(a2.getNombre());
        return var;
    }
    
}