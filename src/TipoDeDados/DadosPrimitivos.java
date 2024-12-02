package TipoDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        int idade = 16; // Valor máximo: 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999L; //Valor máximo: 9,233,372,036,854,775,807

        System.out.println(idade); // Comando para mostrar a idade do usuário
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("Saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
    }
}
