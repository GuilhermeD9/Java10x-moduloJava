package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Criar um método público personalizado

    /*
    * Métodos VOID não retornam valor
     */
    public void SharinganAtivado() {
        System.out.println("O sharigan Ativou!!");
    }

    /*
     * Métodos String obrigatoriamente retornam uma String
     */
    public String EuSouUmNinja() {
        return "Oi, Eu sou um ninja!";
    }

    /*
     * Métodos int obrigatoriamente retorna um int
     */
    public int AnosParaSeTornarHokage(int idadeMinima) {
        return idadeMinima - idade;
    }
}
