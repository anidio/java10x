package org.example.NivelIntermediario.desafio1;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMIssao;
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(String habilidadeEspecial){
        System.out.println("Uchiha possui habilidade especial: " + habilidadeEspecial);
    }


    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Miss�o: " + missao);
        System.out.println("Habilidade especial: " + habilidadeEspecial);
        System.out.println("N�vel de Dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da Miss�o: " + statusMIssao);
    }
}
