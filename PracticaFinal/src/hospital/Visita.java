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
public class Visita {

    protected int identificador;
    protected Fecha fecha;
    protected ArrayList<Medico> medicos;
    protected int IDMedico;
    protected ArrayList<Paciente> pacientes;
    protected int IDPaciente;
    protected int contador = 0;

    public Visita() {
        contador++;
        identificador = contador;
        fecha = new Fecha();
        IDMedico = medicos.get((int) (Math.random() * medicos.size())).getID();
        IDPaciente = pacientes.get((int) (Math.random() * medicos.size())).getID();
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

    public int getIDMedico() {
        return IDMedico;
    }

    public void setIDMedico(int IDMedico) {
        this.IDMedico = IDMedico;
    }

    public int getIDPaciente() {
        return IDPaciente;
    }

    public void setIDPaciente(int IDPaciente) {
        this.IDPaciente = IDPaciente;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Visita{" + "identificador=" + identificador + ", fecha=" + fecha + ", IDMedico=" + IDMedico + ", IDPaciente=" + IDPaciente + '}';
    }

}
