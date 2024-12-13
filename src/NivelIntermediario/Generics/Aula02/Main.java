package NivelIntermediario.Generics.Aula02;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocacao do sapo"));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocacao da aguia"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Mamaru"));

        System.out.println("Itens da nossa bolsa Ninja: ");
        bolsaNinja.mostrarFerramenta();
    }
}
