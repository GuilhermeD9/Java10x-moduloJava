package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternários: Maneiras de reduzir o código
        * variavel - (condicao) ? valorSeVerdadeiro : valorSeFalso;
         */

        short numeroDeMissoes = 1;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);

    }
}
