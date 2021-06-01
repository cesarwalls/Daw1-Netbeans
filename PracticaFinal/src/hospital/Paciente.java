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
public class Paciente implements Comparable<Paciente>, Serializable{

    protected int ID;
    protected int edad;
    protected boolean sexo;
    protected String nombre;
    public static int contador = 0;
    protected int diasIngresado;

    public Paciente() {
        int sex = (int) (Math.random() * 2 + 1);
        contador++;
        ID = contador;
        edad = (int) (Math.random() * 99 + 1);
        if (sex == 1) {
            sexo = false;
        } else if (sex == 2) {
            sexo = true;
        }
        nombre = this.getClass().getSimpleName() + " " + ID;
        diasIngresado = (int) (Math.random() * 30 + 1);
    }

    public Paciente(int ID, int edad, boolean sexo, String nombre, int diasIngresado) {
        this.ID = ID;
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
        this.diasIngresado = diasIngresado;
    }

    public int getDiasIngresado() {
        return diasIngresado;
    }

    public void setDiasIngresado(int diasIngresado) {
        this.diasIngresado = diasIngresado;
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

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Paciente.contador = contador;
    }

    @Override
    public String toString() {
        return "Paciente{" + "ID=" + ID + ", edad=" + edad + ", sexo=" + sexo + ", nombre=" + nombre + ", diasIngresado=" + diasIngresado + '}';
    }

    public String toStringFichero() {
        return ID + ";" + edad + ";" + sexo + ";" + nombre + ";" + diasIngresado;
    }

    @Override
    public int compareTo(Paciente o) {
        return this.nombre.compareTo(o.nombre);
    }

}
