/*
 * AprovadoReprovado.java
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
 *  O programa deve testar o valor digitado pelo usuário e caso não esteja na faixa de 0 
	até 10 (inclusos), exibir a mensagem VALOR INVALIDO e finalizer o programa. Caso o valor 
	digitado seja válido, exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6 
	ou APROVADO caso contrário. 
 * 
 */
import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		double nota = scanner.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
		
			System.out.println ("NOTA: " + nota + "  --  " + (nota >= 6 ? "APROVADO(A)." : "REPROVADO(A)."));
		
		} else{
		
			System.out.println ("Valor INVALIDO!!");
		
		}
		
		scanner.close();
		//Hemily de Araujo Ferraz
	}
}

