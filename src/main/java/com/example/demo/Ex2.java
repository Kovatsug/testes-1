package com.example.demo;

public class Ex2 {

    public static String estacao(int n){
        if (n>4 || n<1)
            throw new RuntimeException("Numero fora do limite");

        return switch (n){
            case 1 -> "É verão e o tempo está quente";
            case 2 -> "É outono e as folhas estão caindo";
            case 3 -> "É inverno e está frio";
            default -> "É primavera e as flores começam a aparecer";
        };
    }

}
