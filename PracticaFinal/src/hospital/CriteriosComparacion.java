/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Comparator;

/**
 *
 * @author cesar
 */
public class CriteriosComparacion {

}

class porEdadMedico implements Comparator<Medico> {

    @Override
    public int compare(Medico o1, Medico o2) {
        return o1.edad - o2.edad;
    }

}

class porDiasTrabajados implements Comparator<Medico> {

    @Override
    public int compare(Medico o1, Medico o2) {
        return o1.diasTrabajados - o2.diasTrabajados;
    }

}

class porEdadIgualDiasMedico implements Comparator<Medico> {

    @Override
    public int compare(Medico o1, Medico o2) {
        int aux = (o1.edad - o2.edad);
        if (aux == 0) {
            aux = o1.diasTrabajados - o2.diasTrabajados;
        }
        return aux;
    }

}

class porEdadPaciente implements Comparator<Paciente> {

    @Override
    public int compare(Paciente o1, Paciente o2) {

        return o1.edad - o2.edad;
    }

}

class porDiasIngresados implements Comparator<Paciente> {

    @Override
    public int compare(Paciente o1, Paciente o2) {
        return o1.diasIngresado - o2.diasIngresado;
    }

}

class porEdadIgualDiasPaciente implements Comparator<Paciente> {

    @Override
    public int compare(Paciente o1, Paciente o2) {
        int aux = (o1.edad - o2.edad);
        if (aux == 0) {
            aux = o1.diasIngresado - o2.diasIngresado;
        }
        return aux;
    }

}
