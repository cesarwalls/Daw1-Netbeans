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
public class Administrador extends Personal {

    protected String posicion;

    public Administrador() {
        super();
        int pos = (int) (Math.random() * 3 + 1);
        switch (pos) {
            case 1:
                posicion = "Jefe";
                break;
            case 2:
                posicion = "Titular";
                break;
            case 3:
                posicion = "becario";
                break;
        }
    }

    public Administrador(String posicion, int ID, int edad, boolean sexo, String nombre) {
        super(ID, edad, sexo, nombre);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Administrador{" + "posicion=" + posicion + '}';
    }

    @Override
    public String toStringFichero() {
        return super.toStringFichero() + ";" + posicion;

    }

}
