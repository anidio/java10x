package org.example.NivelIntermediario.desafio4;

public class NinjaAvançado extends Ninjas implements Ninja{

    String especialidade;

    public void mostrarEspecialidade(){
        System.out.println("Especialidade do Ninja Avançado: " + especialidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Eu sou um ninja avaçado com habilidade especial de dominar o conhecimeto de java");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ativando a habilidade especial de destruir abacaxi");
    }
}
