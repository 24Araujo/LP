/*
Escreva um programa que calcule e escreva a quantidade de vezes que o
caractere a aparece em uma frase fornecida pelo usuário. Nota Importante: para a
contagem, o caractere pode ser maiúsculo ou minúsculo.
 */

import java.util.Scanner;

public class Ex5Lista7 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite uma frase qualquer: ");
		
		String frase = "" ;
		
		frase = scanner.nextLine(). toLowerCase();
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++){
			if (frase.charAt(i) == 'a'){
				contador++;
			}
		}
		System.out.println("Existem  " + contador + " letras A nessa frase");
		
		//Hemily Araujo Ferraz
	}
}

