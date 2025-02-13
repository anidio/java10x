package org.example.NivelIntermediario.desafio5;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor){
        System.out.println("Deposito realizado com sucesso na conta poupança!");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da conta poupança: " );
    }
}
