package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Atletatest {

    @Test
    void deveClassificarAtletaComoPreMirim() {

        Atleta atleta = new Atleta("Bebe", 6, 1.20, 30);

        Assertions.assertThat(atleta.classificarCategoria())
                .isEqualTo("pré-mirim");
    }

    @Test
    void deveClassificarAtletaComoMirim() {

        Atleta atleta = new Atleta("Gael", 9, 1.30, 35);

        Assertions.assertThat(atleta.classificarCategoria())
                .isEqualTo("mirim");
    }

    @Test
    void deveClassificarAtletaComoInfantil() {

        Atleta atleta = new Atleta("Enzo", 12, 1.50, 45);

        Assertions.assertThat(atleta.classificarCategoria())
                .isEqualTo("infantil");
    }

    @Test
    void deveClassificarAtletaComoInfantoJuvenil() {

        Atleta atleta = new Atleta("Sérgio", 16, 1.70, 60);

        Assertions.assertThat(atleta.classificarCategoria())
                .isEqualTo("infanto-juvenil");
    }

    @Test
    void deveClassificarAtletaComoJuvenil() {

        Atleta atleta = new Atleta("Pedro", 19, 1.80, 70);

        Assertions.assertThat(atleta.classificarCategoria())
                .isEqualTo("juvenil");
    }

    @Test
    void deveClassificarAtletaComoAdulto() {

        Atleta atleta = new Atleta("Wagner", 25, 1.80, 70);

        Assertions.assertThat(atleta.classificarCategoria())
                .isEqualTo("adulto");
    }

    @Test
    void deveClassificarIMCComoMagreza() {
        Atleta atleta = new Atleta("Paulo", 25, 1.0, 18.0);

        Assertions.assertThat(atleta.classificarIMC())
                .isEqualTo("Magreza");
    }

    @Test
    void deveClassificarIMCComoSaudavel() {
        Atleta atleta = new Atleta("Lucas", 25, 1.0, 22.0);

        Assertions.assertThat(atleta.classificarIMC())
                .isEqualTo("Saudável");
    }

    @Test
    void deveClassificarIMCComoSobrepeso() {
        Atleta atleta = new Atleta("Joao", 25, 1.0, 27.0);

        Assertions.assertThat(atleta.classificarIMC())
                .isEqualTo("Sobrepeso");
    }

    @Test
    void deveClassificarIMCComoObesidadeGrauI() {
        Atleta atleta = new Atleta("Daniel", 25, 1.0, 32.0);

        Assertions.assertThat(atleta.classificarIMC())
                .isEqualTo("Obesidade Grau I");
    }

    @Test
    void deveClassificarIMCComoObesidadeGrauII() {
        Atleta atleta = new Atleta("Cézar", 25, 1.0, 37.0);

        Assertions.assertThat(atleta.classificarIMC())
                .isEqualTo("Obesidade Grau II (severa)");
    }

    @Test
    void deveClassificarIMCComoObesidadeGrauIII() {
        Atleta atleta = new Atleta("Roberto", 25, 1.0, 45.0);

        Assertions.assertThat(atleta.classificarIMC())
                .isEqualTo("Obesidade Grau III (morbida)");
    }
}