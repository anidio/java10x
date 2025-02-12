package org.example.NivelIntermediario.herancaMultipla;

public class Main {
    public static void main(String[] args) {

        //Obj uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.sharinganAtivado();

        //Obj Hatake
        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.aldeia = "Aldeia da folha";
        Kakashi.idade = 29;
        Kakashi.sharinganAtivado();
        Kakashi.ninjaDeElite();
    }
}
