package org.example.NivelIntermediario.desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Inicializar o obj
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 25;
        sasuke.missao = "Recuperar o amuleto";
        sasuke.nivelDeDificuldade = "Alta";
        sasuke.statusMIssao = "Em andamento";
        sasuke.mostrarInformacoes();
    }
}
