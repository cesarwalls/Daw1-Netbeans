/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Clase Médico que hereda de Personal
 * En ella se crea un constructor con parámetros aleatorios
 * @author cesar
 */
public class Medico extends Personal {

    protected int diasTrabajados;
    protected String departamento;

    public Medico() {
        super();
        int dep = (int) (Math.random() * 5 + 1);
        diasTrabajados = (int) (Math.random() * 1000 + 1);
        switch (dep) {
            case 1:
                departamento = "Cardiología";
                break;
            case 2:
                departamento = "Neurología";
                break;
            case 3:
                departamento = "Inmunología";
                break;
            case 4:
                departamento = "Hematología";
            default:
                departamento = "Pediatría";
                break;
        }

    }

    public Medico(int ID, int edad, boolean sexo, String nombre, int diasTrabajados, String departamento) {
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

    @Override
    public String toStringFichero() {
        return super.toStringFichero() + ";" + diasTrabajados + ";" + departamento;

    }
}
