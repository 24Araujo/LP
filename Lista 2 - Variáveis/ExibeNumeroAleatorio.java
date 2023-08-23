/*
 * ExibeNumeroAleatorio.java
 * 
 * Copyright 2023 hemil <hemil@HEMILY>
 */
import java.util.Random;

public class ExibeNumeroAleatorio {
    public static void main(String[] args) {
		
		/* 2 - Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em Java que
		gere um número real aleatório entre 0 e 100. Esse número deve ser armazenado em uma variável do
		tipo double chamada numeroAleatorio. Por fim, exiba o valor dessa variável na saída padrão.
		*/
		
		Random gerador = new Random();
		
		int numeroAleatorio = gerador.nextInt((100 - 0)+1);
		
		
		System.out.println("Número aleatório gerado: " + numeroAleatorio);
		
		/* O método nextDouble() da classe Random retorna um número aleatório entre 0 (inclusive) e 1 (exclusive),
		ou seja, um número decimal entre 0 e 0,999... Ao multiplicar esse número por 100, obtemos um número 
		decimal entre 0 e 99,999... Em seguida, o valor é armazenado na variável numeroAleatorio, que é do tipo
		double, permitindo que o número gerado possa ser exibido com até 15 dígitos de precisão.
		*/
		
	}
}

