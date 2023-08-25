/*
 * ex53.java
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


public class ex53 {
	
	public static void main (String[] args) {
		
		System.out.println("\tThe Fibonacci numbers that are present in the range from 1 to 250: ");
		
		int term1 = 0;
		int term2 = 1;
		boolean valid = true;
		boolean prime = true;
		
		while (valid){
			
			if (prime){
				System.out.print(term1);
				prime = false;
			} else {
				System.out.print(", " + term1); 
			}
			
			int nextTerm = term1 + term2;
			term1 = term2;
			term2 = nextTerm;
			valid = (term1 >= 250 ? false : true);
		}
		
		//Hemily Araujo Ferraz
	}
}
