package Libreria;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Factura implements Comparable<Factura>, Serializable {
	private static int numero;
	private int numeroFactura;
	private LocalDate fechaExpedicion;
	private LocalTime horaExpedicion;
	private String nifCliente;
	private ArrayList<Libro> productos;
	private double precio;

	public Factura(String nifCliente, ArrayList<Libro> productos) {
		numero++;
		numeroFactura=numero;
		this.fechaExpedicion = LocalDate.now();
		this.horaExpedicion=LocalTime.now();
		this.nifCliente = nifCliente;
		this.productos = productos;
		this.precio = calcularPrecio();
	}
	public Factura() {
		numero++;
		numeroFactura=numero;
		try{
			fechaExpedicion=LocalDate.of((int)(Math.random()*(2021-2000)+2000),(int)(Math.random()*(12-1)+1),(int)(Math.random()*(30-1)+1));
			}catch(DateTimeException e) {
				fechaExpedicion=LocalDate.of((int)(Math.random()*(2021-2000)+2000),(int)(Math.random()*(12-1)+1),(int)(Math.random()*(28-1)+1));
			}
			horaExpedicion=LocalTime.now();
		nifCliente=""+(int)(Math.random()*(99999999-10000000)+10000000)+"P";
		productos=new ArrayList();
		for (int i = 0; i < 5; i++) {
			productos.add(new Libro());
		}
		precio=(Math.random()*(50-10)+10);
	}
	public double calcularPrecio() {
		double suma=0;
		for (int i = 0; i < productos.size(); i++) {
			suma= suma + productos.get(i).getPrecio();
		}
		return suma;
	}
	
	public static int getNumero() {
		return numero;
	}
	public static void setNumero(int numero) {
		Factura.numero = numero;
	}
	public LocalTime getHoraExpedicion() {
		return horaExpedicion;
	}
	public void setHoraExpedicion(LocalTime horaExpedicion) {
		this.horaExpedicion = horaExpedicion;
	}
	public int getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public LocalDate getFechaExpedicion() {
		return fechaExpedicion;
	}
	public void setFechaExpedicion(LocalDate fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	public String getNifCliente() {
		return nifCliente;
	}
	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}
	public ArrayList<Libro> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Libro> productos) {
		this.productos = productos;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Factura ["+"NúmeroFactura="+numeroFactura+"fechaExpedicion=" + fechaExpedicion + ", nifCliente=" + nifCliente + ", productos=" + productos
				+ ", precio=" + precio + "]";
	}
	public String toStringFichero() {
		return numeroFactura+";"+fechaExpedicion+";"+nifCliente+";"+precio;
	}
	public String toStringProductos(){
		String aux=null;
		for (int i = 0; i < productos.size(); i++) {
			aux=productos.get(i).toStringFichero();
		}
		return aux;
	}
	@Override
	public int compareTo(Factura arg0) {
		return this.getNumeroFactura()-arg0.getNumeroFactura();
	}
	
}
