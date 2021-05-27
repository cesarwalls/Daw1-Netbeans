/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenterceraevaluacion;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author prog
 */
public class Alojamiento implements Serializable, Comparable<Alojamiento> {

    protected String nombre;
    protected String provincia;
    protected int numHabitaciones;
    protected static int contador = 0;

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

    public Alojamiento() {
        int prov = (int) (Math.random() * 5 + 1);
        contador++;
        nombre = "Alojamiento " + contador;
        switch (prov) {
            case 1:
                provincia = "Madrid";
                break;
            case 2:
                provincia = "Catalunya";
                break;
            case 3:
                provincia = "Andalucia";
                break;
            case 4:
                provincia = "Valencia";
                break;
            default:
                provincia = "Aragon";
                break;
        }
        numHabitaciones = (int) (Math.random() * 10 + 3);
        
    }

    public Alojamiento(String nombre, String provincia, int numHabitaciones) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.numHabitaciones = numHabitaciones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.provincia);
        hash = 29 * hash + this.numHabitaciones;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alojamiento other = (Alojamiento) obj;
        if (this.numHabitaciones != other.numHabitaciones) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " nombre=" + nombre + ", provincia=" + provincia + ", numHabitaciones=" + numHabitaciones + '}';
    }

    @Override
    public int compareTo(Alojamiento o) {
        if (this.nombre == o.nombre) {
        }
        return 0;
            
    }
    
    
    
}
