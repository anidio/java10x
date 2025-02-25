package org.example.NivelIntermediario.genericsComplexo;

public class Main {

    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adcionarFerraenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adcionarFerraenta(new Shuriken(3));
        bolsaNinja.adcionarFerraenta(new Pergaminho("Invoca��o do Sapo"));
        bolsaNinja.adcionarFerraenta(new Pergaminho("Pergaminho da �guia"));
        bolsaNinja.adcionarFerraenta(new CompanheiroNinja("Mamaru"));

        System.out.println("Itens Da nossa bolsa Ninja: ");
        bolsaNinja.mostrarFerramenta();
    }
}
