/*
 * ex20.java
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
 * 20) Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.
 */
import java.util.Scanner;

public class ex20 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int maximo = Integer.MIN_VALUE;
		 int minimo = Integer.MAX_VALUE;
		 
		 for (int i = 1; i <= 100; i++){
			 
			 System.out.print("Digite o " + (i) + "o valor: ");
			 int valor = sc.nextInt();
			 
			 maximo = Math.max(maximo, valor);
			 minimo = Math.min(minimo, valor);
			 
		 }
		 
		 System.out.println("Maior valor lido: " + maximo);
		 System.out.println("Menor valor lido: " + minimo);

		 sc.close();
		//Hemily De Araujo Ferraz
	}
}

