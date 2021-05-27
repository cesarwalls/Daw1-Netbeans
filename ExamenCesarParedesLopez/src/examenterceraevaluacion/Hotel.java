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
public class Hotel extends Alojamiento{
    protected String servicios;
    public int categoria;

    public Hotel() {
        super();
        int serv = (int) (Math.random() * 5 + 1);
        switch (serv) {
            case 1:
                servicios = "Spa";
                break;
            case 2:
                servicios = "Billar";
                break;
            case 3:
                servicios = "Piscina";
                break;
            case 4:
                servicios = "Hidromasaje";
                break;
            default:
                servicios = "Restaurante";
                break;
        }
        categoria = (int) (Math.random() * 5 + 1);
        
    }

    public Hotel(String servicios, int categoria, String nombre, String provincia, int numHabitaciones) {
        super(nombre, provincia, numHabitaciones);
        this.servicios = servicios;
        this.categoria = categoria;
    }


    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " servicios=" + servicios + ", categoria=" + categoria + '}';
    }
    
    
    
}
