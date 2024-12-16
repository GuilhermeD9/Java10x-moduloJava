package NivelIntermediario.Stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Array
        // São estáticos e tem ref de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Lista
        // São dinâmicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Pilha
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Huyga");
        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha stack atual = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha stack atualizada com pop = " + ninjaStack);
        System.out.println("Minha stack com o proximo elemento do topo = " + ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos");
        System.out.println("Minha stack atual: " + ninjaStack);

        // Queue - Fila
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");
        // Mostrar a fila
        System.out.println("Ninjas na fila: " + ninjasQueue);
        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);
        // Como ver quem é o primeiro
        System.out.println("Ninjas no head: " + ninjasQueue.peek());
        // Adicionar a fila
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas na fila: " + ninjasQueue);
        // Não da pra deletar o tail
        // Esvaziar fila
        ninjasQueue.clear();
        System.out.println("Ninjas na fila: " + ninjasQueue);
        // Verificar se está vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia!");
        }
    }
}
