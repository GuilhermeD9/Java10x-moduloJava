package NivelIntermediario.Overload;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2®
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27 );
        itachi.habilidadeEspecial();
        itachi.metodoProvisorios();

        // obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45,900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        // Método comum
        madara.inteligenciaDeCombate();
        // Método sobrecarregado
        madara.inteligenciaDeCombate(90);





    }
}
