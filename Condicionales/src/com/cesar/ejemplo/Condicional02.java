package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del producto");
		String nombre = sc.next();
		System.out.println("Introduce el precio");
		double precio = sc.nextDouble();
		System.out.println("Introduce la cantidad");
		int cantidad = sc.nextInt();
		String A = "A";
		if ((cantidad > 1000) || (nombre == A)) {
			System.out.println("Cual es el descuento que tiene");
			double descuento = sc.nextDouble();
			descuento = descuento / 100;
			descuento = descuento * precio;
			precio = precio - descuento;

		}
		precio = precio * cantidad;
		System.out.println("El precio de su producto "+ nombre + " es " +precio);
		sc.close();

	}

}
