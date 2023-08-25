/*
 * ADivisivelPorB.java
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
 * Implemente um programa em Java que guarde 
	dois valores numéricos inteiros: a e b, informados pelo usuário, sendo a de 0 até 1000 (inclusos) e b 
	de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos. 
	Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário. 
	Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é 
	divisível, caso contrário.
 */

import java.util.Scanner;

public class  ADivisivelPorB {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int a = leia.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int b = leia.nextInt();
		
		if (a >= 0 && a <= 1000 && b >= 0 && b <= 20){
		
			if (b > a){
			
				System.out.println("O segundo valor e maior que o primeiro valor.");
			
			}
		
			System.out.println(a % b == 0 ? "E divisivel." : "Nao e divisivel.");
		
		
		} else {
		
			System.out.println ("Valor invalido!! \nTente novamente.");
		
		}
		
		
		
		
		
		//Hemily de Araujo Ferraz
	}
}

