package NivelAvancado.IntroducaoBigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        * O que é um algorítmo?
        * Algorítimo é tudo.
        */

        ArrayList<Ninjas> ninjas = new ArrayList<Ninjas>();
        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchiha", 17));
        ninjas.add(new Ninjas("Sakura Haruno", 17));

        // Algoritimo - Complexidade Constante - o¹
        System.out.println(ninjas.get(2));

        System.out.println("============================");

        // Algorítimo - Complexidade Linear - o(n)
        for (Ninjas ninja : ninjas) {
            System.out.println(ninja);
        }

        System.out.println("============================");

        // Complexidade Quadrática - o(n²)
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + " vs " + ninjas.get(j));
            }
        }
    }
}
