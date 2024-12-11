package NivelIntermediario.Overload;

import NivelIntermediario.HerançaMultipla.SharinganInterface;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
    * Método:
    * Implementa da interface Sharingan
     */
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o sharingan");
    }
}
