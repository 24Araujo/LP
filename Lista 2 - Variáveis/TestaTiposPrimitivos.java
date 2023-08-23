/*
 * TestaTiposPrimitivos.java
 * 
 * Copyright 2023 hemil <hemil@HEMILY>
 */


public class TestaTiposPrimitivos {
	
	public static void main (String[] args) {
		
		/*9 - Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que
		declare uma variável de cada um dos tipos primitivos da linguagem Java. Essas variáveis devem ser
		inicializadas com valores adequados. Por fim, exiba os valores dessas variáveis na saída padrão.
		 */
		
		byte n1 = 127;
		short n2 = 32767;
		int n3 = 2147483647;
		long n4 = 9223372036854775807L;
		float n5 = 3.14159265359f;
		double n6 = 2.718281828459045;
		boolean b7 = true;
		char c8 = 'A';
		
		
		System.out.println("Valor da variável byte: " + n1);
		System.out.println("Valor da variável short: " + n2);
		System.out.println("Valor da variável int: " + n3);
		System.out.println("Valor da variável long: " + n4);
		System.out.println("Valor da variável float: " + n5);
		System.out.println("Valor da variável double: " + n6);
		System.out.println("Valor da variável booleano: " + b7);
		System.out.println("Valor da variável caractere: " + c8);
		
	}
}

