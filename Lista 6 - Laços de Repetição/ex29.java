/*
 * ex29.java
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
 * 29) Escreva um programa em Java que imprima sequência 5:
1, 1 3 5 7 9
2, 2 4 6 8 10
3, 1 3 5 7 9
4, 2 4 6 8 10
5, 1 3 5 7 9
6, 2 4 6 8 10
7, 1 3 5 7 9
8, 2 4 6 8 10
9, 1 3 5 7 9
10, 2 4 6 8 10
 */


public class ex29 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 10; i++){
			
			System.out.print(i + ", ");
			
			for (int j = 1; j <= 10; j++) {
				
				if (i % 2 == 1){
					
					if (j % 2 == 1){
					
						System.out.print( j + " ");
					
					}
					 
				}else {
					
					if(j % 2 == 0){
						
						System.out.print( j + " ");
						
					}
					
				}
				
			}
			
			System.out.println();
			
		}
		
		// Hemily Araujo Ferraz
	}
}

