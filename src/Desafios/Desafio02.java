package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        String[] ninja = new String[20];

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Bem-Vindo ao cadastro de ninja!");
                System.out.print("Digite o nome do ninja que você quer cadastrar: ");
                String inputString = scanner.nextLine();
                break;
            case 2:
                System.out.println("Lista de ninja cadastrados:");
                for (int i = 0; i < ninja.length; i++) {
                    System.out.println("Ninja " + i + " " + ninja[i]);
                }
                break;
            case 3:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida, escolha apenas uma opção disponível.");
        }

        scanner.close();
    }
}
