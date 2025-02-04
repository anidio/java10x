package org.example.NivelBasico.condicoes;

import java.util.Scanner;

public class ScannerDeUsuaio {

    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        //recebe nome do ninja
        System.out.println("Esceva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();

        //recebe idade do ninja
        System.out.println("Esceva aqui a idade do seu ninja: ");
        int  idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("O nome do seu ninja é: " + nomeDoNinja + ", e sua idade é: " + idadeDoNinja + "anos");

        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade e pode ir para a missão fora da aldeia");
        }else{
            System.out.println("Esse ninja é muito novo, ainda precisa treinar mais" );
        }
        caixaDeTexto.close();
    }
}
