package Desafios.Desafio06;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Feito pelo fiasco
        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        // TODO: Adicionar os ninjas na lista
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Folha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        System.out.println("-------------- Lista de ninjas --------------");

        // Complexidade o(n)
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }

        // TODO: Adicionar Ninja no início da lista
        listaDeNinjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));

        System.out.println("------------- Removendo ninja --------------");

        // TODO: Remover Ninja no início
        System.out.println("Ninja removido = " + listaDeNinjas.removeFirst());

        System.out.println("------------- Mudanças --------------");

        // TODO: Listar os ninjas
        for (Ninja novaListaDeNinjas : listaDeNinjas) {
            System.out.println("Lista de Ninjas depois das mudanças = " + novaListaDeNinjas);
        }

        System.out.println("------------- Ninja no index --------------");

        // TODO: Achar um ninja em um determinado index
        Ninja terceiroNinja = listaDeNinjas.get(3);
        System.out.println("Terceiro Ninja - " + terceiroNinja);

        System.out.println("\n------------- Desafio Extra --------------");

        // TODO: DESAFIO ADICIONAL: Implementar ordem por diferentes critérios
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a comparação");
        System.out.println("1 - Ordenar por nome");
        System.out.println("2 - Ordenar por idade");
        System.out.println("3 - Ordenar por vila");
        System.out.print("Sua opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1 :
                Collections.sort(listaDeNinjas, Comparator.comparing(Ninja::getNome));
                System.out.println("Ordenado por nome: " + listaDeNinjas);
                break;
            case 2 :
                Collections.sort(listaDeNinjas, Comparator.comparing(Ninja::getIdade));
                System.out.println("Ordenado por idade: " + listaDeNinjas);
                break;
            case 3 :
                Collections.sort(listaDeNinjas, Comparator.comparing(Ninja::getVila));
                System.out.println("Ordenado por vila: " + listaDeNinjas);
                break;
            default:
                System.out.println("Suas opções são de 1 a 3! Corrija sua digitação.");
        }

        // TODO: Buscar ninja com base no nome
        for (Ninja ninja : listaDeNinjas) {
            if (ninja.getNome().equals("Gaara")) {
                System.out.println(ninja);
            }
        }
    }
}
