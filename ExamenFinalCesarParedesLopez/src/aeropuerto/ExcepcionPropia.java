/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

/**
 *
 * @author prog
 */
public class ExcepcionPropia extends RuntimeException{

    public ExcepcionPropia() {
        System.out.println("Error. No puede meter una fecha erronea");
    }

    public ExcepcionPropia(String message) {
        super(message);
    }
    
    
    
    
    
}
