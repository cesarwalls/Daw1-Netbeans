package Libreria;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Libro implements Comparable<Libro>, Serializable {
	private int id;
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private LocalDate fechaPublicacion;
	private double precio;
	private String formato;
	private String editorial;
	private String tipo;
	private String genero;
	private int stock;
	private static int numeroLibro;
	private  int numeroVentas;
	
	public Libro( String isbn, String titulo, String autor, int numeroPaginas, LocalDate fechaPublicacion, double precio,
			String formato, String editorial, String tipo, String genero,int stock) {
		numeroLibro++;
		this.id=numeroLibro;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.fechaPublicacion = fechaPublicacion;
		this.precio = precio;
		this.formato = formato;
		this.editorial = editorial;
		this.tipo = tipo;
		this.genero = genero;
		this.stock=stock;
		this.numeroVentas=0;
	}
	public Libro() {
		numeroLibro++;
		id=numeroLibro;
		isbn="978-84"+(int)(Math.random()*(999-100)+100)+"-"+(int)(Math.random()*(9999-1000)+1000)+"-"+(int)(Math.random()*(9-1)+1);
		titulo="Libro "+numeroLibro;
		autor="Autor "+numeroLibro;
		numeroPaginas=(int)(Math.random()*(1500-100)+100);
		try{
		fechaPublicacion=LocalDate.of((int)(Math.random()*(2021-2000)+2000),(int)(Math.random()*(12-1)+1),(int)(Math.random()*(30-1)+1));
		}catch(DateTimeException e) {
			fechaPublicacion=LocalDate.of((int)(Math.random()*(2021-2000)+2000),(int)(Math.random()*(12-1)+1),(int)(Math.random()*(28-1)+1));
		}
		precio=(Math.random()*(50-5)+5);
		formato="Tapa blanda";
		editorial="Planeta";
		tipo="Novela";
		genero="Misterio";
		stock=(int)(Math.random()*100);
		numeroVentas=(int)(Math.random()*(100-10)+10);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	public int getNumeroVentas() {
		return numeroVentas;
	}
	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public static int getNumeroLibro() {
		return numeroLibro;
	}
	public static void setNumeroLibro(int numeroLibro) {
		Libro.numeroLibro = numeroLibro;
	}
	@Override
	public String toString() {
		return "Libro [id= "+id+" isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
				+ ", fechaPublicacion=" + fechaPublicacion + ", precio=" + precio + ", formato=" + formato
				+ ", editorial=" + editorial + ", tipo=" + tipo + ", genero=" + genero +" "+"Stock= "+stock+ " numeroVentas="+numeroVentas+"]";
	}
	public String toStringFichero() {
		return id+";"+isbn+";"+titulo+";"+autor+";"+numeroPaginas+";"+fechaPublicacion+";"+precio+";"+formato+";"+editorial+";"+tipo+";"+genero+";"+";"+stock+";"+numeroVentas;
	}
	@Override
	public int compareTo(Libro l) {
		return this.getTitulo().compareTo(l.getTitulo());
	}
	
}
