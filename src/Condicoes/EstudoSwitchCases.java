package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCases: Gerar casos específicos
        * Objetivo: Pedir pro usuário escolher entre os ninjas
        * utilizando switchCase
         */

        Scanner scanner = new Scanner(System.in);

        //Mostrar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        //Reação ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno, a personagem feminina mais nice");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida! Tente de novo.");
        }

        scanner.close();
    }
}