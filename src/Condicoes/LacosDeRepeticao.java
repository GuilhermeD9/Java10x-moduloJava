package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição: Vão repetir infinitamente ou até o fim do parâmetro.
        * while - for
         */

        // WHILE (condicao) {Tudo aqui vai acontecer}
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
            numeroDeClones++;
        }

        // FOR
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto está se clonando e já se clonou " + i + " vezes!");
        }
    }
}
