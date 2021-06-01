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
 *
 * @author cesar
 */
public class HospitalVisitas implements Serializable {

    protected ArrayList<Personal> personal;
    protected TreeSet<Paciente> pacientes;
    protected Iterator<Paciente> iterator;
    protected ArrayList<Visitas> visitas;

    public HospitalVisitas(ArrayList<Personal> personal, TreeSet<Paciente> pacientes, ArrayList<Visitas> visitas) {
        this.personal = personal;
        this.pacientes = pacientes;
        this.visitas = visitas;

    }

    public HospitalVisitas() {
        personal = new ArrayList();
        for (int i = 0; i < 100; i++) {
            personal.add(new Medico());
        }

        pacientes = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            pacientes.add(new Paciente());
        }
        
        visitas = new ArrayList();
        for (int i = 0; i < 100; i++) {
            visitas.add(new Visitas());
        }
        
        //GestorFicheros.escribirFicheroBinario(GestorFicheros.FICHERO_BINARIO, this);
        GestorFicheros.escribirFicheroTexto(GestorFicheros.FICHERO, personal, pacientes);
    }
    

    public void consultaHospital() {
        System.out.println("Los médicos");
        System.out.println("");
        iterator = pacientes.iterator();
        for (int i = 0; i < personal.size(); i++) {
            System.out.println(personal.get(i).toStringFichero());
        }
        System.out.println("Los pacientes");
        System.out.println("");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(iterator.next().toStringFichero());
        }
        System.out.println("Las visitas");
        System.out.println("");
        for (int i = 0; i < visitas.size(); i++) {
            System.out.println(visitas.get(i).toString());
        }
    }

    public void consultaMedicos() {
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i).getNombre().contains("Medico")) {
                System.out.println(personal.get(i).toStringFichero());
            }

        }
    }

    public void consultaPacientes() {
        iterator = pacientes.iterator();
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(iterator.next().toStringFichero());
        }
    }

    public void añadirPersonal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime qué tipo de personal quieres añadir");
        System.out.println("Si quieres medico pulsa 1");
        System.out.println("Si quieres paciente pulsa 2");
        int eleccion = sc.nextInt();
        if (eleccion == 1) {
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
        } else if (eleccion == 2) {
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
        }
    }

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
            }
        }
        sc.close();
    }
    
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
            }
        }
        sc.close();
    }


}
