package Desafios;

public class Desafio01 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 14;
        String nomeMissaoNinja1 = "Caçar Urubus";
        char nivelMissaoNinja1 = 'D';
        String statusNinja1 = "Não Concluído";

        if (idadeNinja1 < 15) {
            if (nivelMissaoNinja1 == 'C' || nivelMissaoNinja1 == 'D') {
                statusNinja1 = "Concluída";
            } else {
                statusNinja1 = "Não concluída, por falta de idade";
            }
        }

        System.out.println("Informações do ninja: " + nomeNinja1);
        System.out.println("Sua idade é: " + idadeNinja1);
        System.out.println("Sua missão foi: " + nomeMissaoNinja1);
        System.out.println("Com dificuldade nível: " + nivelMissaoNinja1);
        System.out.println("Status da missão: " + statusNinja1);
        System.out.println();

        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 18;
        String nomeMissaoNinja2 = "Assar uma galinha no soco";
        char nivelMissaoNinja2 = 'B';
        String statusNinja2 = "Em andamento";

        if (idadeNinja2 < 15) {
            if (nivelMissaoNinja1 == 'C' || nivelMissaoNinja1 == 'D') {
                statusNinja2 = "Concluída";
            } else {
                statusNinja2 = "Não concluída, por falta de idade";
            }
        } else {
            statusNinja2 = "Concluída, você tem a idade necessária";
        }

        System.out.println("Informações do ninja: " + nomeNinja2);
        System.out.println("Sua idade é: " + idadeNinja2);
        System.out.println("Sua missão foi: " + nomeMissaoNinja2);
        System.out.println("Com dificuldade nível: " + nivelMissaoNinja2);
        System.out.println("Status da missão: " + statusNinja2);
        System.out.println();

        String nomeNinja3 = "Sakura";
        int idadeNinja3 = 23;
        String nomeMissaoNinja3 = "Voltar para o regime CLT";
        char nivelMissaoNinja3 = 'A';
        String statusNinja3 = "Não Concluído";

        if (idadeNinja3 < 15) {
            if (nivelMissaoNinja1 == 'C' || nivelMissaoNinja1 == 'D') {
                statusNinja3 = "Concluída";
            } else {
                statusNinja3 = "Não concluída, por falta de idade";
            }
        } else {
            statusNinja3 = "Concluída, você tem a idade necessária";
        }

        System.out.println("Informações do ninja: " + nomeNinja3);
        System.out.println("Sua idade é: " + idadeNinja3);
        System.out.println("Sua missão foi: " + nomeMissaoNinja3);
        System.out.println("Com dificuldade nível: " + nivelMissaoNinja3);
        System.out.println("Status da missão: " + statusNinja3);
    }
}
