/*
 * Crescente.java
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
 * 7) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrevê-los em ordem crescente.
 */

import java.util.Scanner;

public class Crescente {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
		
			int aux = num1;
			num1 = num2;
			num2 = aux;
		
		}
		
		System.out.println("Valores em ordem crescente: " + num1 + " e " + num2 + ".");
		
		//Hemily de Araujo Ferraz
	}
}


