/* 26)Escreva um programa em java para gerar aleatoriamente uma String com 100 letras minúsculas. Apresentar, caso haja: letras no alfabeto que não constam na 
 * sequencia,  maior sequencia de letras repetidas, maior sequencia de vogais e maior sequencia alfabética 
 */

import java.util.Random;

public class Ex26 {
    public static void main(String[] args) {
        String letras = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        // Gerar a string com 100 letras minúsculas
        for (int i = 0; i < 100; i++) {
            int index = random.nextInt(letras.length());
            sb.append(letras.charAt(index));
        }
        String stringGerada = sb.toString();

        System.out.println("String gerada: " + stringGerada);

        // Letras que não constam na sequência
        System.out.print("Letras não presentes: ");
        for (char c = 'a'; c <= 'z'; c++) {
            if (!stringGerada.contains(String.valueOf(c))) {
                System.out.print(c + " ");
            }
        }
        System.out.println();

        // Maior sequência de letras repetidas
        int maxRepeticoes = 0;
        char maxRepeticaoLetra = '\0';
        int repeticoes = 1;
        for (int i = 1; i < stringGerada.length(); i++) {
            if (stringGerada.charAt(i) == stringGerada.charAt(i - 1)) {
                repeticoes++;
                if (repeticoes > maxRepeticoes) {
                    maxRepeticoes = repeticoes;
                    maxRepeticaoLetra = stringGerada.charAt(i);
                }
            } else {
                repeticoes = 1;
            }
        }
        System.out.println("Maior sequência de letras repetidas: " + maxRepeticoes + " letras de '" + maxRepeticaoLetra + "'");

        // Maior sequência de vogais
        int maxVogais = 0;
        int vogais = 0;
        for (int i = 0; i < stringGerada.length(); i++) {
            char c = stringGerada.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
                if (vogais > maxVogais) {
                    maxVogais = vogais;
                }
            } else {
                vogais = 0;
            }
        }
        System.out.println("Maior sequência de vogais: " + maxVogais + " vogais");

        // Maior sequência alfabética
        int maxAlfabetica = 0;
        int alfabetica = 1;
        for (int i = 1; i < stringGerada.length(); i++) {
            if (stringGerada.charAt(i) - stringGerada.charAt(i - 1) == 1) {
                alfabetica++;
                if (alfabetica > maxAlfabetica) {
                    maxAlfabetica = alfabetica;
                }
            } else {
                alfabetica = 1;
            }
        }
        System.out.println("Maior sequência alfabética: " + maxAlfabetica + " letras");


	 //Hemily Araujo Ferraz
    }
}

