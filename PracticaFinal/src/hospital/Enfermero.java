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
public class Enfermero extends Personal{
    protected String estudios;
    protected int anyosTrabajados;


    public Enfermero() {
        super();
        int estud = (int) (Math.random() * 3 + 1);
        anyosTrabajados = (int) (Math.random() * 5 + 1);
        switch (estud) {
            case 1:
                estudios = "Grado Medio";
                break;
            case 2:
                estudios = "Grado Superior";
                break;
            case 3:
                estudios = "Título Universitario";
                break;
        }
    }


    public Enfermero(String estudios, int anyosTrabajados, int ID, int edad, boolean sexo, String nombre) {
        super(ID, edad, sexo, nombre);
        this.estudios = estudios;
        this.anyosTrabajados = anyosTrabajados;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public int getAnyosTrabajados() {
        return anyosTrabajados;
    }

    public void setAnyosTrabajados(int anyosTrabajados) {
        this.anyosTrabajados = anyosTrabajados;
    }

    @Override
    public String toString() {
        return "Enfermero{" + "estudios=" + estudios + ", anyosTrabajados=" + anyosTrabajados + '}';
    }
    

    @Override
    public String toStringFichero() {
        return super.toStringFichero() + ";" + estudios + ";" + anyosTrabajados;

    }
    
    
}
