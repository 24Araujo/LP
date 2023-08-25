/*
Escreva um programa que calcule e escreva a quantidade de vezes que um
caractere fornecido pelo usuário aparece em uma frase, também, fornecida pelo
mesmo. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou
minúsculo.
 */

import java.util.Scanner;

public class Ex6Lista7 {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        System.out.print("Digite um caractere: ");
        String caractereInput = scanner.next();
        char caractere = caractereInput.charAt(0);
        
        int contador = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char caractereAtual = frase.charAt(i);
            
            if (caractereAtual == caractere || Character.toUpperCase(caractereAtual) == Character.toUpperCase(caractere)) {
                contador++;
            }
        }
        
        System.out.println("A quantidade de vezes que o caractere '" + caractere + "' aparece na frase é: " + contador);
        
        //Hemily Araujo Ferraz
    
		
	}
}

