package Desafios.Desafio05;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        valor = valor * 0.98;
        saldo += valor;
        System.out.println("Depósito realizado, seu saldo é de R$" + saldo);
    }
}
