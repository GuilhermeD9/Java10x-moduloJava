package NivelBasico;

public class Array {
    public static void main(String[] args) {
        // String inicializam como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[5]);
        System.out.println(ninja);

        // Redeclarar o Array
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[2]);

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        // Int inicializam como 0
        int[] idade = new int[2];
        System.out.println(idade[1]);
        System.out.println(idade);

        // Boolean inicializam como false
        boolean[] trueOrFalse = new boolean[1];
        System.out.println(trueOrFalse[0]);
        System.out.println(trueOrFalse);

        // Doubles inicializam como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);
        System.out.println(flutuante);

        String nomeDoNinja1 = "Naruto Uzumaki";
        nomeDoNinja1 = "Boruto Uzumaki";
        System.out.println(nomeDoNinja1);
    }
}
