/*
 * ex54.java
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
 * 
 */

import java.util.Scanner; 

public class ex54 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in); 
		
		int firstTerm, finalTerm, enterValid; 
		
		do {
			
		System.out.print("Enter a first number of Fibonacci sequence:  ");
		firstTerm = scNum.nextInt();
		 
		 int a = 0; 
		 int b = 1;
		 
		 while (b < firstTerm){
			 int aux = b; 
			 b = a + b; 
			 a = aux;
			 }
			 
			 enterValid = b; 
		} while (enterValid != firstTerm);
		
		do {
			
		System.out.print("Enter a final number of Fibonacci sequence: ");
		finalTerm = scNum.nextInt();
		
		int a = 0; 
		 int b = 1;
		 
		 while (b < finalTerm){
			 int aux = b; 
			 b = a + b; 
			 a = aux;
			 }
			 
			 enterValid = b;
			 
		} while (enterValid != finalTerm);
		
		int term1 = 0;
		int term2 = 1;
		boolean valid = true;
		boolean prime = true;
		
		while (valid){
			
					if (term1 >= firstTerm){
						
							if (prime){
					System.out.print(term1);
					prime = false;
					} else {
						System.out.print(", " + term1); 
						}
						
						}
				
				int nextTerm = term1 + term2;
				term1 = term2;
				term2 = nextTerm;
				valid = (term1 > finalTerm ? false : true);
			}
		
		scNum.close();
		
		//Hemily Araujo Ferraz
	}
}
