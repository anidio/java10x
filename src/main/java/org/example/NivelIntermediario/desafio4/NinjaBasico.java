package org.example.NivelIntermediario.desafio4;

public class NinjaBasico extends Ninjas implements Ninja {

    @Override
    public void executarHabilidade() {
        System.out.println("Ninja básico executa habilidade de beber cerveja com o fiasco e ser ruim e java!");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Eu sou um ninja básico sem habilidade especial");
    }
}
