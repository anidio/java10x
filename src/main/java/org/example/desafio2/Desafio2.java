package org.example.desafio2;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //fazer Array
        int NUMERO_MAX = 5;
        String[] ninjas = new String[NUMERO_MAX];

        //Contadores
        int ninjasCadastrados = 0;
        int opcoes = 0;

        while (opcoes != 3){
            //MENU
            System.out.println("\n ====== Menu Ninja ========");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("3. Escolha uma opão: ");
            opcoes = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer de entrada para não pegar a próxima entrada como opção

            switch (opcoes) {
                case 1:
                    if(ninjasCadastrados < NUMERO_MAX){
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();;
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    }else{
                        System.out.println("A lista de ninjas esta cheia, impossivel");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhuma ninja cadastrado");
                    }else{
                        System.out.println("=========== Lista De Ninjhas ========");
                        for(int i = 0; i < ninjas.length; i++){
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos  saindo do programa...Aguarde");
                    break;

                default:
                    System.out.println("Essa opção não é válida.");
            }

        }


    }
}
