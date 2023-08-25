/*
 * sem título.java
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
 * 42) Construa um programa para mostrar o fatorial dos números inteiros na 
faixa de 1 a 10.
 */


public class ex42 {
	
	public static void main (String[] args) {
		
		 int fat = 1;
		 
		 System.out.println("Fatorial do 1 ao 10: ");
		
		 for (int i = 1; i <= 10; i++) {
			
			 for (int j = i; j >= 1; j--) {
				
				 fat *= j;
				
			 }
			
			 System.out.println(i + "! = " + fat + " ");
			 
		 }
		 
		 //Hemily Araujo Ferraz
	}
}

