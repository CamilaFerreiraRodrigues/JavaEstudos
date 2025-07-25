package org.example;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {


        // Interger = int
        // Definindo o tipo dalista
        //List<Integer> nomeLista;

        //Não tem como intanciar uma Lista pq ela é uma interface e não tem como instaciar interfcas. Pos isso precisamos de uma  classe para implementar a interface ->
        // intanciar essa lisra ArrayList<> é uma exemplo :)
        List<String> nomeLista =  new ArrayList<String>();

        //Adicionei uma valor a minha lista
        nomeLista.add("Camila");
        nomeLista.add("Lucia");
        nomeLista.add(0, "Davi");
        nomeLista.add("Michael");
        nomeLista.add("Alceni");
        nomeLista.add("Samis");

        System.out.println(nomeLista.size());

        nomeLista.remove(1); // vai remover camila
        nomeLista.remove("Samis"); // vai remover samis


        System.out.println(nomeLista.indexOf("Alceni"));






        //Para cada elemento do tipo String, chamado x, dentro da lista nomeLista
        for (String x : nomeLista){
            System.out.println(x);
        }


        //System.out.println(nomeLista.size(););


    }
}
