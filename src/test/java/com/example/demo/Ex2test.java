package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex2test {

    @Test
    void deveRetornarVerao() {
        Assertions.assertThat(Ex2.estacao(1))
                .isEqualTo("É verão e o tempo está quente");
    }

    @Test
    void deveRetornarOutono() {
        Assertions.assertThat(Ex2.estacao(2))
                .isEqualTo("É outono e as folhas estão caindo");
    }

    @Test
    void deveRetornarInverno() {
        Assertions.assertThat(Ex2.estacao(3))
                .isEqualTo("É inverno e está frio");
    }

    @Test
    void deveRetornarPrimavera() {
        Assertions.assertThat(Ex2.estacao(4))
                .isEqualTo("É primavera e as flores começam a aparecer");
    }
    @Test
    void deveLancarExcecaoQuandoForaDoLimite() {
        Assertions.assertThatThrownBy(() -> Ex2.estacao(0))
                .isInstanceOf(RuntimeException.class);

        Assertions.assertThatThrownBy(() -> Ex2.estacao(5))
                .isInstanceOf(RuntimeException.class);
    }

}
