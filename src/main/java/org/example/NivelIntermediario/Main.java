package org.example.NivelIntermediario;

public class Main {

    public static void main(String[] args) {
        //Criar ninja Naruto - Naruto é um OBJETO
        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 16;
        Naruto.ModoSabioAtivado();

        //Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        //Aplicando métodos aos meus objetos
//        Sasuke.SharinganAtivado();
//        String chamandoMetodo = Sasuke.euSouUmNinja();
//        System.out.println(chamandoMetodo);

        //Criar ninja Sakura Haruno - Sakura é um OBJETO
        Haruno Sakura = new Haruno();

        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();


        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(50);
        System.out.println("Voce tem " + Sasuke.idade + " então falta no mínimo: " + quantoTempoFalta + " anos para voce ser Hokage");

    }
}
