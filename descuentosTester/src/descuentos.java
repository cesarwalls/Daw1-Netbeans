/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cesar
 */
public class descuentos {

    public static double veinticinco(double precio) {
        precio = precio - (precio * 0.25);
        return precio;
    }

    public static double trespordos(double precio, double precio1, double precio2) {
        double trespordos = 0;
        if (precio > precio1 && precio > precio2 && precio1 > precio2) {
            trespordos = precio + precio1;
        } else if (precio > precio1 && precio > precio2 && precio2 > precio1) {
            trespordos = precio + precio2;
        } else if (precio1 > precio && precio1 > precio2 && precio > precio2) {
            trespordos = precio1 + precio;
        } else if (precio1 > precio && precio1 > precio2 && precio2 > precio) {
            trespordos = precio1 + precio2;
        } else if (precio2 > precio && precio2 > precio1 && precio > precio1) {
            trespordos = precio2 + precio;
        } else if (precio2 > precio && precio2 > precio1 && precio1 > precio) {
            trespordos = precio2 + precio1;
        }
        return trespordos;
    }

    public static double diezdescuentoporpiezaigual(double precio, double numPiezas) {
        double precioGrande = precio*numPiezas;
        double descuento = (numPiezas/10)*precioGrande;
        double precioTotal = precioGrande - descuento;
        return precioTotal;
    }
}
