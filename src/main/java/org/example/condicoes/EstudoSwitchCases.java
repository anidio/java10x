package org.example.condicoes;

public class EstudoSwitchCases {

    public static void main(String[] args) {
        int numero = 10;

        switch (numero) {
            case 1:
                System.out.println("O n�mero � 1");
                break;
            case 2:
                System.out.println("O n�mero � 2");
                break;
            case 3:
                System.out.println("O n�mero � 3");
                break;
            default:
                System.out.println("O n�mero n�o est� entre 1 e 3");
        }
    }
}
