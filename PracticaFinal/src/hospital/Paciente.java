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
public class Paciente extends Personal{
    protected int diasIngresado;

    public Paciente() {
        super();
        diasIngresado = (int) (Math.random() * 30 + 1);
    }

    public Paciente(int diasIngresado, int edad, boolean sexo, String nombre) {
        super(edad, sexo, nombre);
        this.diasIngresado = diasIngresado;
    }

    public int getDiasIngresado() {
        return diasIngresado;
    }

    public void setDiasIngresado(int diasIngresado) {
        this.diasIngresado = diasIngresado;
    }

    @Override
    public String toString() {
        return super.toString() + " diasIngresado=" + diasIngresado + '}';
    }
    
    @Override
    public String toStringFichero() {
        return super.toStringFichero() + ";" + diasIngresado;
    }
    
    
    
    
    
}
