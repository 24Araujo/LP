/*
 * ex28.java
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
 * 28) Escreva um programa em Java que imprima sequência 4:
1, 2 3 4 5 6 7 8 9 10
2, 3 4 5 6 7 8 9 10
3, 4 5 6 7 8 9 10
4, 5 6 7 8 9 10
5, 6 7 8 9 10
6, 7 8 9 10
7, 8 9 10
8, 9 10
9, 10
10,
 */


public class ex28 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 10; i++){
			
			System.out.print( i + ", ");
			
			for (int j = i + 1; j <= 10; j++){
				
				System.out.print( j + " ");
				
			}
			
			System.out.println();
			
		}







//		for (int i = 1; i <= 10; i++){
			
		//	int aux = 0;
			
		//	for (int j = i; j <= 10; j++){
				
		//		if(aux == 0){
					
		//			System.out.print( j + ", ");
					
			//	} else {
					
			//		System.out.print( j + " " );
					
		//		}
				
		//		aux++;
				
		//	}
			
		//	System.out.println();
			
		//}
		
		//Hemily De Araujo Fwrraz
	}
}

