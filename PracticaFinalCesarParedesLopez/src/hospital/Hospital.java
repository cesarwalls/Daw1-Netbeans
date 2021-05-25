/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author cesar
 */
public class Hospital {
    protected ArrayList<Medico> medicos;
    protected TreeSet<Paciente> pacientes;

    public Hospital(ArrayList<Medico> medicos, TreeSet<Paciente> pacientes) {
        this.medicos = medicos;
        this.pacientes = pacientes;
    }

    public Hospital() {
        medicos = new ArrayList();
        for (int i = 0; i < 100; i++) {
            medicos.add(new Medico());
        }
        pacientes = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            pacientes.add(new Paciente());
        }
    }
    
    
    
    
}
