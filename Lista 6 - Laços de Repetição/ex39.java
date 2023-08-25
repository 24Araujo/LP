/*
 * ex39.java
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
 * 39) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50 
termos. Apresentar a soma desta sequência no final.
 */


import java.util.Scanner;

public class ex39 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 double i = 1;
		 int cont = 0;
		 double soma = 0;
		
		 System.out.print("Digite a quantidade de termos desejada: ");
		 int num = sc.nextInt();
		 int aux = num;
		 
		 while (true){
			 
			 if (num == 0){
				 
				 System.out.print("Programa ENCERRADO!!");
				 break;
				 
			 }
			 
			 if (num < 0){
				 
				 System.out.print("Digite a quantidade de termos desejada: ");
				 num = sc.nextInt();
				 aux = num;
			 }
			 
			 if(num > 0){
				 if(num==1){
					System.out.println( (int)i + "/" + num);
					soma += (i/num);
					System.out.printf("soma = %.2f",soma);
					break;
				 }
				 System.out.print( (int)i + "/" + num + " + ");
				 
				 soma += (i/num);
				 num--;
				 i++;
			 }
			 
			 
		 }
		
		//Hemily Araujo Ferraz
	}
}
