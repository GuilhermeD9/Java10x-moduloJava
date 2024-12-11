package NivelIntermediario.Overload;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16);
        System.out.println(naruto);
        System.out.println(naruto.altura);
        naruto.tacarKunai();

        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Aleatorio";

        System.out.println("--------------- Sasuke Uchiha ---------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18);
        System.out.println(sasuke);
    }
}
