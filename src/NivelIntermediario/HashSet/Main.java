package NivelIntermediario.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.remove(0);

        System.out.println("ninjas = " + ninjas);

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        ninjasSet.add("Guilerme");
        ninjasSet.add("Gusta");
        ninjasSet.add("Guiler");
        ninjasSet.remove("Sakura Haruno");

        System.out.println(ninjasSet);
    }
}
