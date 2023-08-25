/*
 * InicioFim.java
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
 * 8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
	Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
	horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
	iniciar em um dia e terminar no dia seguinte.
 */
import java.util.Scanner;

public class InicioFim {
	
	public static void main (String[] args) {
		
		Scanner sc = new Sc-anner(System.in);
		
		System.out.println("Digite o horario de inicio do jogo: ");
		int Inicio = sc.nextInt();
		
		System.out.println("Digite o horario de fim do jogo: ");
		int Fim = sc.nextInt();
		
		int duracaoJogo;
		
		if (Inicio < Fim) {
		
			duracaoJogo = Fim - Inicio;
		
		} else {
		
			duracaoJogo = 24 - Inicio + Fim;
		}
		
		System.out.println("A duracao do jogo foi de " + duracaoJogo + " horas.");
		
		sc.close();
		//Hemily de Araujo Ferraz
	}
}

