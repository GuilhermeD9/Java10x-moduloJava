package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NUMERO_MAXIMO = 10; // Quantidade que pode ser cadastrada
        int ninjasCadastrados = 0;
        int opcao = 0;
        String[] ninja = new String[NUMERO_MAXIMO];

        while (opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAXIMO) {
                        System.out.println("Bem-Vindo ao cadastro de ninja!");
                        System.out.print("Digite o nome do ninja que você quer cadastrar: ");
                        String inputString = scanner.nextLine();
                        ninja[ninjasCadastrados] = inputString;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado!");
                    } else {
                        System.out.println("A lista de ninjas está cheia!");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("Lista de ninja cadastrados:");
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println("Ninja " + i + ": " + ninja[i]);
                        }
                        break;
                    }
                    break;
                case 3:
                    System.out.print("Digite a posição do ninja a ser deletada: ");
                    int posicaoNinja = scanner.nextInt();
                    if (posicaoNinja < ninja.length) {
                        ninja[posicaoNinja] = null;
                        System.out.println("Ninja deletado");
                        ninjasCadastrados--;
                    } else {
                        System.out.println("Não consegui deletar o ninja");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, escolha apenas uma opção disponível.");
                    break;
            }
        }
        scanner.close();
    }
}
