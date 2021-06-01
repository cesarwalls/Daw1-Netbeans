/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author cesar
 */
public abstract class Personal implements Serializable, Comparable<Personal> {

    protected int ID;
    protected int edad;
    protected boolean sexo;
    protected String nombre;
    public static int contador = 0;

    public Personal() {
        int sex = (int) (Math.random() * 2+1);
        contador++;
        ID = contador;
        edad = (int) (Math.random() * 99 + 1);
        if (sex == 1) {
            sexo = false;
        } else if (sex == 2) {
            sexo = true;
        }
         nombre = this.getClass().getSimpleName() + " " +ID;
    }

    public Personal(int ID, int edad, boolean sexo, String nombre) {
        contador++;
        ID = contador;
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
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.edad;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.ID);
        hash = 67 * hash + Objects.hashCode(this.sexo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        boolean iguales = false;
        if (this.edad == ((Personal) obj).edad && this.nombre.equals(((Personal) obj).nombre) && this.ID == ((Personal) obj).ID && this.sexo == ((Personal) obj).sexo) {
            iguales = true;
        }

        return iguales;

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " ID=" + ID + ", edad=" + edad + ", sexo=" + sexo + ", nombre=" + nombre + '}';
    }

    @Override
    public int compareTo(Personal o) {
        return this.nombre.compareTo(o.nombre);

    }
    
    public String toStringFichero() {
        return ID + ";" + edad + ";" + sexo + ";" + nombre;
    }

}
