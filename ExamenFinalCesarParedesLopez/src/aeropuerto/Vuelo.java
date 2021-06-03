/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author prog
 */
public class Vuelo implements Serializable, Comparator<Vuelo> {

    protected int id;
    protected String aerolinea;
    protected String origen;
    protected String destino;
    protected LocalDate fecha;
    protected int numPasajeros;
    protected double precioBase;
    protected static int contador;
    protected String nombre;

    public Vuelo() {
        contador++;
        id = contador;
        int aer = (int) (Math.random() * 3 + 1);
        if (aer == 1) {
            aerolinea = "Iberia";
        } else if (aer == 2) {
            aerolinea = "AirEuropa";
        } else {
            aerolinea = "FlyEmirates";
        }
        int des = (int) (Math.random() * 3 + 1);
        if (des == 1) {
            destino = "Madrid";
        } else if (des == 2) {
            destino = "Barcelona";
        } else {
            destino = "Sevilla";
        }

        int ori = (int) (Math.random() * 3 + 1);
        if (ori == 1) {
            origen = "Dubai";
        } else if (ori == 2) {
            origen = "Londres";
        } else {
            origen = "Nueva York";
        }
        fecha = LocalDate.of((int) (Math.random() * 33 + 2017), (int) (Math.random() * 12 + 1), (int) (Math.random() * 30 + 1));
        numPasajeros = (int) (Math.random() * 100 + 50);
        precioBase = (int) (Math.random() * 70 + 30);
        nombre = this.getClass().getSimpleName();

    }

    public Vuelo(int id, String aerolinea, String origen, String destino, LocalDate fecha, int numPasajeros, double precioBase, String nombre) {
        this.id = id;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.numPasajeros = numPasajeros;
        this.precioBase = precioBase;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", aerolinea=" + aerolinea + ", origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", numPasajeros=" + numPasajeros + ", precioBase=" + precioBase + ", nombre=" + nombre + '}';
    }

    public String toStringFichero() {
        return nombre + ";" + id + ";" + aerolinea + ";" + origen + ";" + destino + ";" + fecha + ";" + numPasajeros + ";" + precioBase;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.aerolinea);
        hash = 17 * hash + Objects.hashCode(this.origen);
        hash = 17 * hash + Objects.hashCode(this.destino);
        hash = 17 * hash + Objects.hashCode(this.fecha);
        hash = 17 * hash + this.numPasajeros;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.precioBase) ^ (Double.doubleToLongBits(this.precioBase) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.nombre);
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
        final Vuelo other = (Vuelo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numPasajeros != other.numPasajeros) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioBase) != Double.doubleToLongBits(other.precioBase)) {
            return false;
        }
        if (!Objects.equals(this.aerolinea, other.aerolinea)) {
            return false;
        }
        if (!Objects.equals(this.origen, other.origen)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }

    @Override
    public int compare(Vuelo o1, Vuelo o2) {
        return o1.id - o2.id;
    }

}
