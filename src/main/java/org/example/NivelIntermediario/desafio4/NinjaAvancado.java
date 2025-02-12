package org.example.NivelIntermediario.desafio4;

public class NinjaAvancado extends Ninjas implements Ninja{

    String especialidade;

    public void mostrarEspecialidade(){
        System.out.println("Especialidade do Ninja Avan�ado: " + especialidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Eu sou um ninja ava�ado com habilidade especial de dominar o conhecimeto de java");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ativando a habilidade especial de destruir abacaxi");
    }
}
