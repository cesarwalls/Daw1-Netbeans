/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

/**
 *
 * @author prog
 */
public class Escala {
    protected String nombre;

    public Escala() {
        int random = (int) (Math.random()*5+1);
        switch (random) {
            case 1:
                nombre = "Argentina";
                break;
            case 2:
                nombre = "Australia";
                break;
            case 3:
                nombre = "Inglaterra";
                break;
            case 4:
                nombre = "EEUU";
                break;
            default:
                nombre = "Canada";
                break;
        }
        
    }

    public Escala(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
