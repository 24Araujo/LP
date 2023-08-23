/* 
 * ExibeIdade.java
 * 
 * Copyright 2023 hemil <hemil@HEMILY>
 */
import java.util.Scanner;

public class ExibeIdade {
	
	public static void main (String[] args) {
		
		/* 1 - Crie um arquivo chamado ExibeIdade.java. Implemente um programa em Java que declare uma variável do tipo int chamada idade. 
		 Essa variável deve ser inicializada com o valor da sua idade. Por fim, exiba o valor dessa variável na saída padrão.
		 */
		Scanner sc = new Scanner (System.in);
		
		int idade;
		idade = sc.nextInt();
		
		System.out.println ("A idade digita foi: " + idade);
	
		sc.close();
	}
}

