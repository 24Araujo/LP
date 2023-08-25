/*
 * ex60.java
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

public class ex60 {
	
	public static void main (String[] args) {
		Scanner scNum = new Scanner (System.in);
		
		System.out.print("Enter the first term of Ricci sequence: ");
		int term1 = scNum.nextInt();
		System.out.print("Enter the second term of Ricci sequence: ");
		int term2 = scNum.nextInt();
		System.out.print("Enter a number and find out if it belongs to the Ricci sequence: ");
		int num = scNum.nextInt();
		boolean found = false;
		
		while (term2 <= num){
			
			if (num == term2){
					found = true;
				}
			
			int nextTerm = term1 + term2;
			term1 = term2; 
			term2 = nextTerm;
			
			}
		 
		if (found){
				System.out.print("This number belongs to the Ricci sequence!");
			} else {
				System.out.print("This number does not belong to the Ricci sequence!");
				}
		
		scNum.close();
		//Hemily Araujo Ferraz
	}
}


