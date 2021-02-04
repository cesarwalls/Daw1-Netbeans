package com.cesar.ejemplo;

import java.util.Scanner;

public class Condicional15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un año");
		int anyo = sc.nextInt();
		if ((anyo%4 == 0 && !(anyo%100==0)) || ((anyo%100 ==00 && anyo%400 == 0))){
			System.out.println("El año " +anyo+ " es bisiesto");
			
		} else {
			System.out.println("El año " +anyo+ " no es bisiesto");
		}
		sc.close();
	}

}
