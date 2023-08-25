/*
 * ex30.java
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
 * 30) Escreva um programa em Java que imprima sequência 6:
1, 1
2, 2 4
3, 1 3 5
4, 2 4 6 8
5, 1 3 5 7 9
6, 2 4 6 8 10 12
7, 1 3 5 7 9 11 13
8, 2 4 6 8 10 12 14 16
9, 1 3 5 7 9 11 13 15 17
10, 2 4 6 8 10 12 14 16 18 20
 */


public class ex30 {
	
	public static void main (String[] args) {
		
		 for (int i = 1; i <= 10; i++) {
			 
			 System.out.print(i + ", ");
			 
			 for (int j = 1; j <= i; j++) {
				 
				 if (i % 2 == 1) {
					
					 int num = 2 * j - 1;
					
					 System.out.print(num + " ");
					
				 } else {
					
					 int num = 2 * j;
					
					 System.out.print(num + " ");
					
				 }
			 }
			 
			 System.out.println();
			 
		 }
		
		//Hemily Araujo Ferraz
	}
}

