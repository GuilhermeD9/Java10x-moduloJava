package Desafios.Desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 18, "Clone");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado kakashi = new NinjaAvancado("Kakashi Mozomo", 20, "Jutso das trevas", "Facas");
        kakashi.mostrarInformacoes();
        kakashi.executarHabilidade();
    }
}
