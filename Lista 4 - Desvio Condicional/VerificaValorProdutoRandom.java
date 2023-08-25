/*
 * VerificaValorProdutoRandom.java
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
 * Gere dois números aleatórios 
	entre 1 e 1000 (inclusos), atribuindo as variáveis precoProduto1 e precoProduto2. O programa deve 
	exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor. 
	Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato 
	deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser 
	exibida. 
 */
	import java.util.Random;

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
	
	Random gerador = new Random();
	
	double precoProduto1 = gerador.nextDouble(1000)+1;
	double precoProduto2 = gerador.nextDouble(1000)+1;
	
	System.out.println("Valor do produto 1: " + precoProduto1);
	System.out.println("Valor do produto 2: " + precoProduto2);
	
	System.out.println( precoProduto1 < precoProduto2 ?  "O produto 1 e o mais barato." : precoProduto1 > precoProduto2 ? "O produto 2 e o mais barato." : "Os preços dos dois produtos são iguais.");
	
		//Hemily de Araujo Ferraz
	}
}

