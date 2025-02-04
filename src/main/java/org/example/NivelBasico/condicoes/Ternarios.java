package org.example.NivelBasico.condicoes;

public class Ternarios {
    public static void main(String[] args) {

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes) >= 10 ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja esta com menos de 10 missoes";
        System.out.println(nivelDoNinja);
    }
}
