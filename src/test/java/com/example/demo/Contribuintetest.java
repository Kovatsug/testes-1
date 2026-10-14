package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Contribuintetest {

    @Test
    void deveSerIsento() {

        Contribuinte contribuinte =
                new Contribuinte("Joao", "123", "SP", 4000);

        Assertions.assertThat(contribuinte.calcularImposto())
                .isEqualTo(0);
    }

    @Test
    void deveCalcularImpostoDe5Porcento() {

        Contribuinte contribuinte =
                new Contribuinte("Fabio", "111", "MG", 5000);

        Assertions.assertThat(contribuinte.calcularImposto())
                .isEqualTo(290);
    }

    @Test
    void deveCalcularImpostoDe15Porcento() {

        Contribuinte contribuinte =
                new Contribuinte("Paulo", "221", "MT", 10000);

        Assertions.assertThat(contribuinte.calcularImposto())
                .isEqualTo(1500);
    }

    @Test
    void deveCalcularImpostoDe27Porcento() {

        Contribuinte contribuinte =
                new Contribuinte("Felipe", "112", "RS", 30000);

        Assertions.assertThat(contribuinte.calcularImposto())
                .isEqualTo(8250);
    }

    @Test
    void deveCalcularImpostoDe30Porcento() {

        Contribuinte contribuinte =
                new Contribuinte("Catarina", "990", "RJ", 40000);

        Assertions.assertThat(contribuinte.calcularImposto())
                .isEqualTo(12000);
    }
}