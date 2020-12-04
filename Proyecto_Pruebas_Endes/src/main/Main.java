package main;

import java.util.Scanner;

/**
 * 
 * @author Tardes T2
 *
 *         Fecha 23 oct. 2020~
 * 
 * @version:
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cosa = new Scanner(System.in);
		int x, y;

		System.out.println("Dime un número porfa: ");
		x = cosa.nextInt();
		System.out.println("Otro, va: ");
		y = cosa.nextInt();
		
		System.out.println("resta de tal: " +(x-y));
		cosa.close();
		Cosa p = new Cosa();
		
	}

}
