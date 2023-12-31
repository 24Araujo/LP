/*
 * MaiorMenorDez.java
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
 * Escreva um programa em Java para ler um valor e escrever a mensagem É MAIOR QUE
	10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!.
 */

import java.util.Scanner;

public class MaiorMenorDez {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		System.out.println(num > 10 ? "E maior que 10!." : "Nao e maior que 10!.");
		
		sc.close();
		//Hemily de Araujo Ferraz
	}
}

