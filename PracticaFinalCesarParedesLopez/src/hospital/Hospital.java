/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author cesar
 */
public class Hospital {
    protected ArrayList<Medico> medicos;
    
    public Hospital(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public Hospital() {
        medicos = new ArrayList();
        for (int i = 0; i < 100; i++) {
            medicos.add(new Medico());
        }
    }
    
    
}
