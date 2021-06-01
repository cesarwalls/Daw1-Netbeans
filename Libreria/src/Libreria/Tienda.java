package Libreria;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Tienda implements Comparator<Libro>, Serializable {
	private ArrayList<Libro> libros;
	private HashMap<String, ArrayList<Integer>> cestas;
	private ArrayList<Cliente> clientes;
	private ArrayList<Administrador> administradores;
	private TreeSet<Factura> facturas;
	private ArrayList<Libro> busquedas;
	private boolean tresPorDos;
	private boolean cincuentaPorciento;
	private boolean setentaYCincoPorCiento;
	
	
	public Tienda(ArrayList<Libro> libros, HashMap<String, ArrayList<Integer>> cestas, ArrayList<Cliente> clientes,
			TreeSet<Factura> facturas) {
		this.libros = libros;
		this.cestas = cestas;
		this.clientes = clientes;
		this.facturas = facturas;
		tresPorDos=false;
		cincuentaPorciento=false;
		setentaYCincoPorCiento=false;
	}
		public Tienda() {
		libros= new ArrayList();
		for (int i = 0; i < 100; i++) {
			libros.add(new Libro());
		}
		clientes=new ArrayList();
		for (int i = 0; i < 100; i++) {
			clientes.add(new Cliente());
		}
		administradores=new ArrayList();
		for (int i = 0; i < 2; i++) { //Nombre de usuario: administrador 1 o administrador 2. Contraseña: contraseña.
			administradores.add(new Administrador());
		}
		cestas=new HashMap();
		facturas=new TreeSet();
		tresPorDos=false;
		cincuentaPorciento=false;
		setentaYCincoPorCiento=false;
		GestionFicheros.escribirFicheroBinario(this);
		GestionFicheros.escribirFicheroTexto(clientes);
	}
	/*public Tienda() {
		libros=GestionFicheros.leerFicheroBinario().getLibros();
		//clientes=GestionFicheros.leerFicheroBinario().getClientes();
		clientes=GestionFicheros.leerFicheroTexto();
		administradores=GestionFicheros.leerFicheroBinario().getAdministradores();
		cestas=GestionFicheros.leerFicheroBinario().getCestas();
		facturas=GestionFicheros.leerFicheroBinario().getFacturas();
		tresPorDos=GestionFicheros.leerFicheroBinario().isTresPorDos();
		cincuentaPorciento=GestionFicheros.leerFicheroBinario().isCincuentaPorciento();
		setentaYCincoPorCiento=GestionFicheros.leerFicheroBinario().isSetentaYCincoPorCiento();
	}*/
	
	public void gestionarUsuarios() {
		Scanner lector = new Scanner(System.in);
		int numero=0;
		boolean correcto=true;
		do {
		System.out.println("Introduce un número para seleccionar.");
		do {
		System.out.println("1. Listar usuarios.");
		System.out.println("2. Eliminar usuarios.");
		System.out.println("3. Atrás.");
		try {
			numero=lector.nextInt();
			switch(numero) {
			case 1:
				System.out.println("Usuarios registrados en la tienda actualmente:");
				for (int i = 0; i < clientes.size(); i++) {
					System.out.println(clientes.get(i));
				}
				break;
			case 2:
				boolean eliminado=false;
				System.out.println("Introduce el nombre del usuario que quieres eliminar.");
				lector.nextLine();
				String nombre=lector.nextLine();
				for (int i = 0; i < clientes.size(); i++) {
					if(nombre.equals(clientes.get(i).getNombre())) {
						clientes.remove(i);
						eliminado=true;
						i=clientes.size();
					}
				}
				if(eliminado) {
					System.out.println("El usuario de nombre "+nombre+" ha sido eliminado correctamente.");
				}else {
					System.out.println("Error. No se ha encontrado ningún usuario cuyo nombre sea "+nombre);
				}
			}
		}catch (InputMismatchException e) {
			System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			correcto=false;
		}
		}while(!correcto);
		}while(numero!=3);
	}
	public void gestionarOfertas(){
		Scanner lector=new Scanner(System.in);
		boolean correcto=true;
		int numero=0;
		System.out.println("Pulsa un número para seleccionar.");
		do{
		System.out.println("1. Añadir ofertas.");
		System.out.println("2. Eliminar ofertas.");
		try{
			numero=lector.nextInt();
			switch(numero){
			case 1:
				agregarOfertas();
				break;
			case 2:
				eliminarOfertas();
				break;
			}
		}catch(InputMismatchException e){
			System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			correcto=false;
		}
		}while(!correcto);
	}
	public void agregarOfertas(){
		Scanner lector=new Scanner(System.in);
		int numero=0;
		boolean correcto=true;
		do{
		System.out.println("Selecciona la oferta que quieres añadir.");
		do{
		System.out.println("1. 3x2.");
		System.out.println("2. -50%");
		System.out.println("3. -75%");
		System.out.println("4. Atrás.");
		try{
			numero=lector.nextInt();
			switch(numero){
			case 1:
				this.setTresPorDos(true);
				System.out.println("3x2 añadido.");
				break;
			case 2:
				boolean correcto2=true;
				int numero2=0;
				if(this.isSetentaYCincoPorCiento()){
					System.out.println("Hay una oferta de -75% activada. ¿Quieres eliminarla para poder activar la de 50 o prefieres mantener la de 75?");
					do{
					System.out.println("1. Eliminar la oferta de 75% y añadir la de 50.");
					System.out.println("2. Mantener la de 757%");
					try{
						numero2=lector.nextInt();
						switch(numero2){
						case 1:
							this.setSetentaYCincoPorCiento(false);
							this.setCincuentaPorciento(true);
							System.out.println("Se ha eliminado la oferta de 75% y se ha añadido la de 50%");
							break;
						case 2:
							System.out.println("Se mantiene la oferta de 75%.");
							break;
						}
					}catch(InputMismatchException e){
						System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
						correcto2=false;
					}
					}while(!correcto2);
				}else{
					this.setCincuentaPorciento(true);
					System.out.println("Oferta de -50% añadida.");
				}
				break;
			case 3:
				boolean correcto3=true;
				int numero3=0;
				if(this.isCincuentaPorciento()){
					System.out.println("Hay una oferta de -50% activada. ¿Quieres eliminarla para poder activar la de 75 o prefieres mantener la de 50?");
					do{
					System.out.println("1. Eliminar la oferta de 50% y añadir la de 75.");
					System.out.println("2. Mantener la de 50%");
					try{
						numero3=lector.nextInt();
						switch(numero3){
						case 1:
							this.setCincuentaPorciento(false);
							this.setSetentaYCincoPorCiento(true);
							System.out.println("Se ha eliminado la oferta de 50% y se ha añadido la de 75%");
							break;
						case 2:
							System.out.println("Se mantiene la oferta de 50%.");
							break;
						}
					}catch(InputMismatchException e){
						System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
						correcto3=false;
					}
					}while(!correcto3);
				}else{
					this.setSetentaYCincoPorCiento(true);
					System.out.println("Oferta de -75% añadida.");
				}
				break;
			}
		}catch(InputMismatchException e){
			System.out.println("Por favor, introduce un nñumero en lugar de una letra para seleccionar.");
			correcto=false;
		}
		}while(!correcto);
		}while(numero!=4);
	}
	public void eliminarOfertas(){
		boolean correcto=true;
		Scanner lector=new Scanner(System.in);
		int numero=0;
		System.out.println("Selecciona la oferta que quieres eliminar.");
		do{
		System.out.println("1. Eliminar 3x2.");
		System.out.println("2. Eliminar -50%.");
		System.out.println("3. Eliminar -75%.");
		try{
			numero=lector.nextInt();
			switch(numero){
			case 1:
				this.setTresPorDos(false);
				System.out.println("3x2 eliminado.");
				break;
			case 2:
				this.setCincuentaPorciento(false);
				System.out.println("-50% eliminado.");
				break;
			case 3:
				this.setSetentaYCincoPorCiento(false);
				System.out.println("-75% eliminado.");
				break;
			}
		}catch(InputMismatchException e){
			System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			correcto=false;
		}
		}while(!correcto);
	}
	public boolean isCincuentaPorciento() {
		return cincuentaPorciento;
	}
	public void setCincuentaPorciento(boolean cincuentaPorciento) {
		this.cincuentaPorciento = cincuentaPorciento;
	}
	public boolean isSetentaYCincoPorCiento() {
		return setentaYCincoPorCiento;
	}
	public void setSetentaYCincoPorCiento(boolean setentaYCincoPorCiento) {
		this.setentaYCincoPorCiento = setentaYCincoPorCiento;
	}
	public boolean isTresPorDos() {
		return tresPorDos;
	}
	public void setTresPorDos(boolean tresPorDos) {
		this.tresPorDos = tresPorDos;
	}
	public void gestionarLibros() {
		Scanner lector = new Scanner(System.in);
		int numero=0;
		boolean correcto=true;
		do {
		System.out.println("Pulsa un número para seleccionar.");
		do {
		System.out.println("1. Añadir libros.");
		System.out.println("2. Eliminar libros.");
		System.out.println("3. Modificar precio.");
		System.out.println("4. Atrás.");
		try {
			numero=lector.nextInt();
			switch(numero) {
			case 1:
				agregarLibros();
				break;
			case 2:
				eliminarLibros();
				break;
			case 3:
				modificarPrecio();
				break;
			}
		}catch(InputMismatchException e) {
			System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			correcto=false;
		}
		}while(!correcto);
		}while(numero!=4);
	}
	public void modificarPrecio(){
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el título del libro al que quieres cambiar el precio.");
		String titulo=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getTitulo().equalsIgnoreCase(titulo)){
				System.out.println("Introduce el nuevo precio para el libro de título "+titulo);
				double precio=lector.nextDouble();
				libros.get(i).setPrecio(precio);
				System.out.println("Precio de "+titulo+" modificado correctamente. Precio actual: "+libros.get(i).getPrecio());
				i=libros.size();
			}
		}
		
	}
	public void agregarLibros() {
		Scanner lector = new Scanner(System.in);
		boolean excepcion=false;
		System.out.println("Selecciona cuantos libros quieres añadir.");
		int numeroLibros=lector.nextInt();
		for (int i = 0; i < numeroLibros; i++) {
			System.out.println("Libro "+(i+1));
			System.out.println("************************");
			System.out.println("Introduce el isbn.");
			lector.nextLine();
			String isbn=lector.nextLine();
			System.out.println("Introduce el título.");
			String titulo=lector.nextLine();
			System.out.println("Introduce el autor.");
			String autor=lector.nextLine();
			System.out.println("Introduce el número de páginas.");
			int numeroPaginas=lector.nextInt();
			System.out.println("Introduce el día de publicación.");
			int dia=lector.nextInt();
			System.out.println("Introduce el mes de publicación.");
			int mes=lector.nextInt();
			System.out.println("Introduce el año de publicación.");
			int anyo=lector.nextInt();
			LocalDate fecha= LocalDate.of(anyo, mes, dia);
			System.out.println("Introduce el precio.");
			lector.nextLine();
			double precio=lector.nextDouble();
			String formato = null;
			lector.nextLine();
			do {
			System.out.println("Introduce el formato.");
			
			try {
			validarFormato(formato=lector.nextLine());
			}catch(formatoIncorrecto e) {
				System.out.println(e.getMessage());
				excepcion=true;
			}
			}while(excepcion);
			System.out.println("Introduce la editorial.");
			String editorial=lector.nextLine();
			boolean tipoCorrecto=true;
			String tipo = null;
			do {
			System.out.println("Introduce el tipo.");
			try {
				tipoCorrecto=true;
				validarTipo(tipo=lector.nextLine());
			}catch(tipoIncorrecto e) {
				System.out.println(e.getMessage());
				tipoCorrecto=false;
			}
			}while(!tipoCorrecto);
			System.out.println("Introduce el género.");
			String genero=lector.nextLine();
			System.out.println("Introduce la cantidad en stock.");
			int stock=lector.nextInt();
			
			libros.add(new Libro(isbn, titulo, autor, numeroPaginas, fecha, precio, formato, editorial, tipo, genero, stock ));
		}
	
	}
	public void eliminarLibros() {
		Scanner lector = new Scanner(System.in);
		boolean correcto=true;
		int numero=0;
		do {
		System.out.println("Pulsa un número para seleccionar.");
		do {
		System.out.println("1. Eliminar por título.");
		System.out.println("2. Eliminar por autor.");
		System.out.println("3. Eliminar por isbn.");
		System.out.println("4. Eliminar por editorial.");
		System.out.println("5. Atrás.");
			try {
				numero=lector.nextInt();
				switch(numero) {
				case 1:
					eliminarPorTitulo();
					break;
				case 2:
					eliminarPorAutor();
					break;
				case 3:
					eliminarPorIsbn();
					break;
				case 4:
					eliminarPorEditorial();
					break;
				case 5:
					break;
				default:
					System.out.println("Por favor, introduce un número entre 1 y 4 para seleccionar.");
				}
				
			}catch (InputMismatchException e) {
				System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
				correcto=false;
			}
		}while(!correcto);
		}while(numero != 5);
	}
	public void eliminarPorTitulo() {
		Scanner lector = new Scanner(System.in);
		boolean eliminado=false;
		System.out.println("Introduce el título del libro que quieres eliminar.");
		String titulo=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				libros.remove(i);
				eliminado=true;
			}
		}
		if(!eliminado) {
			System.out.println("Error. No se ha encontrado ningún libro con ese título. Comprueba que esté bien escrito.");
		}else {
			System.out.println("Libro eliminado correctamente.");
		}
	}
	public void eliminarPorAutor() {
		Scanner lector = new Scanner(System.in);
		boolean eliminado=false;
		System.out.println("Introduce el autor de los libros que quieres eliminar.");
		String autor=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getAutor().equalsIgnoreCase(autor)) {
				libros.remove(i);
				eliminado=true;
			}
		}
		if(eliminado) {
			System.out.println("Todos los libros cuyo autor es "+autor+" se han eliminado correctamente.");
		}else {
			System.out.println("Error. No se han encontrado libros cuyo autor sea "+autor+".");
		}
	}
	public void eliminarPorIsbn() {
		Scanner lector = new Scanner(System.in);
		boolean eliminado=false;
		System.out.println("Introduce el isbn del libro que quieres eliminar.");
		String isbn=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
				libros.remove(i);
				eliminado=true;
			}
		}
		if(eliminado) {
			System.out.println("El libro cuyo isbn era "+isbn+"se ha eliminado correctamente.");
		}else {
			System.out.println("Error. No se ha encontrado ningún libro cuyo isbn es "+isbn+".");
		}
	}
	public void eliminarPorEditorial() {
		Scanner lector = new Scanner(System.in);
		boolean eliminado=false;
		System.out.println("Introduce la editorial de los libros que quieres eliminar.");
		String editorial=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getEditorial().equalsIgnoreCase(editorial)) {
				libros.remove(i);
				eliminado=true;
			}
		}
		if(eliminado) {
			System.out.println("Todos los libros de la editorial "+editorial+" han sido eliminados correctamente.");
		}else {
			System.out.println("Error. No se han encontrado libros cuya editorial sea "+editorial+".");
		}
		
		}
	public void listarMasVendidos(int numero) {
		ArrayList<Libro> aux=new ArrayList();
		aux=libros;
		Collections.sort(aux, new porVentas());
		for (int i = 0; i < numero; i++) {
			System.out.println(aux.get(i));
		}
	}
	public void buscarLibros() {
		Scanner lector=new Scanner(System.in);
		boolean correcto=true;
		int numero=0;
		System.out.println("Pulsa un número para seleccionar.");
		do {
		do {
		System.out.println("1. Buscar por título.");
		System.out.println("2. Buscar por autor.");
		System.out.println("3. Buscar por ISBN.");
		System.out.println("4. Buscar por formato.");
		System.out.println("5. Buscar por editorial.");
		System.out.println("6. Buscar por género.");
		System.out.println("7. Volver atrás.");
		try {
		numero=lector.nextInt();
		switch(numero) {
		case 1:
			busquedas=buscarPorTitulo();
			System.out.println("Para acceder a la pantalla de compra, pulsa 8.");
			break;
		case 2:
			busquedas=bucarPorAutor();
			System.out.println("Para comprar pulsa 8");
			break;
		case 3:
			buscarPorISBN();
			System.out.println("Para comprar pulsa 8");
			break;
		case 4:
			busquedas=buscarPorFormato();
			System.out.println("Para comprar pulsa 8");
			break;
		case 5:
			busquedas=buscarPorEditorial();
			System.out.println("Para comprar pulsa 8");
			break;
		case 6:
			busquedas=buscarPorGenero();
			System.out.println("Para comprar pulsa 8");
			break;
		case 7:
			break;
		case 8:
			pantallaCompra();
			break;
		}
		}catch(InputMismatchException e) {
			System.out.println("Por favor, introduce un nï¿½mero en lugar de una letra para seleccionar.");
			lector.nextLine();
			correcto=false;
		}
		}while(!correcto);
		}while( numero!=7);
	}
	public void registrarse(){
		Scanner lector=new Scanner(System.in);
		boolean coinciden;
		String usuario;
		String contrasenya;
		System.out.println("Introduce tu nombre.");
		String nombre=lector.nextLine();
		System.out.println("Introduce tu nif");
		String nif=lector.nextLine();
		System.out.println("Introduce tu dï¿½a de nacimiento.");
		int dia=lector.nextInt();
		System.out.println("Introduce tu mes de nacimiento.");
		int mes=lector.nextInt();
		System.out.println("Introduce tu aï¿½o de nacimiento.");
		int anyo= lector.nextInt();
		LocalDate fecha=LocalDate.of(anyo, mes, dia);
		
		System.out.println("Introduce el nombre de usuario que desees.");
		lector.nextLine();
		 usuario=lector.nextLine();
		 do{
			coinciden=true;
		System.out.println("Introduce la contraseï¿½a que desees.");
		 contrasenya=lector.nextLine();
		System.out.println("Introduce de nuevo la contraseï¿½a.");
		String contrasenya2=lector.nextLine();
		if(contrasenya.compareTo(contrasenya2)!=0){
			System.out.println("Error. Las contraseï¿½as no coinciden.");
			coinciden=false;
		}
		}while(!coinciden);
		Cliente nuevoCliente=new ClienteRegistrado(nombre, nif, fecha, usuario, contrasenya);
		clientes.add(nuevoCliente);
		System.out.println("Cliente registrado correctamente.");
		GestionFicheros.escribirFicheroBinario(this);
	}
	public void agregarAdmin() {
		boolean nombreRepetido=false;
		Scanner lector = new Scanner(System.in);
		String nombre=null;
		do {
			nombreRepetido=false;
		System.out.println("Introduce un nombre para el nuevo administrador.");
		 nombre=lector.nextLine();
		for (int i = 0; i < administradores.size(); i++) {
			if(nombre.equals(administradores.get(i).getNombre())) {
				System.out.println("Error. El nombre de administrador introducido ya existe. Por favor, introduce otro.");
				nombreRepetido=true;
				i=administradores.size();
			}
		}
		}while(nombreRepetido);
		System.out.println("Introduce una contraseña para el nuevo administrador.");
		String contrasenya=lector.nextLine();
		
		administradores.add(new Administrador(nombre, contrasenya));
		System.out.println("Administrador añadido correctamente.");
	}
	public Cliente iniciarSesion(){
		Scanner lector=new Scanner(System.in);
		boolean registrado=false;
		boolean correcto=true;
		Cliente aux = null;
		int numero=0;
		System.out.println("Pulsa un nï¿½mero para seleccionar.");
		do{
		System.out.println("1. Iniciar sesiï¿½n.");
		System.out.println("2. Acceder como invitado.");
		try{
			numero=lector.nextInt();
			switch(numero){
			case 1:
                lector.nextLine();
                do{
				System.out.println("Introduce tu nombre de usuario.");
				String usuario=lector.nextLine();
				System.out.println("Introduce tu contraseï¿½a.");
				String contrasenya=lector.nextLine();
				for (int i = 0; i < clientes.size(); i++) {
					
					if(clientes.get(i).getClass().getSimpleName().equalsIgnoreCase("ClienteRegistrado")){
						if(((ClienteRegistrado) clientes.get(i)).getNombreUsuario().equalsIgnoreCase(usuario) && ((ClienteRegistrado) clientes.get(i)).getContrasenya().equalsIgnoreCase(contrasenya)){
							System.out.println("Bienvenid@, "+clientes.get(i).getNombre());
							registrado=true;
							aux=clientes.get(i);
						}else{
							registrado=false;
						}
					}
				}
				if(!registrado){
					System.out.println("Error. El nombre de usuario o la contraseï¿½a no son correctos.");
				}
                }while(!registrado);
               break;
			case 2:
				System.out.println("Acceso como invitado.");
				aux=new Cliente();
				break;
			default:
				System.out.println("Por favor, introduce un nï¿½mero entre 1 y 2 para seleccionar.");
			}
		}catch(InputMismatchException e){
			System.out.println("Por favor, introduce un nï¿½mero en lugar de una letra para seleccionar.");
			correcto=false;
		}
		}while(!correcto);
		return aux;
		
	}
	public boolean iniciarSesionAdmin() {
		Scanner lector = new Scanner(System.in);
		boolean registro=false;
		do {
		System.out.println("Introduce el nombre del administrador.");
		String nombre=lector.nextLine();
		System.out.println("Introduce la contraseña del administrador.");
		String contrasenya=lector.nextLine();
		for (int i = 0; i < administradores.size(); i++) {
			if(administradores.get(i).getNombre().equals(nombre) && administradores.get(i).getContrasenya().equals(contrasenya)) {
				System.out.println("Bienvenid@, "+nombre);
				registro=true;
			}
		}
		if(!registro) {
			System.out.println("Error. El nombre de usuario o la contraseña no son correctos.");
		}
		}while(!registro);
		return registro;
	}
	public void pantallaCompra() {
		Scanner lector = new Scanner(System.in);
		Cliente aux= iniciarSesion();
		if(busquedas.size()==1) {
			compraUnica(aux);
			comprar(aux);
		}else if(busquedas.size()>1) {
			agregarCesta(aux);
			comprar(aux);
		}
	}
	public void compraUnica(Cliente aux) {
		cestas=new HashMap();
		
		ArrayList<Integer> id=new ArrayList();
		for (int i = 0; i < busquedas.size(); i++) {
			id.add(busquedas.get(i).getId());
		}
		cestas.put(aux.getNif(), id);
			
	}
	public void agregarCesta(Cliente aux) {
		Scanner lector = new Scanner(System.in);
		cestas=new HashMap();
		System.out.println("Selecciona el ID de los libros que quieres añadir a la cesta. Para aceptar, pulsa 0.");
		for (int i = 0; i < busquedas.size(); i++) {
			System.out.println(busquedas.get(i).getId()+"= "+busquedas.get(i).getTitulo());
		}
		ArrayList <Integer> seleccion=new ArrayList();
		for (int i = 0; i < busquedas.size(); i++) {
			seleccion.add(lector.nextInt());
			if(seleccion.get(i)==0) {
				seleccion.remove(i);
				i=busquedas.size();
				
			}
		}
		
		cestas.put(aux.getNif(), seleccion);
		System.out.println("Libros añadidos a la cesta correctamente.");
	}
	public void comprar(Cliente aux) {
		Scanner lector = new Scanner(System.in);
		ArrayList<Libro> librosCompra=new ArrayList();
		for (int i = 0; i < cestas.get(aux.getNif()).size(); i++) {
			for (int j = 0; j < libros.size(); j++) {
				if(cestas.get(aux.getNif()).get(i)==libros.get(j).getId()) {
				librosCompra.add(libros.get(j));
				}
			}
			
		}
		Factura f = new Factura(aux.getNif(), librosCompra);
		facturas.add(f);
		boolean correcto=true;
		if(aux.getClass().getSimpleName().equalsIgnoreCase("ClienteRegistrado")) {
		comprobarOfertas(f, librosCompra, aux);
		}else {
			pago(aux, librosCompra, f);
		}
	}
	
	public void comprobarOfertas(Factura f, ArrayList<Libro> librosCompra, Cliente aux) {
		Scanner lector = new Scanner(System.in);
		boolean correcto=true;
		do {
		if(this.isTresPorDos() && librosCompra.size() ==3){
			double precioInicial=f.getPrecio();
			double precioOferta=f.getPrecio()-precioMasBajo(librosCompra);
			System.out.println("¡Promoción de 3x2 aplicada!");
			System.out.println("Precio inicial: "+precioInicial+"€");
			System.out.println("Precio con promoción: "+precioOferta+"€");
		/*Collections.sort(librosCompra, new porPrecioMenor());
		ArrayList<Libro> aux2=obtenerLibros(3, librosCompra);*/
		
	}else if(this.isCincuentaPorciento()){
			double precioInicial=f.getPrecio();
			f.setPrecio(f.getPrecio()-(f.getPrecio()*0.50));
			System.out.println("¡Promoción de -50% aplicada!");
			System.out.println("Precio inicial: "+precioInicial+"€");
			System.out.println("Precio con promoción: "+f.getPrecio()+"€");
		}else if(this.isSetentaYCincoPorCiento()){
				double precioInicial=f.getPrecio();
				f.setPrecio(f.getPrecio()- (f.getPrecio()*0.75));
				System.out.println("¡Promoción de -75% aplicada!");
				System.out.println("Precio inicial: "+precioInicial+"€");
				System.out.println("Precio con promoción: "+f.getPrecio()+"€");
			}else {
				pago(aux, librosCompra, f);
			}
		}while(!correcto);
	}
	public void pago(Cliente aux, ArrayList<Libro> librosCompra, Factura f) {
		Scanner lector = new Scanner(System.in);
		boolean correcto=true;
		System.out.println("Precio total de la compra: "+f.getPrecio()+"€");
		System.out.println("Para comprar pulsa 1, para cancelar pulsa 2."); 
		int numero=0;
		try {
			numero=lector.nextInt();
			switch(numero) {
			case 1:
				aux.setNumeroCompras(aux.getNumeroCompras()+1);
				for (int i = 0; i < librosCompra.size(); i++) {
					
					for (int j = 0; j < libros.size(); j++) {
						if(librosCompra.get(i).getId()==libros.get(j).getId()) {
							libros.get(i).setNumeroVentas(libros.get(i).getNumeroVentas()+1);
							libros.get(i).setStock(libros.get(i).getStock()-1);
						}
					}
					
				}
				System.out.println("¡Gracias por tu compra! Se han añadidos los libros a tu biblioteca.");
				System.out.println("Tu biblioteca: ");
				for (int i = 0; i < f.getProductos().size(); i++) {
					System.out.println(f.getProductos().get(i));
				}
				break;
			case 2:
				System.out.println("Compra cancelada.");
				break;
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			correcto=false;
		}
	}
	public ArrayList<Libro> obtenerLibros(int cantidad, ArrayList<Libro> libros) {
		ArrayList<Libro> l= new ArrayList();
		for (int i = 0; i < cantidad; i++) {
			l.add(libros.get(i));
		}
		return l;
	}
	public double precioMasBajo(ArrayList<Libro> libros) {
		double min=libros.get(0).getPrecio();
		for (int i = 0; i < libros.size(); i++) {
			if(min > libros.get(i).getPrecio()) {
				min=libros.get(i).getPrecio();
			}
		}
		return min;
	}
	public String getInfo(int id){
           return null;
        }
        public void listarClientes(){
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));
		}
	}
	public ArrayList<Libro> buscarPorTitulo() {
		Collections.sort(libros);
		Scanner lector=new Scanner(System.in);
		ArrayList <Libro> busqueda=new ArrayList();
		System.out.println("Introduce el tï¿½tulo del libro que quieres buscar.");
		String titulo=lector.nextLine();
		Collections.sort(libros);
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println(libros.get(i));
				busqueda.add(libros.get(i));
			}
		}
		return busqueda;
	}
	public ArrayList<Libro> bucarPorAutor() {
		Collections.sort(libros);
		ArrayList<Libro> busqueda=new ArrayList();
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el autor del libro que quieres buscar.");
		String autor=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getAutor().equalsIgnoreCase(autor)) {
				System.out.println(libros.get(i));
				busqueda.add(libros.get(i));
			}
		}
		return busqueda;
	}
	public ArrayList<Libro> buscarPorISBN() {
		Collections.sort(libros);
		ArrayList<Libro> busqueda= new ArrayList();
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el ISBN del libro que quieres buscar.");
		String isbn=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
				System.out.println(libros.get(i));
				busqueda.add(libros.get(i));
			}
		}
		return busqueda;
	}
	public ArrayList<Libro> buscarPorFormato() {
		Collections.sort(libros);
		ArrayList<Libro> busqueda=new ArrayList();
		Scanner lector=new Scanner(System.in);
		boolean correcto=true;
		boolean correcto2=true;
		System.out.println("Selecciona el formato del libro que quieres bucar.");
		do {
		System.out.println("1. Tapa dura.");
		System.out.println("2. Tapa blanda.");
		System.out.println("3. Digital.");
		try {
		int formato=lector.nextInt();
		switch(formato) {
		case 1:
			for (int i = 0; i < libros.size(); i++) {
				if(libros.get(i).getFormato().equalsIgnoreCase("tapa dura"));
				busqueda.add(libros.get(i));
			}
			break;
		case 2:
			for (int i = 0; i < libros.size(); i++) {
				if(libros.get(i).getFormato().equalsIgnoreCase("tapa blanda")) {
					System.out.println(libros.get(i));
					busqueda.add(libros.get(i));
				}
			}
			break;
		case 3:
			for (int i = 0; i < libros.size(); i++) {
				if(libros.get(i).getFormato().equalsIgnoreCase("digital")) {
					System.out.println(libros.get(i));
					busqueda.add(libros.get(i));
				}
			}
			
			break;
		default:
			System.out.println("Por favor, introduce un nï¿½mero entre 1 y 3 para seleccionar.");
		}
		}catch(InputMismatchException e) {
			System.out.println("Por favor, introduce un nï¿½mero en lugar de una letra para seleccionar.");
			lector.nextLine();
			correcto2=false;
		}
		}while(!correcto2);
		return busqueda;
	}
	public ArrayList<Libro> buscarPorEditorial() {
		Collections.sort(libros);
		ArrayList<Libro> busqueda=new ArrayList();
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce la editorial del libro que quieres buscar.");
		String editorial=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getEditorial().equalsIgnoreCase(editorial)) {
				System.out.println(libros.get(i));
				busqueda.add(libros.get(i));
			}
		}
		return busqueda;
	}
	public ArrayList<Libro> buscarPorGenero() {
		Collections.sort(libros);
		ArrayList<Libro> busqueda=new ArrayList();
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el gï¿½nero del libro que quieres buscar.");
		String genero=lector.nextLine();
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getGenero().equalsIgnoreCase(genero)) {
				System.out.println(libros.get(i));
				busqueda.add(libros.get(i));
			}
		}
		return busqueda;
	}
	
	public void ordenarLibros() {
		Scanner lector=new Scanner(System.in);
		Boolean correcto=true;
		int numero=0;
		System.out.println("Pulsa un nï¿½mero para seleccionar.");
		do {
		do {
		System.out.println("1. Ordenar por tï¿½tulo.");
		System.out.println("2. Ordenar por autor.");
		System.out.println("3. Ordenar por ISBN.");
		System.out.println("4. Ordenar por fecha de publicaciï¿½n.");
		System.out.println("5. Ordenar por precio.");
		System.out.println("6. Atrï¿½s.");
		try {
			numero=lector.nextInt();
			switch(numero) {
			case 1:
				Collections.sort(libros, new porTitulo());
				listarLibros();
				break;
			case 2:
				Collections.sort(libros, new porAutor());
				listarLibros();
				break;
			case 3:
				Collections.sort(libros, new porISBN());
				listarLibros();
				break;
			case 4:
				Collections.sort(libros, new porFecha());
				listarLibros();
				break;
			case 5:
				int opcion=0;
				boolean error=false;
				do {
				System.out.println("Pulsa un nï¿½mero para seleccionar");
				do {
				System.out.println("1. De menor a mayor precio.");
				System.out.println("2. De mayor a menor precio.");
				System.out.println("3. Definir precio mï¿½nimo y precio mï¿½ximo.");
				System.out.println("4. Atrï¿½s.");
				try {
					opcion=lector.nextInt();
					
					switch(opcion) {
					case 1:
						Collections.sort(libros, new porPrecioMenor());
						listarLibros();
						break;
					case 2:
						Collections.sort(libros, new porPrecioMayor());
						listarLibros();
						break;
					case 3:
						System.out.println("Introduce el precio mï¿½nimo.");
						int minimo=lector.nextInt();
						System.out.println("Introduce el precio mï¿½ximo.");
						int maximo=lector.nextInt();
						
						Collections.sort(libros, new porPrecioMenor());
						filtrarPrecio(minimo, maximo);
						break;
					case 4:
						break;
					}
				}catch(InputMismatchException e) {
					System.out.println("Por favor, introduce un nï¿½mero en lugar de una letra para seleccionar");
					lector.nextLine();
					error=true;
				}
				}while(error);
				}while(opcion!=4);
				break;
			}
		}catch (InputMismatchException e) {
			System.out.println("Por favor, introduce un nï¿½mero en lugar de una letra para seleccionar.");
			lector.nextLine();
			correcto=false;
		}
		}while(!correcto);
		}while(numero!=6);
		
	}
	public void gestionarFacturas(){
		Scanner lector= new Scanner(System.in);
		boolean correcto=true;
		int numero=0;
		System.out.println("Selecciona una opción.");
		do{
		System.out.println("1. Listar facturas.");
		System.out.println("2. Ordenar clientes por número de libros comprados.");
		try{
			numero=lector.nextInt();
			switch(numero){
			case 1:
				listarFacturas();
				break;
			case 2:
				mostrarClientesPorNumeroCompras();
				break;
			
			}
		}catch (InputMismatchException e){
			System.out.println("Por favor, introduce un númer oen lugar de una letra para seleccionar.");
			correcto=false;
		}
		}while(!correcto);
	}
	public void filtrarPrecio(int minimo, int maximo) {
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getPrecio()>minimo && libros.get(i).getPrecio()<maximo) {
				System.out.println(libros.get(i));
			}
		}
	}
	public void listarFacturas(){
		Iterator<Factura> f=facturas.iterator();
		while(f.hasNext()){
			System.out.println(f.next().toString());
		}
		
	}
	public void mostrarClientesPorNumeroCompras(){
		ArrayList<Factura> aux= new ArrayList(facturas);
		Collections.sort(aux, new porLibrosComprados());
		for (int i = 0; i < aux.size(); i++) {
			for (int j = 0; j < clientes.size(); j++) {
				if(aux.get(i).getNifCliente().equalsIgnoreCase(clientes.get(j).getNif())){
					System.out.println(clientes.get(j));
				}
			}
		}
	}
	public void listarLibros() {
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i));
		}
	}
	public void modificarAdmin() {
		Scanner lector = new Scanner(System.in);
		int seleccion2=0;
		boolean correcto3=true;
		do {
		System.out.println("Pulsa un número para seleccionar.");
		do {
		System.out.println("1. Cambiar nombre de administrador.");
		System.out.println("2. Cambiar contraseña.");
		System.out.println("3. Atrás.");
		try {
			seleccion2=lector.nextInt();
			switch(seleccion2) {
			case 1:
				cambiarNombreAdmin();
				break;
			case 2:
				cambiarContrasenyaAdmin();
				break;
			}
		}catch(InputMismatchException e) {
			System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			correcto3=false;
		}
		}while(!correcto3);
		}while(seleccion2!=3);
	}
	public void cambiarNombreAdmin() {
		boolean modificado=true;
		Scanner lector = new Scanner(System.in);
		do {
		System.out.println("Introduce el nombre del administrador al que quieres modificarle el nombre.");
		String nombre=lector.nextLine();
		for (int i = 0; i < administradores.size() ; i++) {
			if(administradores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Introduce el nuevo nombre para "+nombre);
				String nuevoNombre=lector.nextLine();
				administradores.get(i).setNombre(nuevoNombre);
				System.out.println("Nombre modificado correctamente. Nuevo nombre: "+nuevoNombre);
				modificado=true;
				i=administradores.size();
			}else {
				modificado=false;
			}
		}
		if(!modificado) {
			System.out.println("Error. No se ha encontrado ningún administrador cuyo nombre sea "+nombre);
		}
		}while(!modificado);
	}
	public void cambiarContrasenyaAdmin() {
		Scanner lector = new Scanner(System.in);
		boolean coinciden=true;
		boolean contrasenyaCorrecta=true;
		boolean nombreCorrecto=true;
		do {
		System.out.println("Introduce el nombre del administrador al que le quieres cambiar la contraseña.");
		String nombre=lector.nextLine();
		for (int i = 0; i < administradores.size(); i++) {
			if(administradores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				nombreCorrecto=true;
				do {
				System.out.println("Introduce la contraseña actual de "+nombre);
				String contrasenya=lector.nextLine();
				if(administradores.get(i).getContrasenya().equals(contrasenya)) {
					contrasenyaCorrecta=true;
					do {
					System.out.println("Introduce la contraseña nueva para "+nombre);
					String nuevaContrasenya=lector.nextLine();
					System.out.println("Repite la nueva contraseña.");
					String nuevaContrasenya2=lector.nextLine();
					if(nuevaContrasenya.equals(nuevaContrasenya2)) {
						administradores.get(i).setContrasenya(nuevaContrasenya);
						System.out.println("Contraseña de "+nombre+" modificada correctamente.");
						coinciden=true;
						i=administradores.size();
					}else {
						System.out.println("Error. Las contraseñas no coinciden.");
						coinciden=false;
					}
					}while(!coinciden);
				}else {
					System.out.println("Error. La contraseña introducida no es correcta,");
					contrasenyaCorrecta=false;
				}
				}while(!contrasenyaCorrecta);
			}else {
				nombreCorrecto=false;
			}
		}
		if(!nombreCorrecto) {
			System.out.println("Error. El nombre introducido no coincide con el de ningún administrador.");
		}
		}while(!nombreCorrecto);
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public HashMap<String, ArrayList<Integer>> getCestas() {
		return cestas;
	}
	public void setCestas(HashMap<String, ArrayList<Integer>> cestas) {
		this.cestas = cestas;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public TreeSet<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(TreeSet<Factura> facturas) {
		this.facturas = facturas;
	}
	
	public ArrayList<Administrador> getAdministradores() {
		return administradores;
	}
	public void setAdministradores(ArrayList<Administrador> administradores) {
		this.administradores = administradores;
	}
	public ArrayList<Libro> getBusquedas() {
		return busquedas;
	}
	public void setBusquedas(ArrayList<Libro> busquedas) {
		this.busquedas = busquedas;
	}
	public void validarFormato(String formato) throws formatoIncorrecto {
		if(!formato.equalsIgnoreCase("tapa blanda") && !formato.equalsIgnoreCase("tapa dura") && !formato.equalsIgnoreCase("digital")) {
			throw new formatoIncorrecto();
		}
	}
	public void validarTipo(String tipo) throws tipoIncorrecto {
		if(!tipo.equalsIgnoreCase("novela") && !tipo.equalsIgnoreCase("comic") && !tipo.equalsIgnoreCase("diccionario") && !tipo.equalsIgnoreCase("enciclopedia")) {
			throw new tipoIncorrecto();
		}
	}
	@Override
	public String toString() {
		return "Tienda [libros=" + libros + ", cestas=" + cestas + ", clientes=" + clientes + ", facturas=" + facturas
				+ "]";
	}
	
	public String toStringFichero() {
		return libros+";"+cestas+";"+clientes+";"+administradores+";"+facturas+";"+busquedas+";"+tresPorDos+";"+cincuentaPorciento+";"+setentaYCincoPorCiento;
	}
	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}
