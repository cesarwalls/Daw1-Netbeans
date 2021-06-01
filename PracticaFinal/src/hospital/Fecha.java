/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author cesar
 */
public class Fecha {
    protected int dia;
    protected int mes;
    protected int anio;
    
     public Fecha() {
         dia = (int) (Math.random() * 31+1);
         mes = (int) (Math.random() * 12+1);
         anio =(int) (Math.random() * 2020+40);
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    public String toStringFichero() {
        return  dia + ";" + mes + ";" + anio;
    }
    

  
    
    
}
