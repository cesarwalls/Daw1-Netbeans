/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDate;


/**
 *
 * @author cesar
 */
public class Visita{

    protected int identificador;
    protected LocalDate fecha;
    protected int idMedico;
    protected int idPaciente;
    protected static int contador;


    public Visita(int idMedico, int idPaciente) {
        contador++;
        fecha=LocalDate.of((int)(Math.random()*(2021-2000)+2000),(int)(Math.random()*(12-1)+1),(int)(Math.random()*(30-1)+1));
        identificador = contador;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
    }

    public Visita(int identificador, int idMedico, int idPaciente) {
        fecha=LocalDate.now();
        this.identificador = identificador;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Visita{" + "identificador=" + identificador + ", fecha=" + fecha + ", idMedico=" + idMedico + ", idPaciente=" + idPaciente + '}';
    }
    
    public String toStringFichero() {
        return  identificador + ";" + fecha + ";" + idMedico + ";" + idPaciente;
    }
    
    
    
    

   
    
   

}
