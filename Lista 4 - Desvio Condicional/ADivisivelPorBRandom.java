/*
 * ADivisivelPorBRandom.java
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
 * Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000 
	(inclusos) e b de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário. 

 */
import java.util.Random;

public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		
		Random gerador = new Random();
		
		int a = gerador.nextInt(1000)+ 1;
		int b = gerador.nextInt(20)+ 1;
		
		System.out.println (a);
		System.out.println (b);
		
		System.out.println (a % b == 0 ? "E divisivel." : "Nao e divisivel.");
		
		//Hemily de Araujo Ferraz
	}
}

