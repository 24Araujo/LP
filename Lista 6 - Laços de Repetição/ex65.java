/*
 * ex65.java
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

public class ex65 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the quantity of terms of sequence: ");
		int quant = scNum.nextInt();
		double termDividend = 0;
		double termDivisor = 1;
		boolean prime = true;
		boolean factorialP = true;
		double sum = 0;
		
		for (int cont = 0; cont < quant; cont++){
					

					//proximo termo de Fatoriais------------------
					if (factorialP){
						
						int factorial = 1;
						
						for (int i = cont; i > 0; i--){
								factorial *= i;
							}
							
						termDividend = factorial;
						termDividend *= -1;
						factorialP = false;
						
						} else {
						termDividend *= -1;

							int factorial = 1;
												
							for (int i = cont; i > 0; i--){
									factorial *= i;
								}
							termDividend = factorial;

							factorialP = true;
							
							}
				//-------------------------------------------------------------------
				//proximo termo prim-------------------------------------
				boolean termPrime = true;
				do {
					termDivisor++;
					int contPrime = 0;
					
					for (int i = 1; i <= termDivisor; i++){
						contPrime += (termDivisor % i == 0 ? 1 : 0);
						}
					if (contPrime == 2){
							termPrime = false;
						}
						
					} while (termPrime);
					//----------------------------------------------------------------------------------
					
						if (prime){
					System.out.print( (int)termDividend + "/" + (int)termDivisor);
					prime = false;
				}else {
					System.out.print(", " + (int)termDividend + "/" + (int)termDivisor);
					}
					
										sum += (termDividend / termDivisor);
			}
			
			System.out.println();
			System.out.printf("The sum of all terms is equal to: %.2f", sum);
		
		
		scNum.close();
		//Hemily Araujo Ferraz
	}
}

