/*
 * ex45.java
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
 * 45) Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima a 
sequência do final para o início.
 */
import java.util.Scanner;

public class ex45 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite a quantidade de termos fatorial desejada:");
		 int num = sc.nextInt();
		 
		 for (int i = num; i >= 1; i--) {
			
			 int fat = 1;
			
			 for (int j = i; j >= 1; j--) {
				
				 fat *= j;
				
			 }
			
			 System.out.println(i + "! = " + fat);
			 
		 }
		
		 sc.close();
		
		 //Hemily Araujo Ferraz
	}
}

