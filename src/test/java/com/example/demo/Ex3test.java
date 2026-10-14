package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex3test {

    @Test
    void deveCriarNomeStarWars() {

        String result = Ex3.nomeStarWars(
                "Gustavo",
                "Kreuch",
                "Volpi",
                "Blumenau"
        );

        Assertions.assertThat(result)
                .isEqualTo("KreGu VoBlu");
    }
}