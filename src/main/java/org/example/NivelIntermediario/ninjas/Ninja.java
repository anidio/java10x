package org.example.NivelIntermediario.ninjas;

public class Ninja {

     String nome;
     int idade;
     String aldeia;

     //Metodo String vai ter que retornar uma String
     public String euSouUmNinja(){
          return "Oi, eu sou um ninja!";
     }

     //Metodo int vai ter que retornar uma int
     public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
          return idadeMinimaParaSerHokage - idade;
     }

     public void habilidadeEspecial(){
          System.out.println("Meu nome é " + nome + ", E essa é minha habilidade especial");
     }

}
