

/*
 * VerificaValorProduto.java
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
 * Solicite ao usuário que digite os valores 
	para as variáveis precoProduto1 e precoProduto2. O programa deve testar o valor digitado pelo 
	usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), exibir a 
	mensagem VALOR INVALIDO e finalizer o programa. Caso os valores digitados sejam válidos, 
	exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor. 
	Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato 
	deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser 
	exibida
 * 
 */
	import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double precoProduto1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double precoProduto2 = scanner.nextDouble();
		
		if (precoProduto1 >= 1 && precoProduto2 >= 1 && precoProduto1 <= 1000 && precoProduto2 <= 1000){
		
			System.out.println(precoProduto1 < precoProduto2 ? "O produto 1 e o mais barato." : precoProduto1 > precoProduto2 ? "O produto 2 e o mais barato." : "Os preços dos dois produtos são iguais.");
		
		}else {
		
			System.out.println ("Valor INVALIDO!!");
		
		}
		
		scanner.close();
		//Hemily de Araujo Ferraz
	}
}

