/*
 * ex57.java
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

public class ex57 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the quantity of Perfect numbers you want to generate: ");
		int quant = scNum.nextInt();
		int cont = 0;
		int num = 1;
		int sum;
		
		while (cont < quant){
			
			sum = 0;
			
			for (int i = num - 1; i > 0; i-- ){
				if (num % i == 0){
						sum += i;
					}
				}
			
			if (num == sum){
						System.out.print(num + " ");
					cont++; 
					} 
			
			num++;
			}
		
		scNum.close();
		//Hemily Araujo Ferraz
	}
}

