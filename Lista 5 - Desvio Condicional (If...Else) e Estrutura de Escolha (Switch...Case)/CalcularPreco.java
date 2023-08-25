/*
 * CalcularPreco.java
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
 * 
 */
import java.util.Scanner;

public class CalcularPreco {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double precoProduto, valorFrete, valorFinal;
		
		int codigoOrigem;
		
		System.out.print("Digite o preço do produto: ");
		precoProduto = sc.nextDouble();
		
		System.out.print("Digite o código de origem (1 a 20): ");
		codigoOrigem = sc.nextInt();
		
		if (codigoOrigem == 1) {
		
			System.out.println("Região de procedência: Norte");
			valorFrete = precoProduto * 0.1;
		
		} else if (codigoOrigem == 2 || codigoOrigem == 5 || codigoOrigem == 9) {
		
			System.out.println("Região de procedência: Sul");
			valorFrete = precoProduto * 0.03;
		
		} else if (codigoOrigem == 3 || (codigoOrigem >= 10 && codigoOrigem <= 15)) {
		
			System.out.println("Região de procedência: Leste");
			valorFrete = precoProduto * 0.012;
		
		} else if (codigoOrigem == 7 || codigoOrigem == 20) {
		
			System.out.println("Região de procedência: Oeste");
			valorFrete = precoProduto * 0.073;
		
		} else {
		
			System.out.println("Procedência: Importado");
			valorFrete = precoProduto * 0.222;
		}
		
		valorFinal = precoProduto + valorFrete;
		System.out.printf("Preço do produto: R$%.2f\n", precoProduto);
		System.out.printf("Valor do frete: R$%.2f\n", valorFrete);
		System.out.printf("Valor final: R$%.2f\n", valorFinal);
		
		sc.close();
		//Hemily de Araujo Ferraz
	}
}

