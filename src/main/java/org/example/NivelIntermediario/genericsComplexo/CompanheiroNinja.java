package org.example.NivelIntermediario.genericsComplexo;

public class CompanheiroNinja {

    private String nomeDoAnimal;

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public CompanheiroNinja(String nomeDoAnimal){
        this.nomeDoAnimal = nomeDoAnimal;
    }

    @Override
    public String toString() {
        return "Esse � meu companheiro: " + nomeDoAnimal;
    }
}
