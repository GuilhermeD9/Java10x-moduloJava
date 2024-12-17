package NivelIntermediario.Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Classes
        String[] array = new String[3];
        array[0] = "Sasuke";
        System.out.println(array); // Não tem o to string implementado
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList.add("Naruto");
        System.out.println(linkedList); // To string implementado nativo
    }
}
