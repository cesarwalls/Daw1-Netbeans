package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional22 {

	/*En un supermercado se hace una promoci�n, mediante la cual el cliente obtiene un 
	descuento dependiendo de un numero que se escoge al azar. 
	Si el numero escogido es menor que 74 el descuento es del 15% sobre el total de la compra, 
	si es mayor o igual a 74 el descuento es del 20%. Obtener cuanto dinero se le descuenta.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el precio del producto");
		double precio = sc.nextDouble();
		System.out.println("Introduce un n�mero al azar");
		double numero = sc.nextDouble();
		if (numero<74) {
			precio = precio*0.85;
		} else {
			precio = precio*0.80;
		} 
		System.out.println("Lo que debe pagar es: "+precio+"�");
		sc.close();
	}

}
