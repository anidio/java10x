package org.example.NivelIntermediario.desafio5;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da conta corrente: ");
    }

    public void depositar(double valor) {}
}
