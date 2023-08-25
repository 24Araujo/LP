/*
 * Doze.java
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
 * 12) Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10 
números lidos.
 */
import java.util.Scanner;

public class Doze {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int soma = 0;
		
		for (int i = 1; i <= 10; i++){
			
			 System.out.println("Digite o " + i + " valor: ");
			 int valor = sc.nextInt();
			
			 soma += valor;
			 
			 
		}
		
		System.out.println("A soma dos 10 numeros fornecidos: " + soma);
		
		
		//Hemily Araujo Ferraz
	}
}

