package org.example.NivelIntermediario;

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


}
