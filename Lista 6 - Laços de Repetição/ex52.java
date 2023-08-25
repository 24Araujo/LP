/*
 * ex52.java
 * 
 * Copyright 2023 hemil <hemil@HEMILY>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 52) Solicite um número inteiro ao usuário e informe se ele pertence a sequência
de Fibonacci ou não.
 */

import java.util.Scanner;

public class ex52 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		int num = scNum.nextInt();
		
		int term1 = 0;
		int term2 = 1; 
		
		while (term2 < num){
		
			int aux = term2;
			term2 = term1 + term2;
			term1 = aux;
			
			}
		
		if (term2 == num) {
			System.out.println(num + " belongs to the Fibonacci sequence.");
			} else {
				System.out.println(num + " does not belong to the Fibonacci sequence.");
				}
		
		scNum.close();
		//Hemily Araujo Ferraz
	}
}


