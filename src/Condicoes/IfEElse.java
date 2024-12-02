package Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        //IF E ELSE - CONDIÇÕES
        //Objetivo: Passar o ninja de nivel de acordo com o número de missões

        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 12;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}
