package Libreria;

import java.io.Serializable;
import java.util.Scanner;

public class Administrador implements Serializable {
	private static int numeroAdmin;
	private String nombre;
	private String contrasenya;
	
	
	public Administrador(String nombre, String contrasenya) {
		this.nombre = nombre;
		this.contrasenya = contrasenya;
	}
	public Administrador() {
		numeroAdmin++;
		nombre="administrador "+numeroAdmin;
		contrasenya="contraseña";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	@Override
	public String toString() {
		return "Administrador [nombre=" + nombre + ", contrasenya=" + contrasenya + "]";
	}
	
	public String toStringFichero() {
		return nombre+";"+contrasenya;
	}
}
