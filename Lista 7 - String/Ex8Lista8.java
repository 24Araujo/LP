/*
Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem onde
consta o caractere e na frente a quantidade de ocorrências. Caso a quantidade de
ocorrências de um caractere seja zero, não apresentar o caractere na listagem. Não
diferenciar maiúsculo de minúsculo
 */

import java.util.Scanner;

public class Ex8Lista8 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escreva uma frase qualquer: ");
		String frase = scanner.nextLine().toLowerCase();
		
		int contador;
		
		for (char i = 'a'; i <= 'z'; i++){
			contador = 0;
			for (int j = 0; j < frase.length(); j++){
				
				if (i == frase.charAt(j)){
				contador++;
				}
			}
			if (contador != 0){
				System.out.println("O termo " + i + " tem " + contador + " letra(s).");
			}
		}
		
		//Hemily Araujo Ferraz
		
	}
}

