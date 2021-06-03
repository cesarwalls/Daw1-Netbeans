/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author prog
 */
public class VueloInternacional extends Vuelo {

    protected double incremento = 0.25;
    protected boolean escala;
    protected int numEscalas;
    protected ArrayList<String> listaPaises;

    public VueloInternacional() {
        super();
        listaPaises = new ArrayList();
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    listaPaises.add("Argentina");
                    break;
                case 1:
                    listaPaises.add("Australia");
                    break;
                case 2:
                    listaPaises.add("EEUU");
                    break;
                case 3:
                    listaPaises.add("Canada");
                    break;
                case 4:
                    listaPaises.add("Cuba");
                    break;
                default:
                    break;
            }
        }
        if (super.fecha.getMonthValue() == 7 || super.fecha.getMonthValue() == 8) {
            precioBase = (precioBase * incremento) + precioBase;
        }
        int esc = (int) (Math.random() * 2);
        if (esc == 0) {
            escala = true;
        } else {
            escala = false;
        }
        if (escala == true) {
            numEscalas = (int) (Math.random() * 5 + 1);
            precioBase = (precioBase * (numEscalas * 0.20)) + precioBase;

            for (int i = numEscalas; i < listaPaises.size(); i++) {
                listaPaises.remove(i);
                i--;

            }

        } else {
            numEscalas = 0;
            listaPaises.removeAll(listaPaises);

        }

    }

    public VueloInternacional(boolean escala, int numEscalas, ArrayList<String> listaPaises, int id, String aerolinea, String origen, String destino, LocalDate fecha, int numPasajeros, double precioBase, String nombre) {
        super(id, aerolinea, origen, destino, fecha, numPasajeros, precioBase, nombre);
        this.escala = escala;
        this.numEscalas = numEscalas;
        this.listaPaises = listaPaises;
    }

    public VueloInternacional(boolean escala, int numEscalas, ArrayList<String> listaPaises) {
        this.escala = escala;
        this.numEscalas = numEscalas;
        this.listaPaises = listaPaises;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public boolean isEscala() {
        return escala;
    }

    public void setEscala(boolean escala) {
        this.escala = escala;
    }

    public int getNumEscalas() {
        return numEscalas;
    }

    public void setNumEscalas(int numEscalas) {
        this.numEscalas = numEscalas;
    }

    public ArrayList<String> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(ArrayList<String> listaPaises) {
        this.listaPaises = listaPaises;
    }

    @Override
    public String toStringFichero() {
        return super.toStringFichero() + ";" + escala + ";" + numEscalas + ";" + listaPaises;
    }

}
