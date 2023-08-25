/*
 * Dezessete.java
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
 * 17) Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a 
média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. 
Ao final da execução a mensagem 'NOVO CALCULO (S/N)?' deve ser apresentada. Se for respondido 'S' deve 
retornar e executar um novo cálculo, caso contrário deverá encerrar o programa.
 */
import java.util.Scanner;

public class Dezessete {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		 char SimNao = 'S';
		 
		 while (Character.toLowerCase(SimNao) == 's') {
			
			 System.out.println("Digite a primeira nota: ");
			 double n1 = sc.nextDouble();
		
			 System.out.println("Digite a segunda nota: ");
			 double n2 = sc.nextDouble();
		
			 if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10){
			
				 double media = (n1 + n2) / 2;
				 System.out.println("Media: " + media);
			
			 } else{
			
				 System.out.println("Valores inválidos. \n As notas devem estar entre 0 e 10.");
			
			 }
			 
			 System.out.println("NOVO CALCULO (S/N)?");
			 SimNao = sc.next().charAt(0);
			
		}
		 sc.close();
		 //Hemily De Araujo Ferraz
	}
}

