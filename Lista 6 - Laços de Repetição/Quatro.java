/*
 * Quatro.java
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
 * 4) Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) 
e N (inclusive). Considere que o N será sempre maior que ZERO
 */
import java.util.Scanner;

public class Quatro {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Digite um valor para N:");
		 int N = sc.nextInt();
		
		 if (N > 0){
			 
			 for (int i = 1; i <= N; i++){
				 
				 System.out.println(i);
				 
			} 
		 
		} else {
			
			System.out.println("ERRO, tente novamente");
			
		}
		
		sc.close();
		//Hemily Araujo Ferraz
	}
}

