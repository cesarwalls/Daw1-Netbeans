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
public class Profesor extends Miembro{
    protected int anyoExperiencia;

    public Profesor() { 
        super();
        anyoExperiencia = 5;
    }

    public Profesor(int anyoExperiencia) {
        this.anyoExperiencia = anyoExperiencia;
    }

    public Profesor(int anyoExperiencia, String Nombre, int codigo) {
        super(Nombre, codigo);
        this.anyoExperiencia = anyoExperiencia;
    }

    public int getAnyoExperiencia() {
        return anyoExperiencia;
    }

    public void setAnyoExperiencia(int anyoExperiencia) {
        this.anyoExperiencia = anyoExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + " anyoExperiencia=" + anyoExperiencia + '}';
    }
    
    
    
    
}
