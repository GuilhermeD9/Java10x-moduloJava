package Desafios.Desafio05;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        valor = valor * 0.98;
        saldo += valor;
        System.out.println("Depósito realizado, seu saldo é de R$" + saldo);
    }
}
