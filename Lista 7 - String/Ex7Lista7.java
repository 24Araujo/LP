/*
Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem, onde
consta o caractere e na frente a quantidade de ocorrências. Caso não tenha ocorrência
apresentar o valor zero. Não diferenciar maiúsculo de minúsculo.
 */

import java.util.Scanner;

public class Ex7Lista7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escreva uma frase qualquer: ");
		String frase = scanner.nextLine().toLowerCase();
		
		int contador = 0;
		for(char i = 'a'; i <= 'z'; i++){
			contador = 0;
			for(int j = 0; j < frase.length(); j++){
				
				if (frase.charAt(j) == i){
					contador++;
				}
			}
			System.out.println("O termo e " + i + " = " + contador);
		}
		
		//Hemily Araujo Ferraz
		
	}
}

