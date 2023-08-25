/*
 * Dezoito.java
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
 * 18) Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em 
Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o 
valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
 */
import java.util.Scanner;

public class Dezoito {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("O numero total de mercadorias: ");
		 int estoque = sc.nextInt();
		
		 System.out.println("O valor de cada mercadoria: ");
		 
		 double soma = 0.0;
		 
		 for (int i = 1; i <= estoque; i++){
			 
			 System.out.println("Produto " + i + ": " );
			 double valor = sc.nextDouble();
			 
			 soma += valor;
			 
		 }
		 
		 double media = soma / (double) estoque;
		 
		 System.out.println("O valor total em estoque: " + soma + " reais. \nA media do valor das mercadorias: " + media + " reais." );
		 
		 sc.close();
		//Hemily de Araujo Ferraz
	}
}

