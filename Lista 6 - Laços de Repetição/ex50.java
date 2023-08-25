/*
 * ex50.java
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

public class ex50 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		int quant = 0;
		boolean valid = true;
		int num = 0;
		do {
		System.out.print("Enter the inicial number of sequency: "); 
		num = scNum.nextInt();
		quant = 0;
		for (int i = num; i >= 1; i --){
			quant += (num % i == 0 ? 1 : 0);
			}
			
			valid = (quant == 2 ? false : true); 
			
		} while (valid);
		
		System.out.print("Enter the quantity of terms you want to know: ");
		int quantOfTerms = scNum.nextInt();
		quant = 0;
		boolean prime  = true;
		
		do {
			int cont = 0;
			
			for (int i = num; i >= 1; i--){
				
				cont += (num%i == 0 ? 1 : 0);
			
				}
				
				if (cont == 2){
					
					if (prime){
						System.out.print(num);
						prime = false;
						} else {
							System.out.print(", " + num);
							}
					quant++;
				}
			
				num++;
			} while (quant < quantOfTerms);
	}
}
//Hemily Araujo Ferraz
