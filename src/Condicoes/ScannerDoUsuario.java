package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner = É uma forma de trazer o usuário para a aplicação
        * O usuário vai criar o ninja, e vamos validar os dados
         */

        Scanner scannerzinho = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = scannerzinho.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Receber a idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = scannerzinho.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia");
        } else {
            System.out.println("Esse ninja ainda é muito novo, precisa de mais treino antes de sair da vila");
        }

        //Sempre fechar
        scannerzinho.close();
    }
}
