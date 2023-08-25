/*
 * ex40.java
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
 * 40) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 1, 2, 3, ..., 10, 10, 9, 8, ..., 1. Exemplo com entrada de 20 
termos.
 */

import java.util.Scanner;

public class ex40 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int i = 1;
		 int cont = 0;
		 int aux = i;
		
		 System.out.print("Digite a quantidade de termos desejada: ");
		 int num = sc.nextInt();
		 
		 
		 
		 while (true){
			 
			 if (num == 0){
				 
				 System.out.print("Programa ENCERRADO!!");
				 break;
				 
			 }
			 
			 if (num < 0){
				 
				 System.out.print("Digite a quantidade de termos desejada: ");
				 num = sc.nextInt();
				 
			 }
			 
			 if(num > 0){
				 
				 if (aux <= num/2){
					 
					 System.out.print(i + ", ");
				
					 i++;
					 cont++;
					 aux = i;
					 
				 }
				 
				 if (aux > num/2){
					 
					 aux++;
					 i--;
					 cont++;
					 System.out.print(i + (cont == num ? ".":", "));
					 
				 }
				
				 if (cont == num){
					 
					 break;
					 
				 }
				 
			 }
			 
			 
		 }
		
		//Hemily Araujo Ferraz
	}
}



