package com.desafio.triangulo;

public class App
{

    // total = 26
    public static final int[][] trianguloPadro = {
        {6},
        {3, 5},
        {9, 7, 1},
        {4, 6, 8, 4}
    };

    public static String resultadoTriangulo(int[][] triangulo){

        int posicaoTriangulo = triangulo.length - 2;

        while ( posicaoTriangulo >= 0) {
            for (int colunasTriangulo = 0; colunasTriangulo <= posicaoTriangulo; colunasTriangulo++) {
                triangulo[posicaoTriangulo][colunasTriangulo] += Math.max( triangulo[posicaoTriangulo+1][colunasTriangulo], triangulo[posicaoTriangulo+1][colunasTriangulo+1]);
            }
            posicaoTriangulo -= 1;
        }

        return Integer.toString(triangulo[0][0]);
    }

    public static int[][] resultadoTrianguloCompleto(int[][] triangulo){

        int posicaoTriangulo = triangulo.length - 2;

        while ( posicaoTriangulo >= 0) {
            for (int colunasTriangulo = 0; colunasTriangulo <= posicaoTriangulo; colunasTriangulo++) {
                triangulo[posicaoTriangulo][colunasTriangulo] += Math.max( triangulo[posicaoTriangulo+1][colunasTriangulo], triangulo[posicaoTriangulo+1][colunasTriangulo+1]);
            }
            posicaoTriangulo -= 1;
        }

        return triangulo;
    }


    public static void main( String[] args )
    {

        System.out.println(resultadoTriangulo(trianguloPadro));
    }
}
