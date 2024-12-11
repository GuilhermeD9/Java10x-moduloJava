package Desafios.Desafio05;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(10, TipoConta.CORRENTE);
        cc.consultarSaldo();
        cc.depositar(15);

        ContaPoupanca cp = new ContaPoupanca(5, TipoConta.POUPANCA);
        cp.consultarSaldo();
        cp.depositar(100);
    }
}
