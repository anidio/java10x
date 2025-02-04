package org.example.NivelBasico.condicoes;

public class LacosDeRepeticao {

    public static void main(String[] args) {

        // While
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

//        while (numeroDeClones <= numeroMaximoDeClones){
//            System.out.println("O Naruto fez " + numeroDeClones+ " clones das sombras");
//            numeroDeClones++;
//        }

        // FOR
        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
            System.out.println("O Naruto fez " + i + " clones das sombras");
        }
    }
}
