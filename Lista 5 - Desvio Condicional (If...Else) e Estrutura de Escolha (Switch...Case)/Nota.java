/*
 * Nota.java
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
 * 4) Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
	aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
	ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
	também a média calculada.
 */
import java.util.Scanner;

public class Nota {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double n2 = sc.nextDouble ();
		
		double media = 0;
		
		if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10) {
		
			media = (n1 + n2) / 2;
		
			if (media >= 6) {
		
			System.out.printf("Media: %.2f.\nAluno(a) APROVADO(A).", media);
		
			} else {
		
				System.out.printf("Media: %.2f.\nAluno(a) REPROVADO(A).", media);
		
			}
		
		} else {
		
			System.out.println("Valor invalido, notas permitidas somente de 0 a 10.");
		
		}
		
		//Hemily de AraujoFerraz
	}
}

