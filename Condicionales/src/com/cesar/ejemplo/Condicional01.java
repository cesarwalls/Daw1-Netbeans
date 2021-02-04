package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio del producto");
		double precio = sc.nextDouble();
		System.out.println("Introduce el descuento");
		double descuento = sc.nextDouble();
		descuento = descuento / 100;
		descuento = descuento * precio;
		precio = precio - descuento;
		if (precio > 100) {
			precio = precio - 15;

		}
		System.out.println("El precio con descuento de tu producto es: " + precio);
		sc.close();

	}

}
