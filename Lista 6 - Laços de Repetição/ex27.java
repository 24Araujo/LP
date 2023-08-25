/*
 * ex27.java
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
 * 27) Escreva um programa em Java que imprima sequência 3:
1, 1 2 3 4 5 6 7 8 9 10
2, 1 2 3 4 5 6 7 8 9
3, 1 2 3 4 5 6 7 8
4, 1 2 3 4 5 6 7
5, 1 2 3 4 5 6
6, 1 2 3 4 5
7, 1 2 3 4
8, 1 2 3
9, 1 2
10, 1
 */


public class ex27 {
	
	public static void main (String[] args) {
		
		int k = 10;
		
		for (int i = 1; i <= 10; i++){
			
			System.out.print( i + ", ");
			
			for (int j = 1; j <= k ; j++){
				
				System.out.print( j + " ");
				
			}
			
			k--;
			System.out.println();
			
		}
		
		
		//Hemily De Araujo Ferraz
	}
}

