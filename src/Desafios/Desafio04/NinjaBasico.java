package Desafios.Desafio04;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;
    TipoHabilidade taijutsu = TipoHabilidade.TAIJUTSU;
    TipoHabilidade ninjutsu = TipoHabilidade.NINJUTSU;
    TipoHabilidade genjutsu = TipoHabilidade.GENJUTSU;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = ninjutsu;
    }

    public NinjaBasico() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nInformações Ninja");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo de habilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade " + habilidade + " executada!");
    }
}
