package org.example.NivelIntermediario.herancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    @Override
    public void sharinganAtivado() {
        System.out.println("Meu nome é " + nome + ", o Sharingan ativou, eu sou um Hatake!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Meu nome é " + nome + ", e eu sou um ninja de elite da ANBU!");
    }
}
