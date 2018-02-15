package com.desafio.triangulo;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;



public class AppTest
{
    private int[][] triangulo1 = {
            {6},
            {3, 5},
            {9, 7, 1},
            {4, 6, 8, 4}
    };


    private int[][] triangulo2 = {
            {26},
            {18, 20},
            {15, 15, 9},
            {4, 6, 8, 4}
    };


    @Test
    public void totalTriangulo26() throws Exception{
        MatcherAssert.assertThat(App.resultadoTriangulo(this.triangulo1), Matchers.is(String.valueOf(26)));
    }


    @Test
    public void compararTrianguloCompletoTotal26() throws Exception{
        int[][] trianguloCompleto = App.resultadoTrianguloCompleto(this.triangulo1);

        int[][] trianguloEsperado = {
                {26},
                {18, 20},
                {15, 15, 9},
                {4, 6, 8, 4}
        };

        MatcherAssert.assertThat(trianguloCompleto, Matchers.equalTo(trianguloEsperado));

    }

    @Test
    public void totalTriangulo69() throws Exception{
        MatcherAssert.assertThat(App.resultadoTriangulo(this.triangulo2), Matchers.is(String.valueOf(69)));
    }

    @Test
    public void compararTrianguloCompletoTotal69() throws Exception{
        int[][] trianguloCompleto = App.resultadoTrianguloCompleto(this.triangulo2);

        int[][] trianguloEsperado = {
                {69},
                {41, 43},
                {21, 23, 17},
                {4, 6, 8, 4}
        };

        MatcherAssert.assertThat(trianguloCompleto, Matchers.equalTo(trianguloEsperado));

    }


}
