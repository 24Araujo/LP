/* 28)Escreva um programa que leia uma String e dobre ela ao meio concatenado seus caracteres.
 */


import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String input = scanner.nextLine();

        int tamanho = input.length();
        int meio = tamanho / 2;

        String primeiraMetade = input.substring(0, meio);
        String dobrada = input + primeiraMetade;

        System.out.println("String dobrada: " + dobrada);
        
        
        //Hemily Araujo Ferraz
    }
}


