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
public class Hospital implements Serializable {

    protected ArrayList<Personal> personal;
    protected TreeSet<Paciente> pacientes;
    protected Iterator<Paciente> iterator;

    public Hospital(ArrayList<Personal> personal, TreeSet<Paciente> pacientes) {
        this.personal = personal;
        this.pacientes = pacientes;

    }

    public Hospital() {
        personal = new ArrayList();
        for (int i = 0; i < 100; i++) {
            personal.add(new Medico());
        }

        pacientes = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            pacientes.add(new Paciente());
        }
        GestorFicheros.escribirFicheroBinario(GestorFicheros.FICHERO_BINARIO, this);
        GestorFicheros.escribirFicheroTexto(GestorFicheros.FICHERO, personal, pacientes);
    }

    public void consultaHospital() {
        iterator = pacientes.iterator();
        for (int i = 0; i < personal.size(); i++) {
            System.out.println(personal.get(i).toStringFichero());
        }
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
}

/*
    public void actualizarCategoria() throws ExcepcionPropia {
        //No puedo acceder a la categoría del hotel
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del hotel");
        String nombre = sc.nextLine();
        for (int i = 0; i < listaAlojamientos.size(); i++) {
            if (listaAlojamientos.get(i).nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Hemos encontrado alojamientos a tu disposicion");
                System.out.println(listaAlojamientos.get(i).toString());
                System.out.println("Dime el su nueva categoria");
                int categ = sc.nextInt();

            }
        }
        sc.close();
    }

    public void eliminarAlojamientos() {
        //Elimina bien pero cuando le digo que no elimine me repite el bucle varias veces (tantas para llegar a la posicion del alojamiento en el array)
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la pronvincia");
        String provincia = sc.next();
        for (int i = 0; i < listaAlojamientos.size(); i++) {
            if (listaAlojamientos.get(i).provincia.equalsIgnoreCase(provincia)) {
                for (int j = 0; j < listaAlojamientos.size(); j++) {
                    System.out.println("Hemos encontrado alojamientos a tu disposicion");
                    System.out.println("Desea elimninar el alojamiento");
                    System.out.println(listaAlojamientos.get(i).toString());
                    System.out.println("Si es así pulse 1 si es que no pulse 0");
                    int eleccion = sc.nextInt();
                    if (eleccion == 1) {
                        listaAlojamientos.remove(i);
                        System.out.println("Se ha eliminado el alojamiento");
                    } else {
                        System.out.println("No se ha eliminado");
                    }
                }
            }
        }
    }

    public void consultaOrdenadaNombre() {
        Collections.sort(listaAlojamientos);
        consultaAlojamientos();
    }
 */
