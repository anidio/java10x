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
        System.out.println("O nome do seu ninja �: " + nomeDoNinja + ", e sua idade �: " + idadeDoNinja + "anos");

        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja j� � maior de idade e pode ir para a miss�o fora da aldeia");
        }else{
            System.out.println("Esse ninja � muito novo, ainda precisa treinar mais" );
        }
        caixaDeTexto.close();
    }
}
