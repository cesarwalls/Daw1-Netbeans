package Libreria;

public class formatoIncorrecto extends RuntimeException {
	public formatoIncorrecto() {
		super("Error. El formato introducido no es correcto. Por favor, introduce uno de estos 3 formatos: tapa blanda, tapa dura o digital.");
	}
	public formatoIncorrecto(String mensaje) {
		super(mensaje);
	}
}
