package com.example.demo;

public class Ex3 {

    public static String nomeStarWars(String nome, String sobrenome, String sobrenomeMae, String cidade) {

        String primeiroNome = sobrenome.substring(0, 3)
                + nome.substring(0, 2);

        String segundoNome = sobrenomeMae.substring(0, 2)
                + cidade.substring(0, 3);

        return primeiroNome + " " + segundoNome;
    }
}