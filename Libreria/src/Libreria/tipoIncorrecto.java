package Libreria;

public class tipoIncorrecto extends RuntimeException {
	public tipoIncorrecto() {
		super("Error. El tipo introducido no es correcto. El tipo debe ser novela, comic, diccionario o enciclopedia.");
	}
	public tipoIncorrecto(String mensaje) {
		super(mensaje);
	}
}
