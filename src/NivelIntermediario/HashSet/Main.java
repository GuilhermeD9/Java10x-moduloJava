package NivelIntermediario.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Tsunade");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");

        System.out.println("ninjas = " + ninjas);

        /*
        * O HashSet a gente usa quando não quer duplicação
        * O TreeSet a gente usa quando não quer duplicação mas quer uma ordem lógica
        * (Alfabética, numérica, etc)
        * O LinkedHashSet faz a mesma coisa que um HashSet, mas na ordem de implementação
        */
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        ninjasSet.remove("Sakura Haruno");
        System.out.println(ninjasSet);

        Set<String> ninjasTreeSet = new TreeSet<>();
        ninjasTreeSet.addAll(ninjas);
        System.out.println(ninjasTreeSet);

        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(ninjas);
        System.out.println(ninjasLinkedHashSet);
    }
}
