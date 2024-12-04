package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;

        //Criar o ninja Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da folha";

        //Aplicando métodos aos objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.AnosParaSeTornarHokage(60);
        System.out.println("Você tem: " + Sasuke.idade + " entao falta no minimo: " + quantoTempoFalta + " anos para vc se tornar");

        //Cria a Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;
    }
}
