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

class porEdadMedico implements Comparator<Personal> {

    @Override
    public int compare(Personal o1, Personal o2) {
        int aux = 0;
        if (o1 instanceof Medico && o2 instanceof Medico) {
            aux = o1.edad - o2.edad;
        }
        return aux;
    }

}

class porDiasTrabajados implements Comparator<Personal> {

    @Override
    public int compare(Personal o1, Personal o2) {
        int aux = 0;
        if (o1 instanceof Medico && o2 instanceof Medico) {
            aux = ((Medico) o1).diasTrabajados - ((Medico) o2).diasTrabajados;
        }
        return aux;
    }
}

class porEdadIgualDiasMedico implements Comparator<Personal> {

    @Override
    public int compare(Personal o1, Personal o2) {
        int aux;
        int aux2 = 0;
        if (o1 instanceof Medico && o2 instanceof Medico) {
            aux = o1.edad - o2.edad;
            if (aux == 0) {
                aux2 = (((Medico) o1).diasTrabajados) - (((Medico) o2).diasTrabajados);
            }
        }
        return aux2;
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
}
