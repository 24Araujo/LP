/*
 * Calcular.java
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
 * 11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
	que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
	e ‘/’. Calcule e mostre a operação efetuada e o seu resultado.
 */
import java.util.Scanner;

public class Calcular {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Digite a operação desejada (+, -, * ou /): ");
		String operArit = sc.next();
		
		double resultado = 0;
		
		switch (operArit.charAt(0)){
		
			case '+':
			
				resultado = num1 + num2;
				System.out.println("Soma: " + resultado);
				break;
			
			case '-': 
			
				resultado = num1 - num2;
				System.out.println("Subtracao: " + resultado);
				break;
			
			case '*':
			
				resultado = num1 * num2;
				System.out.println("Multiplicacao: " + resultado);
				break;
				
			case '/':
			
				if (num2 == 0){
				
					System.out.println("Nao e possível dividir por zero.");
				
				}else{
				
					resultado = num1 / num2;
					System.out.println("Divisao: " + resultado);
				
				}
				break;
			
			default: 
			
				System.out.println("Operação inválida.");
                break;
		}
		
		//Hemily de Araujo Ferraz
	}
}

