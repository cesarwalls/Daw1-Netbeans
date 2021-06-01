package roberto;
public class Puntuacion extends Exception{

    public Puntuacion() {
        System.out.println("Solo se puede una puntuacion entre 1 y 5");
    }

    public Puntuacion(String message) {
        super(message);
    }
    
    
}
