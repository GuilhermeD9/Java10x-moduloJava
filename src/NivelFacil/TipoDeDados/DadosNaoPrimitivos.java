package NivelFacil.TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        //Dados Não Primitivos: String, Array, Class, enum

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase(); // Sem Capslock
        System.out.println(aldeiaLowerCase);
    }
}
