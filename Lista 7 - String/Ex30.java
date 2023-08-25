/* 30)Da mesma forma que o exercício anterior, implemente um programa para criptografar e descriptografar utilizando a cifra ROT-13.
 */


import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    criptografarTexto();
                    break;
                case 2:
                    descriptografarTexto();
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void exibirMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        System.out.println("3 - Sair");
        System.out.print("Digite a opção desejada: ");
    }

    public static void criptografarTexto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto a ser criptografado: ");
        String texto = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char inicioAlfabeto = Character.isUpperCase(c) ? 'A' : 'a';
                char letraCriptografada = (char) ((c - inicioAlfabeto + 13) % 26 + inicioAlfabeto);
                resultado.append(letraCriptografada);
            } else {
                resultado.append(c);
            }
        }

        System.out.println("Texto criptografado: " + resultado.toString());
    }

    public static void descriptografarTexto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto criptografado: ");
        String textoCriptografado = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();

        for (char c : textoCriptografado.toCharArray()) {
            if (Character.isLetter(c)) {
                char inicioAlfabeto = Character.isUpperCase(c) ? 'A' : 'a';
                char letraDescriptografada = (char) ((c - inicioAlfabeto + 13) % 26 + inicioAlfabeto);
                resultado.append(letraDescriptografada);
            } else {
                resultado.append(c);
            }
        }

        System.out.println("Texto descriptografado: " + resultado.toString());
        
        //Hemily Araujo Ferraz
    }
}
