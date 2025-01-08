package NivelAvancado;

import java.util.ArrayList;
import java.util.LinkedList;

public class Aula01 {
    public static void main(String[] args) {
        long inicio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // O(n) - Linear
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // O(1) - constante
        int a = 100;
        int b = 200;
        int solucao = a + b;
        int multiplicacao = (a + b) * 500;

        // Arraylist
        inicio = System.nanoTime();
        arrayList.remove(250);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo Array List: " + tempo + "ns");

        // Linkedlist
        inicio = System.nanoTime();
        linkedList.remove(250);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo Linked List: " + tempo + "ns");
    }
}
