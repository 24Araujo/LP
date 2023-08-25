/*
 * ex47.java
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
 * 47)Imprima somente os números primos existentes na faixa de um 1 até 100.
 */


public class ex47 {
	
	public static void main (String[] args) {
		
		 boolean primo = true;
		 
		 for (int i = 1; i <= 100; i++){
			 
			 primo = true;
			 
			 for(int j = 2; j <= i/2; j++){
				 
				 if (i % j == 0 || i <= 1) {
					 
					 primo = false;
					 break;
				 }
				 
			 }
			 
			 if (primo){
				
				 System.out.println(i + " ");
				
			 }
			 
		 }
		 //Hemily Araujo Ferraz
	}
}

