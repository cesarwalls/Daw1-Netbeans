package Libreria;

import java.time.LocalDate;

public class ClienteRegistrado extends Cliente{
	private int contadorUsuarios;
	private String nombreUsuario;
	private String contrasenya;
	
	public ClienteRegistrado() {
		super();
		contadorUsuarios++;
		nombreUsuario="Usuario "+contadorUsuarios;
		contrasenya="contraseña";
	}
	public ClienteRegistrado(String nombre, String cont){
		super();
		nombreUsuario=nombre;
		contrasenya=cont;
	}
	public ClienteRegistrado(String nombre, String nif, LocalDate fechaNacimiento, String nombreUsuario, String contrasenya) {
		super(nombre, nif, fechaNacimiento);
		this.nombreUsuario=nombreUsuario;
		this.contrasenya=contrasenya;
	}
	public ClienteRegistrado(String nombre, String nif, int numeroCompras, LocalDate fechaNacimiento, String nombreUsuario, String contrasenya) {
		super(nombre, nif, numeroCompras, fechaNacimiento);
		this.nombreUsuario=nombreUsuario;
		this.contrasenya=contrasenya;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	@Override
	public String toString() {
		return super.toString()+" [nombreUsuario=" + nombreUsuario + ", contrasenya=" + contrasenya + "]";
	}
	public String toStringFichero(){
		return super.toStringFichero()+";"+nombreUsuario+";"+contrasenya;
	}
	
	
}
