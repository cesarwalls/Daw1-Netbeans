package Libreria;

import java.util.Comparator;


public class CriteriosComparacion {

}

class porTitulo implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}
class porAutor implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
	
}
class porISBN implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getIsbn().compareTo(l2.getIsbn());
	}
	
}
class porFecha implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		return l2.getFechaPublicacion().compareTo(l1.getFechaPublicacion());
	}
}
class porPrecioMenor implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		return (int) (l1.getPrecio()-l2.getPrecio());
	}
}
class porPrecioMayor implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		return (int) (l2.getPrecio()-l1.getPrecio());
	}
	
}
class porVentas implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		return l2.getNumeroVentas()-l1.getNumeroVentas();
	}
}
class porLibrosComprados implements Comparator<Factura>{

	@Override
	public int compare(Factura o1, Factura o2) {
		return o1.getProductos().size()-o2.getProductos().size();
	}
	
}
