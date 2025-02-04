package org.example.NivelBasico;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[6];
        ninja[0] = "Rocklee";
        ninja[1] = "Sakura Haruno";
        ninja[2] = "Sasukke Uchiha";
        ninja[3] = "Naruto Uzumaki";
        ninja[4] = "Hinata  Hyuga";

        //Redeclarrar Array
        ninja =  new String[7];
        ninja[0] = "Hashirrama Senju";
        ninja[1] = "Tobiamma Senju";
        ninja[2] = "Hiruzen Sarutobbi";
        ninja[3] = "MMinato Namizae";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Shikamaru Uchiha";
        System.out.println(ninja[2]);

        //For para fazer LOOP  no a rrray
        for (int i = 0 ; i  < 7; i++) {
            System.out.println(ninja[i]);
        }

        //Acessar um elemento pelo índice
        System.out.println(ninja[3]);

        //Alterar um elemento pelo índice
        ninja[3] = "Naruto Uzumaki (Alterado)";
        System.out.println(ninja[3]);

        //Remover um elemento pelo índice
        ninja[4] = null;
        System.out.println(ninja[4]); // Imprime null
        ninja = java.util.Arrays.copyOf(ninja, ninja.length - 1); // Remove o último elemento do array
        System.out.println(ninja[10]); // Imprime null

        //Adicionar um elemento ao final do array

        System.out.println(ninja[1]);
    }
}
