package Libreria;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente implements Serializable {
	private String nombre;
	private String nif;
	private int numeroCompras;
	private int edad;
	private LocalDate fechaNacimiento;
	public static int numeroCliente;
	
	public Cliente(String nombre, String nif, int numeroCompras, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.nif = nif;
		this.numeroCompras = numeroCompras;
		this.edad = fechaNacimiento.compareTo(LocalDate.now());
		this.fechaNacimiento = fechaNacimiento;
	}
	public Cliente(String nombre, String nif, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.nif = nif;
		this.numeroCompras =0;
		this.edad = fechaNacimiento.compareTo(LocalDate.now());
		this.fechaNacimiento = fechaNacimiento;
	}
	public Cliente() {
		numeroCliente++;
		nombre="Cliente "+numeroCliente;
		nif=""+(int)(Math.random()*(99999999-10000000)+10000000)+"P";
		numeroCompras=(int)(Math.random()*(20-1)+1);
		edad=(int)(Math.random()*(90-10)+10);
		try{
			fechaNacimiento=LocalDate.of((int)(Math.random()*(2021-2000)+2000),(int)(Math.random()*(12-1)+1),(int)(Math.random()*(30-1)+1));
			}catch(DateTimeException e) {
				fechaNacimiento=LocalDate.of((int)(Math.random()*(2021-2000)+2000),(int)(Math.random()*(12-1)+1),(int)(Math.random()*(28-1)+1));
			};
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getNumeroCompras() {
		return numeroCompras;
	}

	public void setNumeroCompras(int numeroCompras) {
		this.numeroCompras = numeroCompras;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		Cliente.numeroCliente = numeroCliente;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", nif=" + nif + ", numeroCompras=" + numeroCompras + ", edad=" + edad
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	public String toStringFichero() {
		return nombre+";"+nif+";"+numeroCompras+";"+edad+";"+fechaNacimiento+";";
	}
}
