/*
 * ex48.java
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
 * 48) Solicite ao usuário a quantidade de termos da sequência de números primos e 
imprima o resultado.
 */

import java.util.Scanner;

public class ex48 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de termos de numeros primos que deseja saber: ");
		int num = sc.nextInt();
		
		int count = 0; // contador de números primos encontrados
		int i = 2; // primeiro número primo é o 2
		
		while (count < num) {
			
			boolean primo = true;
			
			for (int j = 2; j <= i/2; j++) {
				
				if (i % j == 0) {
					
					primo = false;
					break;
					
				}
			}
			
			if (primo) {
				
				System.out.print(i + " ");
				
				count++;
			}
			
			i++;
		}
		
		sc.close
		//Hemily Araujo Ferraz
	}
}

