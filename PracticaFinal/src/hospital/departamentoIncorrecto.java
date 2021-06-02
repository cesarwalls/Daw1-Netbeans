package hospital;

public class departamentoIncorrecto extends RuntimeException {
	public departamentoIncorrecto() {
		super("Error. El departamento introducido no es correcto. El departamento debe ser Cardiología, Neurología, Inmunología, Hematología o Pediatría.");
	}
	public departamentoIncorrecto(String mensaje) {
		super(mensaje);
	}
}
