package org.example.NivelIntermediario.desafio4;

public class Main {

    public static void main(String[] args) {

        //ninja basico
        NinjaBasico Ninja1 = new NinjaBasico();
        Ninja1.nome = "Isaias Roberto";
        Ninja1.idade = 25;
        Ninja1.mostrarInformacoes();
        Ninja1.executarHabilidade();

        //ninnja Avançado
        NinjaAvancado Ninja2 = new NinjaAvancado();
        Ninja2.nome = "Fiasco Silva";
        Ninja2.idade = 30;
        Ninja2.mostrarInformacoes();
        Ninja2.executarHabilidade();
    }
}
