/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author cesar
 */
public class Visita{

    protected int identificador;
    protected Fecha fecha;
    protected int idMedico;
    protected int idPaciente;
    protected int contador;
    protected static int autonumerico;

    public Visita(){
        autonumerico++;
        contador = autonumerico;
        fecha = new Fecha();
        identificador = contador;
        this.medico = medico;
        this.paciente = paciente;
        
    }

    public Visita(int identificador, Fecha fecha, Medico medico, Paciente paciente) {
        this.identificador = identificador;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Visita{" + "identificador=" + identificador + ", fecha=" + fecha + ", medico=" + medico + ", paciente=" + paciente + '}';
    }

    public String toStringFichero() {
        return identificador + ";" + fecha.toStringFichero() + ";" + medico.ID + ";" + paciente.ID;
    }

}
