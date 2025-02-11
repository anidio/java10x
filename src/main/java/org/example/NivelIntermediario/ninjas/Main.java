package org.example.NivelIntermediario.ninjas;

public class Main {

    public static void main(String[] args) {
        //Criar ninja Naruto - Naruto � um OBJETO
        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 16;
        Naruto.ModoSabioAtivado();

        //Criar ninja Sasuke Uchiha - Sasuke � um OBJETO
        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        //Aplicando m�todos aos meus objetos
//        Sasuke.SharinganAtivado();
//        String chamandoMetodo = Sasuke.euSouUmNinja();
//        System.out.println(chamandoMetodo);

        //Criar ninja Sakura Haruno - Sakura � um OBJETO
        Haruno Sakura = new Haruno();

        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();

        //Criar ninja Sakura Haruno - Sakura e um OBJETO
        Hyuga Hinata = new Hyuga();

        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 16;
        Hinata.ByakuganAtivado();


        //objeto 5
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da folha";
        Boruto.idade = 9;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(50);
        System.out.println("Voce tem " + Sasuke.idade + " ent�o falta no m�nimo: " + quantoTempoFalta + " anos para voce ser Hokage");

    }
}
