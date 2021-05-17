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
public class Alumno extends Miembro{
    protected int anyosEstudiados;

    public Alumno() {
        super();
        anyosEstudiados = 6;
    }

    public Alumno(int anyosEstudiados) {
        this.anyosEstudiados = anyosEstudiados;
    }

    public int getAnyosEstudiados() {
        return anyosEstudiados;
    }

    public void setAnyosEstudiados(int anyosEstudiados) {
        this.anyosEstudiados = anyosEstudiados;
    }

    @Override
    public String toString() {
        return super.toString()+ " anyosEstudiados=" + anyosEstudiados + '}';
    }
    
    
    
    
    
    


    
    
}
