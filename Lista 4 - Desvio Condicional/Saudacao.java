/*
 * Saudacao.java
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
 * Implemente um programa em Java que declare uma 
	variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a 
	mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11], 
	Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23]. 
	Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre 
	fazendo todas as validações necessárias.
 */

import java.util.Scanner;
import java.util.Random;

public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int hora = 0;
		
		System.out.println("Escolha a opcao que deseja: \n1 - Informar o horario manualmente. \n2 - Gerar um horario aleatorio.");
		int opcao = sc.nextInt();
		
		if (opcao == 1){
		
			System.out.println("Digite o Horario: ");
			hora = sc.nextInt();
			
			if (hora >= 0 && hora <= 6){ //[0, 6] -- Zzzzz
			
				System.out.println("Zzzzz");
			
			}else if (hora >= 7 && hora <= 11) { //[7, 11] -- Bom dia
			
				System.out.println("Bom dia");
			
			}else if (hora >= 12 && hora <= 17) { //[12, 17] -- Boa tarde
			
				System.out.println("Boa tarde");
			
			}else { //[18, 23] -- Boa noite
			
				System.out.println("Boa noite");
			
			}
		
		} else if (opcao == 2){
		
			hora = aleatorio.nextInt(23)+ 1;
			System.out.println("O horario aleatorio gerado foi " + hora + ".");
			
			if (hora >= 0 && hora <= 6){ //[0, 6] -- Zzzzz
			
				System.out.println("Zzzzz");
			
			}else if (hora >= 7 && hora <= 11) { //[7, 11] -- Bom dia
			
				System.out.println("Bom dia");
			
			}else if (hora >= 12 && hora <= 17) { //[12, 17] -- Boa tarde
			
				System.out.println("Boa tarde");
			
			}else { //[18, 23] -- Boa noite
			
				System.out.println("Boa noite");
			
			}
		
		} else {
		
			System.out.println("Opcao INVALIDA!! \nTente novamente.");
		
		}
		
		
		
		sc.close();
		//Hemily de Araujo Ferraz
	}
}

