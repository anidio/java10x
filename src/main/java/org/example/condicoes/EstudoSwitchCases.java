package org.example.condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {

    public static void main(String[] args) {

        //Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um Ninja:");
        System.out.print("1 - Naruto Usumakki");
        System.out.print("2 - Sasuke Uchiha:");
        System.out.print("3 - Sakura Haruno");

        int escolhaNinja = scanner.nextInt();

        System.out.println("Você digitou o numero: " + escolhaNinja);

        //Reacao ao escolher Ninja
        switch (escolhaNinja) {
            case 1:
                System.out.println("Ninja escolhido: Naruto Usumaki");
                break;
            case 2:
                System.out.println("Ninja escolhido: Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Ninja escolhido: Sakura Haruno");
                break;
            default:
                System.out.println("Ninja não encontrado!");
        }

        //Fechar sacanner
        scanner.close();
    }
}
