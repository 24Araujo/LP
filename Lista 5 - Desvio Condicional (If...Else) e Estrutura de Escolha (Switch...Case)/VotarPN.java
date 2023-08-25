/*
 * VotarPN.java
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
 * 5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
	Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
	considerar o mês em que a pessoa nasceu).
 */
import java.util.Scanner;

public class VotarPN {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int AA = sc.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		int AN = sc.nextInt();
		
		int idade = AA - AN;
		
		System.out.println(idade >= 16 ? "Pode votar!" : "Não pode votar!");
		
		//Hemily de Araujo Ferraz
	}
}

