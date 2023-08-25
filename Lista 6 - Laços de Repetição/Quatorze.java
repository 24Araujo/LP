/*
 * Quatorze.java
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
 * 14) Escreva um programa em Java para ler 2 valores, calcular e escrever a soma dos inteiros existentes 
entre os 2 valores lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será 
sempre maior que o primeiro valor lido.
 */
import java.util.Scanner;

public class Quatorze {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		
		int soma = 0;
		
		for(int i = n1; i <= n2; i++){
			
			soma += i;
			
		}
		
		System.out.println("A soma dos dois numeros: " + n1 + " + " + n2 + " = " + soma);
		
		sc.close();
		//Hemily Araujo Ferraz
	}
}

