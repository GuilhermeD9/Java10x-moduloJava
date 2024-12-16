package NivelIntermediario.RevisaoEstruturaDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- ARRAY -------------");
        String[] nomeNinjaArray = new String[4];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";
        System.out.println("Nome dos ninjas array = " + nomeNinjaArray);
        System.out.println("Nome dos ninjas array = " + nomeNinjaArray[3]);

        // Lista é um pouco mais lenta em comparação com o Array
        System.out.println("--------------- LISTA -------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Itachi Uchiha");
        nomeNinjaList.add("Madara Uchiha");
        System.out.println(nomeNinjaList);

        System.out.println("--------------- STACK -------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha = " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha = " + nomeNinjaStack.pop());
        nomeNinjaStack.push("Kakashi");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Ninja que está no topo: " + nomeNinjaStack.peek());
    }
}
