package org.example.NivelIntermediario.desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Ninja> ninjas = new ArrayList<>();
    static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int maxDeNinjas = 5;
        Ninja[] listaDeNinjas = new Ninja[maxDeNinjas];

        while (opcao != 4) {
            System.out.println("1- Exibir informacoes dos ninhas cadastrados");
            System.out.println("2 - Adicionar novo ninja");
            System.out.println("3 - Atualizar habilidade especial");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma das opcoes acima:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirTodosNinjas();
                    break;

                case 2:
                    cadastrarNinjas();
                    break;
                case 3:
                    atualizarHabilidade();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
    }

    static void exibirTodosNinjas() {
        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja cadastrado.");
        } else {
            System.out.println("===== Lista de ninjas cadastrados ========");
            for (Ninja ninja : ninjas) {
                ninja.mostrarInformacoes();
                System.out.println("-------------------");
            }
        }
    }

    static void cadastrarNinjas() {
        Ninja ninja = new Ninja();
        System.out.print("Nome: ");
        ninja.nome = scanner.nextLine();
        System.out.print("Idade: ");
        ninja.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Missão: ");
        ninja.missao = scanner.nextLine();
        System.out.print("Nível de Dificuldade: ");
        ninja.nivelDeDificuldade = scanner.nextLine();
        System.out.print("Habilidade especial: ");
        ninja.habilidadeEspecial = scanner.nextLine();
        System.out.print("Status da Missão: ");
        ninja.statusMIssao = scanner.nextLine();

        ninjas.add(ninja);
        System.out.println("Ninja cadastrado com sucesso");
    }

    static void atualizarHabilidade() {
        System.out.print("Digite o nome do ninja: ");
        String nome = scanner.nextLine();
        for (Ninja ninja : ninjas) {
            if (ninja.nome.equalsIgnoreCase(nome)) {
                System.out.print("Nova Habilidade Especial: ");
                ninja.habilidadeEspecial = scanner.nextLine();
                System.out.println("Habilidade atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Ninja não encontrado.");
    }
}