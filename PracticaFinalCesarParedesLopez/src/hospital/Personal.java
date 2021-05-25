/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.Serializable;

/**
 *
 * @author cesar
 */
public class Personal implements Serializable{
    protected int ID;
    protected int edad;
    protected boolean sexo;
    protected String nombre;

    public Personal() {
    }

    public Personal(int ID, int edad, boolean sexo, String nombre) {
        this.ID = ID;
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " ID=" + ID + ", edad=" + edad + ", sexo=" + sexo + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
