/*
 * HoraExtra.java
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
 * 9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
	mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
	de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
	salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
	extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */
import java.util.Scanner;

public class HoraExtra {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o total de horas trabalhadas no mes: ");
		double hrsTrabalhadas = sc.nextDouble();
		
		System.out.println("Digite o valor do salario por hora: ");
		double valorHora = sc.nextDouble();
		
		double salarioNormal = valorHora * 160; // 160 é o valor das 40 hrs trabalhadas vezes 4 semanas do mês.
		
		if (hrsTrabalhadas > 160) {
		
			double hrsExtra = hrsTrabalhadas - 160;
			double valorExtra = (valorHora * 1.5) * hrsExtra;//multipliquei por 1.5 pq o valor da hora extra é 50% maior que o valor da hora normal.
			double salarioTotal = salarioNormal + valorExtra;
			
			System.out.println("O salario total e R$ " + salarioTotal + " reais."); 
		
		} else {
		
			System.out.println("O salario total e R$ " + salarioNormal + " reais.");
		
		}
		
		sc.close();
		//Hemily de Araujo Ferraz
	}
}

