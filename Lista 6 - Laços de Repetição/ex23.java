/*
 * ex23.java
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
 * 23) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em 
Java para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população;
b) Média do número de filhos;
c) Maior salário dos habitantes;
d) Percentual de pessoas com salário menor que R$ 150,00.
Obs.: O final das leituras dos dados se dará com a entrada de um -  salário negativo.
 */
import java.util.Scanner;

public class ex23 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 double salario = 0;
		 int filhos = 0;
		 double somaS = 0;
		 int somaF = 0;
		 double max = Double.MIN_VALUE;
		 int contSm = 0;
		 int cont = 0;
		
		 System.out.println("Para FINALIZAR o programa digite um salario NEGATIVO!!");
		
		 while (true){
			
			 System.out.println("Digite seu salario: ");
			 salario = sc.nextDouble();
			 
			 if (salario < 0){
				 
				 break;
				 
			 }
			 
			 System.out.println("Digite a quantidade de filhos: ");
			 filhos = sc.nextInt();
			 
			 cont++;
			 somaS += salario;
			 somaF += filhos;
			 max = Math.max(max, salario);
			 
			 if (salario < 150.00){
				 
				 contSm++;
				 
			 }
			
		 }
		 
		 double mediaSalario = somaS / (double)cont;
		 double mediaFilhos = (double) somaF / (double) cont;
		 double percentual = (double) contSm / cont * 100;
		 
		 System.out.printf("Media de salario da populacao: %.2f\n", mediaSalario);
		 System.out.printf("Media do numero de filhos: %.2f\n", mediaFilhos);
		 System.out.printf("Maior salario dos habitantes: %.2f\n", max);
		 System.out.printf("Percentual de pessoas com salario menor que R$ 150,00: %.2f%%", percentual); 
		
		 sc.close();
		 //Hemily de Araujo Ferraz 
	}
}

