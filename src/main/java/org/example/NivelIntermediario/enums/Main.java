package org.example.NivelIntermediario.enums;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        NivelIntermediario.Missoes missao2 = new NivelIntermediario.Missoes("Derrotar Zabuza", NivelIntermediario.RankDeMissoes.A);
        missao2.exibirDetalhes();
    }
}
