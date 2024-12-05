package NivelIntermediario.ClasseAbVsInterface;

public interface NinjaInterface {
    //Tudo é automaticamente FINAL
    String nome = "Naruto Uzumaki";
    String aldeia = "Aldeia da folha";
    int idade = 17;

    //Ele é obrigatoriamente abstrato
    public void tacarUmShuriken();
}
