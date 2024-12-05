package Desafios.Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.tipoHabilidade = genjutsu;
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nInformações Ninja");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo de habilidade: " + tipoHabilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade " + habilidade + " executada!");
    }
}
