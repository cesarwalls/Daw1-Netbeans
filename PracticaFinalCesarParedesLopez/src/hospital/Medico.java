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
public class Medico extends Personal {
    protected int diasTrabajados;
    protected String departamento;

    public Medico() {
        super();
        
    }

    public Medico(int diasTrabajados, String departamento, int ID, int edad, boolean sexo, String nombre) {
        super(ID, edad, sexo, nombre);
        this.diasTrabajados = diasTrabajados;
        this.departamento = departamento;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " diasTrabajados=" + diasTrabajados + ", departamento=" + departamento + '}';
    }
    
    
    
    
    
    
    
    
    
        
        
    
}
