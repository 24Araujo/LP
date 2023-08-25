/* 27) Escreva um programa para solicitar ao usuário duas Strings. Se forem de mesmo tamanho,concatenar seus caracteres, caso contrário, informar ao usuário.
 */


import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.println("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        if (string1.length() == string2.length()) {
            String concatenacao = string1.concat(string2);
            System.out.println("As strings têm o mesmo tamanho. Concatenação: " + concatenacao);
        } else {
            System.out.println("As strings têm tamanhos diferentes.");
        }
        
        
        //Hemily Araujo Ferraz
    }
}


