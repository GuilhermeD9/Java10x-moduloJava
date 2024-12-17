package Desafios.Desafio06;

public class Ninja {
    private String nome;
    private int idade;
    private String vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public Ninja() {
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getVila() {
        return vila;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", idade = " + idade + ", vila = " + vila;
    }
}
