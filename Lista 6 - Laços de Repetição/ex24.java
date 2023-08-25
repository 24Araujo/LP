/*
 * ex24.java
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
 * 24) Escreva um programa em Java que imprima a tabuada do 1 ao 10, para os números de 0 a 10.
 */

public class ex24 {
	
	public static void main(String[] args) {
		
		 for (int i = 0; i <= 10; i++) {
			 
			 System.out.println("Tabuada do " + i + ":");
			 
			 for (int j = 0; j <= 10; j++) {
				 
				 int resultado = i * j;
				 
				 System.out.println(i + " x " + j + " = " + resultado);
			 }
			 
			 System.out.println();
			 
		 }
		 
		 //Hemily de Araujo Ferraz
	}
}

