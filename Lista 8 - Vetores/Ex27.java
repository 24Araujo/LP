/*  27) Escreva um programa para ler um vetor AH de dimensão definida e com elementos fornecidos pelo usuário (>=25). Criar outro vetor AI (2 <= N <= 5)posições e gerar
 *  os elementos. Verificar se o vetor AI está contido no vetor AH. Caso não esteja contido dar mensagem de erro. Caso esteja, informar a posição inicial no vetor AH.
 * 
 * TEM NO YOUTUBEEEE https://www.youtube.com/watch?v=xHQMCItyhHY&list=PLD_6_3ezkeNCe3fZqz5m6RabeDZeMV7ku&index=35
 * 
 * 30 tb https://www.youtube.com/watch?v=6kQOKsmMTCc
 * 32 tb https://www.youtube.com/watch?v=Sgy9ew8QZvA&list=PLD_6_3ezkeNCe3fZqz5m6RabeDZeMV7ku&index=36
 * 
 * 
 */


import java.util.Scanner;

public class Ex27 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tamanhoAH = (int)(Math.random() * 100) + 25;
        int tamanhoAI = (int)(Math.random() * 4) + 2;
        
        int AH[] = new int[tamanhoAH];
        int AI[] = new int[tamanhoAI];
        
        int contador = 0;
        
        //Montar o array
        for (int i = 0; i < tamanhoAH; i++) {			
			AH[i] = (int)(Math.random() * 10);
		}
		
		for (int i = 0; i < tamanhoAI; i++) {			
			AI[i] = (int)(Math.random() * 10);
		}
		       
		//Exibir o array
		System.out.println("Vetor AH: ");
		for (int i = 0; i < tamanhoAH; i++) {			
			System.out.print(AH[i] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Vetor AI: ");
		for (int i = 0; i < tamanhoAI; i++) {			
			System.out.print(AI[i] + " ");
		}
		
		System.out.println("\n");
		//Teste
		for (int i = 0; i <= tamanhoAH - tamanhoAI; i++) {
			if (AH[i] == AI[0]) {
				contador = 1;
				
				for(int j = 1; j < tamanhoAI; j++) {
					if (AH[i+j] == AI[j]) {
						contador++;
					}
				}
				
				if (contador == tamanhoAI) {
					System.out.println("Vetor AI esta contido no vetor AH, a partir da posicao: " + i);
				}
			}
		}
		
		//Hemily Araujo Ferraz
    }
}




