/* 29)Escreva um programa que apresente um menu com 3 opções: 1 – Criptografar; 2 – Descriptografar; e 3 – Sair. Caso o usuário digite uma opção inválida, uma mensagem de erro deve ser apresentada e novamente, solicitado uma estrada.Se selecionado a opção 1, criptografar, solicitar a entrada do texto plano e como saída, exibir o resultado do Zenit Polar e retornar ao menu principal.Se selecionado a opção 2, descriptografar, solicitar a mensagem cifrada com Zenit Polar e como saída, apresentar a mensagem original e retornar ao menu principal.Por último, se selecionado a opção 3, finalizar o programa.
 */


import java.util.Scanner;

public class Ex29 {
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
            char letra = Character.toLowerCase(c);

            switch (letra) {
                case 'z':
                    resultado.append('p');
                    break;
                case 'e':
                    resultado.append('o');
                    break;
                case 'n':
                    resultado.append('l');
                    break;
                case 'i':
                    resultado.append('a');
                    break;
                case 't':
                    resultado.append('r');
                    break;
                default:
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
            char letra = Character.toLowerCase(c);

            switch (letra) {
                case 'p':
                    resultado.append('z');
                    break;
                case 'o':
                    resultado.append('e');
                    break;
                case 'l':
                    resultado.append('n');
                    break;
                case 'a':
                    resultado.append('i');
                    break;
                case 'r':
                    resultado.append('t');
                    break;
                default:
                    resultado.append(c);
            }
        }

        System.out.println("Texto descriptografado: " + resultado.toString());
        
        //Hemily Araujo Ferraz
    }
}

