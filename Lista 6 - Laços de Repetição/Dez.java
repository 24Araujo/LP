/*
 * Dez.java
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
 * 10) Escreva um programa em Java para ler 10 valores, calcular e escrever a média aritmética desses valores 
   lidos.
 */
import java.util.Scanner;

public class Dez {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int soma = 0;
		 int cont = 0;
		 double media = 0;
		 
		 for (int i = 1; i <= 10; i++){
			
			 System.out.println("Digite o " + i + " valor: ");
			 int valor = sc.nextInt();
			 
			 cont++;
			 soma += valor; 
			
			 media = (double) soma / cont;
			 
		 }
		 
		 System.out.println("A media Aritmetica dos valores informados : " + media);
		 
		 //Hemily Araujo Ferraz
	}
}

