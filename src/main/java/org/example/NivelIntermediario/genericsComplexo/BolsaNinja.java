package org.example.NivelIntermediario.genericsComplexo;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja <T>{
    //inicializar nosso array
    private List<T> ferramentas;

    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    public void adcionarFerraenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //Mostrar a nossa lista de ferramenta
    public void mostrarFerramenta(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }
}
