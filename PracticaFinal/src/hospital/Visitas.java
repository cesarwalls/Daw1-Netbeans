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
public class Visitas {
    protected int identificador;
    protected Fecha fecha;
    protected int IDMedico;
    protected int IDPaciente;
    protected int contador = 0;
    protected Hospital hospital = new Hospital();

    

    public Visitas() {
        contador++;
        identificador = contador;
        fecha = new Fecha();
        IDMedico= hospital.personal.get((int) (Math.random()*hospital.personal.size())).getID();
        ArrayList<Paciente> pacientes = new ArrayList(hospital.pacientes);
        IDPaciente= pacientes.get((int) (Math.random()*hospital.personal.size())).getID();   
        }

    public Visitas(int identificador, Fecha fecha, int IDMedico, int IDPaciente) {
        this.identificador = identificador;
        this.fecha = fecha;
        this.IDMedico = IDMedico;
        this.IDPaciente = IDPaciente;
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

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Visitas{" + "identificador=" + identificador + ", fecha=" + fecha + ", IDMedico=" + IDMedico + ", IDPaciente=" + IDPaciente + ", contador=" + contador + ", hospital=" + hospital + '}';
    }
    
    
    
    
    
    
    }
    

    
    
    
    
    
    

