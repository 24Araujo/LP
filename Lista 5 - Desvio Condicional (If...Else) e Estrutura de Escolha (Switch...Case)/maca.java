/*
 * sem título.java
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
 * 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
	forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
	compradas, calcule e escreva o custo total da compra..
 */
import java.util.Scanner;

public class maca {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de macas que deseja comprar: ");
		int quant = sc.nextInt();
		
		if (quant < 12){
		
			double valor = quant * 1.30;
			System.out.printf("O valor total da compra ficou em R$ %.2f reais.", valor);
		
		} else if (quant >= 12){
		
			double valor = quant * 1.00;
			System.out.printf("O valor total da compra ficou em R$ %.2f reais.", valor);
		
		}else{
		
			System.out.println("Valor INVALIDO!! \nTente novamente.");
		
		}
		
		sc.close();
		//Hemily de Araujo Ferraz
	}
}

