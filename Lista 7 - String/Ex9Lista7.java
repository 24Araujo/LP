/*
Fazer um programa para contar quantos espaços em branco existem em uma frase
fornecida pelo usuário.
 */

import java.util.Scanner;

public class Ex9Lista7 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escreva uma frase qualquer: ");
		String frase = scanner.nextLine().toLowerCase();
		
		int contador = 0;
		
			for (int j = 0; j < frase.length(); j++){
				
				if (frase.charAt(j) == ' '){
				contador++;
				}
			}
			System.out.println("Existem " + contador + " espaco(s) na frase");
			
			
			//Hemily Araujo Ferraz
		
	}
}

