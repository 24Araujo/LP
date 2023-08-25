/*
 * SalarioVendas.java
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
 * 10) Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
	vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
	vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
	salário total.
 */
import java.util.Scanner;

public class SalarioVendas {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salario fixo: ");
		double salarioFixo = sc.nextDouble();
		
		System.out.println("Digite o valor das vendas efetuadas: ");
		double valorVendas = sc.nextDouble();
		
		if (valorVendas <= 1500.00){
		
			double tresPorc = valorVendas * 0.03;
			double salarioTotal = salarioFixo + tresPorc;
			
			System.out.printf("Seu salario total: R$ %.2f reais.", salarioTotal);
		
		} else if (valorVendas > 1500.00){
		
			double cincoPorc = valorVendas * 0.05;
			double salarioTotal = salarioFixo + cincoPorc;
			
			System.out.printf("Seu salario total: R$ %.2f reais.", salarioTotal);
		
		}
		
		sc.close();
		//Hemily de Araujo Ferraz
	}
}

