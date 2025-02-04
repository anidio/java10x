package org.example.NivelBasico;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        String[][] ninja = {
                {"Rocklee", "Sakura Haruno"},
                {"Sasukke Uchiha", "Naruto Uzumaki"},
                {"Hinata  Hyuga", "Sasuke Uchiha"}
        };

        System.out.println(ninja[0][1]); // Sakura Haruno

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Minato Namizae";
        ninjasEAldeias[0][2] = "Sasule Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Hidan";
        ninjasEAldeias[1][2] = "Tsunade";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Shikamaru Uchiha";

        System.out.println(ninjasEAldeias[0][1]);

        for (int i = 0; i < ninjasEAldeias.length; i++){
            System.out.println("Aldeia: " + ninjasEAldeias[i][0]);
        }
    }
}
