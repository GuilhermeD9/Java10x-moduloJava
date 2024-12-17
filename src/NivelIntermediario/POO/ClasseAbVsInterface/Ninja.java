package NivelIntermediario.POO.ClasseAbVsInterface;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Métodos abstratos

    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai!");
    }
}
