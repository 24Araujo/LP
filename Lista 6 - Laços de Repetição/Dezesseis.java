/*
 * Dezesseis.java
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
 * 16) Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15 
(inclusive) e 100 (inclusive)
 */


public class Dezesseis {
	
	public static void main (String[] args) {
		
		int n1 = 15;
		int n2 = 100;
		int cont = 0;
		int soma = 0;
		
		while (n1 <= n2){
			
			soma += n1;
			n1++;
			cont++;
		}
		
		System.out.println("A media aritmetica dos numeros entre 15 e 100 e: " + soma / cont );
		
		//Hemily De Araujo Ferraz
	}
}

