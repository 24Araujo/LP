/*
 * ex21.java
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
 * 21) Escreva um programa em Java para ler uma quantidade e a seguir ler esta quantidade de números. 
Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média 
dos números lidos.
 */
import java.util.Scanner;

public class ex21 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite a quantidade de numeros a serem lidos?");
		 int quant = sc.nextInt();
		
		 int soma = 0;
		 int max = Integer.MIN_VALUE;
		
		 for (int i = 1; i <= quant; i++){
			
			 System.out.println("Digite o numero "+ i + " : ");
			 int num = sc.nextInt();
			
			 soma += num;
			 max = Math.max(max, num);
			
		 }
		 
		 double media = (double) soma / (double) quant;
		 
		 System.out.println("Maior numero fornecido: " + max);
		 System.out.printf("Media dos numeros fornecidos: %.2f", media);
		
		 //Hemily de Araujo Ferraz 
	 }
}

