package Desafios.Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int ninjasCadastrados = 0;
        int NUMERO_MAXIMO = 2;
        Uchiha[] ninjas = new Uchiha[NUMERO_MAXIMO];


        while (opcao != 4) {
            System.out.println("\n===== Menu NinjaV2 =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Exibir info dos ninjas");
            System.out.println("3. Atualizar habilidades ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados >= NUMERO_MAXIMO) {
                        System.out.println("Impossível cadastrar, array cheio!");
                        break;
                    } else {
                        ninjas[ninjasCadastrados] = new Uchiha();
                        System.out.println("Bem-Vindo ao Cadastro Ninja!");
                        System.out.println("Nos forneça o nome do ninja: ");
                        ninjas[ninjasCadastrados].nome = scanner.nextLine();
                        System.out.println("Digite sua idade (em números): ");
                        ninjas[ninjasCadastrados].idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Digite sua missão: ");
                        ninjas[ninjasCadastrados].missao = scanner.nextLine();
                        System.out.println("Forneca o nível de dificuldade da missão: ");
                        ninjas[ninjasCadastrados].nivelDificuldade = scanner.nextLine();
                        System.out.println("Digite o status da sua missão: ");
                        ninjas[ninjasCadastrados].statusMissao = scanner.nextLine();
                        System.out.println("Se tiver, nos forneca sua habilidade especial: ");
                        ninjas[ninjasCadastrados].habilidadeEspecial = scanner.nextLine();
                        System.out.println("Ninja cadastrado!");
                        ninjasCadastrados++;
                        break;
                    }
                case 2:
                    if (ninjasCadastrados > 0) {
                        for (Uchiha ninja : ninjas) {
                            if (ninja == null) {
                                break;
                            } else {
                                ninja.mostrarInformacoes();
                            }
                        }
                    } else {
                        System.out.println("Nenhum Ninja cadastrado");
                    }
                    break;
                case 3:
                    System.out.println("Informe seu index Ninja: ");
                    int guardaInt = scanner.nextInt();
                    scanner.nextLine();
                    if (ninjas[guardaInt] != null) {
                        System.out.println("Informe suas novas habilidades ninja: ");
                        ninjas[guardaInt].habilidadeEspecial = scanner.nextLine();
                        System.out.println("Habilidade atualizada!");
                    } else {
                        System.out.println("Seu index ninja não existe!");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Por favor, digite uma opção válida!");
                    break;
            }
        }
        scanner.close();
    }
}
