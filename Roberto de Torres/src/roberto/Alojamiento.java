package roberto;

import java.io.Serializable;

public class Alojamiento implements Comparable<Alojamiento>, Serializable{
    private String nombre;
    private String provincia;
    private int numHabitaciones;

    public Alojamiento(){
        nombre="Alojamiento"+(int)(Math.random()*100);
        provincia="Madrid";
        numHabitaciones=(int)(Math.random()*10+10);
    }

    public Alojamiento(String nombre, String provincia, int numHabitaciones) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.numHabitaciones = numHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": nombre=" + nombre + ", provincia=" + provincia + ", numHabitaciones=" + numHabitaciones;
    }
    public String toStringFichero() {
        return getClass().getSimpleName()+";"+nombre + ";" + provincia + ";" + numHabitaciones;
    }

    @Override
    public int compareTo(Alojamiento o) {
        return nombre.compareTo(o.getNombre());
    }
}
