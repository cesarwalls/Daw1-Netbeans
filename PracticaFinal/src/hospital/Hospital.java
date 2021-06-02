/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Clase en la que se crea una serie de colecciones de Perosnal, Pacientes y Visitas
 * @author cesar
 */
public class Hospital implements Serializable {

    protected ArrayList<Personal> personal;
    protected TreeSet<Paciente> pacientes;
    protected Iterator<Paciente> iterator;
    protected ArrayList<Visita> visitas;

    public Hospital(ArrayList<Personal> personal, TreeSet<Paciente> pacientes, ArrayList<Visita> visitas) {
        this.personal = personal;
        this.pacientes = pacientes;
        this.visitas = visitas;

    }

    public Hospital() {
        personal = new ArrayList();
        for (int i = 0; i < 100; i++) {
            if (i == 0 || i < 33) {
                personal.add(new Medico());
            } else if (i >= 33 && i <= 88) {
                personal.add(new Enfermero());
            } else {
                personal.add(new Administrador());
            }
        }

        pacientes = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            pacientes.add(new Paciente());
        }
        visitas = new ArrayList();
        for (int i = 0; i < 10; i++) {
            visitas.add(new Visita(randomMedico(), randomPaciente()));
        }

        GestorFicheros.escribirFicheroBinario(GestorFicheros.FICHERO_BINARIO, this);
        GestorFicheros.escribirFicheroTexto(GestorFicheros.FICHERO, personal, pacientes);

    }

    /**
     * Devuelve un ID aleatorio de la colección de médicos
     * @return
     */
    public int randomMedico() {
        return personal.get((int) (Math.random() * personal.size())).ID;

    }

    /**
     * Devuelve un ID aleatorio de la colección de pacientes
     * @return
     */
    public int randomPaciente() {
        ArrayList<Paciente> alternativoPacientes = new ArrayList(pacientes);
        return alternativoPacientes.get((int) (Math.random() * alternativoPacientes.size())).ID;

    }

    /**
     * Devuelve el listado de médicos, enfermeros, administradores, visitas y pacientes 
     */
    public void consultaHospital() {
        System.out.println("Médicos");
        consultaMedicos();
        System.out.println("");
        System.out.println("Enfermeros");
        consultaEnfermeros();
        System.out.println("");
        System.out.println("Administradores");
        consultaAdministradores();
        System.out.println("");
        System.out.println("Visitas");
        consultaVisitas();
        System.out.println("");
        System.out.println("Pacientes");
        consultaPacientes();
    }

    /**
     * Método para listar todos los médicos de la colección
     */
    public void consultaMedicos() {
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i).getNombre().contains("Medico")) {
                System.out.println(personal.get(i).toStringFichero());
            }

        }
    }

    /**
     *Método para listar todos los enfermeros de la colección
     */
    public void consultaEnfermeros() {
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i).getNombre().contains("Enfermero")) {
                System.out.println(personal.get(i).toStringFichero());
            }

        }
    }

    /**
     *Método para listar todos los administradores de la colección
     */
    public void consultaAdministradores() {
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i).getNombre().contains("Administrador")) {
                System.out.println(personal.get(i).toStringFichero());
            }

        }
    }

    /**
     * Método para listar todas las visitas de la colección
     */
    public void consultaVisitas() {
        for (int i = 0; i < visitas.size(); i++) {
            System.out.println(visitas.get(i).toStringFichero());
        }

    }

    /**
     * Método que recibe como entrada un ArrayList de paciente y sirve para poder listarlos
     * @param listaPacientes
     */
    public void consultaPacienteArray(ArrayList<Paciente> listaPacientes) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            System.out.println(listaPacientes.get(i).toStringFichero());
        }

    }

    /**
     * Método para listar todos los pacientes de la colección
     */
    public void consultaPacientes() {
        iterator = pacientes.iterator();
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(iterator.next().toStringFichero());
        }
    }

    /**
     * Método para añadir médico con todos sus parámetros
     */
    public void anadirMedico() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edad");
        int edad = sc.nextInt();
        System.out.println("Introduce sexo, 1 para hombre, 2 para mujer");
        int sex = sc.nextInt();
        boolean sexo;
        if (sex == 1) {
            sexo = false;
        } else {
            sexo = true;
        }
        sc.next();
        System.out.println("Introduce su nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce los días trabajados");
        int diasTrabajados = sc.nextInt();
        System.out.println("Introduce su departamento");
        String departamento = sc.nextLine();
        System.out.println("Introduce su ID");
        int ID = sc.nextInt();
        Medico m = new Medico(ID, edad, sexo, nombre, diasTrabajados, departamento);
        personal.add(m);
        sc.close();
    }

    /**
     * Método para añadir paciente con todos sus parámetros
     */
    public void anadirPaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edad");
        int edad = sc.nextInt();
        System.out.println("Introduce sexo, 1 para hombre, 2 para mujer");
        int sex = sc.nextInt();
        boolean sexo;
        if (sex == 1) {
            sexo = false;
        } else {
            sexo = true;
        }
        sc.next();
        System.out.println("Introduce su nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce días ingresado");
        int diasIngresado = sc.nextInt();
        System.out.println("Introduce su ID");
        int ID = sc.nextInt();
        Paciente p = new Paciente(ID, edad, sexo, nombre, diasIngresado);
        pacientes.add(p);
        sc.close();
    }

    /**
     * Dado un ID, consultar cual es el médico
     */
    public void consultaDeMedicosID() {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        System.out.println("Dime el ID del médico que quieres");
        int ID = sc.nextInt();
        for (int i = 0; i < personal.size() && !stop; i++) {
            if (personal.get(i) instanceof Medico && personal.get(i).ID == ID) {
                System.out.println("Este es tu médico");
                System.out.println(personal.get(i).toStringFichero());
                stop = true;
            }
        }
        if (!stop) {
            System.out.println("No se ha encontrado ningún médico");
        }
    }

    /**
     * Método para actualizar un médico dado un ID
     */
    public void actualizarMedico() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del médico");
        int ID = sc.nextInt();
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i) instanceof Medico && personal.get(i).ID == ID) {
                System.out.println("Dime los nuevos días trabajados");
                int diasTrabajados = sc.nextInt();
                ((Medico) personal.get(i)).setDiasTrabajados(diasTrabajados);
                System.out.println("Dime su nuevo departamento");
                sc.next();
                String departamento = sc.nextLine();
                ((Medico) personal.get(i)).setDepartamento(departamento);
                System.out.println("Dime su nuevo ID");
                int identificacion = sc.nextInt();
                ((Medico) personal.get(i)).setID(identificacion);
                System.out.println("Dime su nuevo Nombre");
                sc.next();
                String nombre = sc.nextLine();
                ((Medico) personal.get(i)).setNombre(nombre);
                System.out.println("Dime su nueva Edad");
                int edad = sc.nextInt();
                ((Medico) personal.get(i)).setEdad(edad);
                System.out.println("El nuevo médico es: " + personal.get(i).toString());
            } else {
                System.out.println("Error. No se ha encontrado ningún médico.");
            }
        }
        sc.close();
    }

    /**
     *  Método para actualizar un paciente dado un ID
     */
    public void actualizarPaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del paciente");
        ArrayList<Paciente> listaPacientes = new ArrayList(pacientes);
        int ID = sc.nextInt();
        for (int i = 0; i < pacientes.size(); i++) {
            if (listaPacientes.get(i) instanceof Paciente && listaPacientes.get(i).ID == ID) {
                System.out.println("Dime los nuevos días ingresado");
                int diasIngresado = sc.nextInt();
                listaPacientes.get(i).setDiasIngresado(diasIngresado);
                System.out.println("Dime su nuevo ID");
                int identificacion = sc.nextInt();
                listaPacientes.get(i).setID(identificacion);
                System.out.println("Dime su nuevo Nombre");
                sc.next();
                String nombre = sc.nextLine();
                listaPacientes.get(i).setNombre(nombre);
                System.out.println("Dime su nueva Edad");
                int edad = sc.nextInt();
                listaPacientes.get(i).setEdad(edad);
                System.out.println("El nuevo paciente es: " + listaPacientes.get(i).toString());
            } else {
                System.out.println("Error. No se ha encontrado ningún paciente.");
            }
        }
        sc.close();
    }

    /**
     * Método para añadir una visita
     */
    public void anadirVisita() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID de la visita");
        int ID = sc.nextInt();
        System.out.println("Dime el ID del médico");
        int IDMedico = sc.nextInt();
        System.out.println("Dime el ID del paciente");
        int IDPaciente = sc.nextInt();
        System.out.println("Se ha creado y añadido una nueva visita");
        Visita v = new Visita(ID, IDMedico, IDPaciente);
        visitas.add(v);
    }

    /**
     * Dado un ID, siempre que sea paciente se elimina
     */
    public void eliminarPacientePorID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del paciente");
        ArrayList<Paciente> listaPacientes = new ArrayList(pacientes);
        int ID = sc.nextInt();
        for (int i = 0; i < pacientes.size(); i++) {
            if (listaPacientes.get(i) instanceof Paciente && listaPacientes.get(i).ID == ID) {
                listaPacientes.remove(i);
                System.out.println("Paciente eliminado");
            } else {
                System.out.println("No se ha encontrado paciente");
            }
        }
    }

    /**
     * Dado un ID siempre que sea médico se elimina
     */
    public void eliminarMedicoPorID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el ID del médico");
        int ID = sc.nextInt();
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i) instanceof Medico && personal.get(i).ID == ID) {
                personal.remove(i);
                System.out.println("Médico eliminado");
            } else {
                System.out.println("No se ha encontrado médico");
            }
        }
    }

    /**
     * Dado un departamento, si este coincide se le pide el ID para eliminar al médico
     */
    public void eliminarMedicosPorDepartamentoEiD() {
        Scanner sc = new Scanner(System.in);
        String departamento = null;
        System.out.println("Dime su departamento");
        try {
            comprobarDepartamento(departamento = sc.nextLine());
        } catch (departamentoIncorrecto e) {
            System.out.println(e.getMessage());

        }
        System.out.println("Dime su ID");
        int ID = sc.nextInt();
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i) instanceof Medico && ((Medico) personal.get(i)).departamento.equalsIgnoreCase(departamento) && ((Medico) personal.get(i)).ID == ID) {
                personal.remove(i);
                System.out.println("Médico eliminado");
            } else {
                System.out.println("No se ha encontrado médico");
            }
        }
    }

    /**
     * Método que lanza una excepción personalizada
     * @param tipo
     * @throws departamentoIncorrecto
     */
    public void comprobarDepartamento(String tipo) throws departamentoIncorrecto {
        if (!tipo.equalsIgnoreCase("Cardiología") || !tipo.equalsIgnoreCase("Neurología") || !tipo.equalsIgnoreCase("Inmunología") || !tipo.equalsIgnoreCase("Hematología") || !tipo.equalsIgnoreCase("Pediatría")) {
            throw new departamentoIncorrecto();
        }
    }
}
