/*
 * ex46.java
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
 * 46) Solicite ao usuário um número e verifique se este número é primo ou não.
 */
import java.util.Scanner;

public class ex46 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Digite um numero: ");
		 int num = sc.nextInt();
		 
		 boolean primo = true;
		 
		 if (num <= 1){
			 
			 primo = false;
			 
		 } else {
			 
			 for(int i = 2; i <= num/2; i++){
				 
				 if (num % i == 0){
					 
					 primo = false;
					 break;
					 
				 }
				 
			 } 
			 
		 }
		 
		 if (primo){
			 
			 System.out.println(num + " eh um numero primo.");
			
 		 } else {
			 
			 System.out.println(num + " nao eh um numero primo.");
			 
		 }
 		
 		 sc.close();
		 //Hemily Araujo Ferraz
	}
}

