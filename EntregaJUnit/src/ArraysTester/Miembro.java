/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysTester;

/**
 *
 * @author cesar
 */
public class Miembro {
       protected String Nombre;
       protected int codigo;
       protected static int contador;

    public Miembro() {
        contador++;
        int num = (int) (Math.random()*100+1);
        codigo = num + contador;
        Nombre = "Miembro"+contador;
    }

    public Miembro(String Nombre, int codigo) {
        this.Nombre = Nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Nombre=" + Nombre + ", codigo=" + codigo + '}';
    }
       
}
