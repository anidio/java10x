package org.example.NivelIntermediario;

public class Main {

    public static void main(String[] args) {
        //Criar ninja Naruto - Naruto é um OBJETO
        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 16;

        //Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;

        //Criar ninja Sakura Haruno - Sakura é um OBJETO
        Ninja Sakura = new Ninja();

        Sakura.nome = "Sasuke Uchiha";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;

        System.out.println(Sakura.aldeia);

    }
}
