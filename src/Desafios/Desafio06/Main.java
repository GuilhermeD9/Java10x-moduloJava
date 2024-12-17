package Desafios.Desafio06;

import java.util.LinkedList;

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

        // TODO: Remover Ninja no início
        System.out.println("Ninja removido = " + listaDeNinjas.removeFirst());

        System.out.println("------------- Mudanças --------------");

        // TODO: Listar os ninjas
        for (Ninja novaListaDeNinjas : listaDeNinjas) {
            System.out.println("Lista de Ninjas depois das mudanças = " + novaListaDeNinjas);
        }

        // TODO: Achar um ninja em um determinado index
        Ninja terceiroNinja = listaDeNinjas.get(3);
        System.out.println("Terceiro Ninja - " + terceiroNinja);


    }
}
