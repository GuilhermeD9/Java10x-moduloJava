package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {
        Hokages hashirama = new Hokages();
        hashirama.idade = 45;

        //Hokages tobirama = new Hokages("Tobirama Senju");
        //System.out.println(tobirama.nome);

        Hokages hiruzen = new Hokages();
        System.out.println(hiruzen.idade);

        Hokages minato = new Hokages("Minato Namikaze", 32, false, "Da folha", 85, 724, 1.75);
        System.out.println(minato.nome);

        Hokages tsunade = new Hokages();
    }
}
