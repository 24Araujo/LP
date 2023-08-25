/*
 * ex19.java
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
 * 19) O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. 
Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS 
MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em 
estoque.
 */
import java.util.Scanner;

public class ex19 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("O valor de cada mercadoria: ");
		 
		 char yORn = 's';
		 double soma = 0.0;
		 int cont = 0;
		 
		  while (yORn != 'n') {
			
			 cont++;
			
			 System.out.println("Mercadoria " + cont + ": ");
			 double valor = sc.nextDouble();
			
			 soma += valor;
			
			 System.out.println("Mais mercadorias (S/N)?");
			 yORn = sc.next().toLowerCase().charAt(0);
		 }
		 
		 double media = soma / (double) cont;
		 
		 System.out.println("O valor total em estoque: " + soma + " reais.");
		 System.out.printf("A media do valor das mercadorias: %.2f reais.", media);
		 
		 sc.close();
		
		//Hemily de Araujo Ferraz
	}
}

