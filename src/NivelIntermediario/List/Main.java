package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array
        // São estáticos, não alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printando array: " + ninjasArray[0]);

        // Listas
        // Listas não são estáticas, elas podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        // Adicionar na Lista
        ninjasList.add("Kakashi Hatake");

        System.out.println("ninjasList = " + ninjasList);

        // Remover na Lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjasList = " + ninjasList);

        // Trocar elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("ninjasList = " + ninjasList);

        // Ver o tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size() + " elementos");
    }
}
