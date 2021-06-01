/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roberto;

/**
 *
 * @author prog
 */
public class Errores {
    public static void prueba(int puntuacion) throws Puntuacion{
        if(puntuacion>5 || puntuacion<1){
            throw new Puntuacion();
        }
    }
}
