package NivelIntermediario.POO.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        //Obj ninja não pode ser criado!

        //Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();

        //Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27);
        itachi.habilidadeEspecial();
    }
}
