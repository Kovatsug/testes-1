package com.example.demo;

public class Atleta {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Atleta(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String classificarCategoria() {

        if (idade >= 5 && idade <= 7) {
            return "pré-mirim";
        } else if (idade >= 8 && idade <= 10) {
            return "mirim";
        } else if (idade >= 11 && idade <= 13) {
            return "infantil";
        } else if (idade >= 14 && idade <= 17) {
            return "infanto-juvenil";
        } else if (idade >= 18 && idade <= 20) {
            return "juvenil";
        } else if (idade > 21) {
            return "adulto";
        }

        return "idade inválida";
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {

        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Magreza";
        } else if (imc <= 24.9) {
            return "Saudável";
        } else if (imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc <= 39.9) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (morbida)";
        }
    }
}