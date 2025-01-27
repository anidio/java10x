package org.example;

public class Main {
    public static void main(String[] args) {

        String nomeNinja1 = "Rocklee";
        int idadeNinja1 = 12;
        String missao1 = "Avançar rank paase tornar ninja realmente";
        String statusDaMissao = "Em andamento";
        char nivel1DaMissao = 'A';

        if(idadeNinja1 < 15){
            if(nivel1DaMissao == 'C' || nivel1DaMissao == 'D'){
                statusDaMissao = "Concluida";
            }else{
                statusDaMissao = "Não concluida, você não tem idade suficiente";
            }
        }else{
            statusDaMissao = "Concluida";
        }
        System.out.println("------------------------------------------------");
        System.out.println("Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idadeNinja1);
        System.out.println("Missao: " + missao1);
        System.out.println("Nivel da Missao " + nivel1DaMissao);
        System.out.println("Status da missao: " + statusDaMissao);
        System.out.println("------------------------------------------------");


        String nomeNinja2 = "Jaxon";
        int idadeNinja2 = 15;
        String missao2 = "Caçar  reconpensas para  se tornar Jounin";
        char nivel3DaMissao = 'C';

        if(idadeNinja2 < 15){
            if(nivel1DaMissao == 'C' || nivel1DaMissao == 'D'){
                statusDaMissao = "Concluida";
            }else{
                statusDaMissao = "Não concluida, você não tem idade suficiente";
            }
        }else{
            statusDaMissao = "Concluida";
        }
        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idadeNinja2);
        System.out.println("Missao: " + missao2);
        System.out.println("Nivel da Missao " + nivel1DaMissao);
        System.out.println("Status da missao: " + statusDaMissao);
        System.out.println("------------------------------------------------");

        String  nomeNinja3 ="Sasuke";
        int idadeNinja3 = 16;
        String missao3 = "Defender aldeias menores do artaque de ninjas do Mal";
        char nivel4DaMissao = 'D';

        if(idadeNinja3 < 15){
            if(nivel1DaMissao == 'C' || nivel1DaMissao == 'D'){
                statusDaMissao = "Concluida";
            }else{
                statusDaMissao = "Não concluida, você não tem idade suficiente";
            }
        }else{
            statusDaMissao = "Concluida";
        }
        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade do Ninja: " + idadeNinja3);
        System.out.println("Missao: " + missao3);
        System.out.println("Nivel da Missao " + nivel1DaMissao);
        System.out.println("Status da missao: " + statusDaMissao);
        System.out.println("------------------------------------------------");
    }
}