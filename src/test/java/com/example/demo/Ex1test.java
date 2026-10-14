package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex1test {

    @Test
    void deveRetornarTrueParaPar() {
        boolean result = Ex1.isEven(34);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void deveRetornarFalseParaImpar() {
        boolean result = Ex1.isEven(33);

        Assertions.assertThat(result).isFalse();
    }

}
