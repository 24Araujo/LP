/*
 * ex22.java
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
 * 22) Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
	- o maior preço lido;
	- a média aritmética dos preços dos produtos.
 */
import java.util.Scanner;

public class ex22 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 
		 double max = Double.MIN_VALUE;
		 double soma = 0;
		 
		 for (int i = 1; i <= 15; i++){
			 
			 System.out.println("Digite o codigo do produto "+ i + " : ");
			 int cod = sc.nextInt();
			 
			 System.out.println("Digite o valor do produto " + i + " : ");
			 double valor = sc.nextInt();
			 
			 soma += valor;
			 max = Math.max(max, valor);
			 
		 }
		 
		 double media = soma / 15.0;
		 
		 System.out.println("Maior valor lido: " + max);
		 System.out.printf("Media aritmetica do valor fornecidos: %.2f", media);
		
		 sc.close();
		 //Hemily De Araujo Ferraz
	}
}

