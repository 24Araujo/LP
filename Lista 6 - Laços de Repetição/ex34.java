/*
 * ex34.java
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
 * 34) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
	o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
	positivo imprimir a sequência de termos: 0, 1, 3, 6, 10, 15, ...
 */


import java.util.Scanner;

public class ex34 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int i = 1;
		 int cont = 0;
		 int soma = 0;
		 
		 System.out.print("Digite a quantidade de termos desejada: ");
		 int num = sc.nextInt();
		 
		 System.out.print("0, ");
		 
		 while (true){
			
			 if (num == 0){
				
				 System.out.print("Programa ENCERRADO!!");
				 break;
				
			 }
			
			 if (num < 0) {
				
				 System.out.print("Digite a quantidade de termos desejada: ");
				 num = sc.nextInt();
				
			 }
			
			 if (num > 0 ) {
				
				 soma += i;
				 
				 System.out.print(soma + ", ");
				 
				 i++; 
				 cont++;
				
				 if (cont == num){
					
					 break;
					
				 }
				 
			 }
			
		 }
		
		 sc.close();
		 
		 //Hemily de Araujo Ferraz
	}
}

