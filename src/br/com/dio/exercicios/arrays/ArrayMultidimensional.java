package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e sua posição (linha e coluna).
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();//declara números aleatórios
        int [][] M = new int [4][4]; //declara uma matriz multidimensional

        //variáveis
        int menor = Integer.MIN_VALUE;//variável que guarda menor valor
        int linha = 0;//posição inicial da linha
        int coluna = 0;//posição inicial da coluna
        //para: variável i =0, até i menor que o tamanho da matriz M, acrescenta +1 ao valor de i a cada loop
        for (int i = 0; i < M.length; i++){//navegando na matriz
            // para: variável j =0, até i menor que o tamanho da linha, acrescenta +1 ao valor de i a cada loop
            for (int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);//atribuindo o numero aleatório ao número do elemento

                //se o elemento em uma determinada posição (linha, coluna) é menor que o menor número
                if (M[i][j] < menor){
                    menor = M[i][j];//o valor da variável menor passa a ser aleatório
                    linha = i;//que está na linha representada na variável i
                    coluna = j;//que está na coluna representado pela variável j
                }
            }
        }
        System.out.print("Menor: " + menor + " ");
        System.out.print("\nLinha: " + linha);
        System.out.println("\nColuna: " + coluna);

        System.out.println("\nMatriz: ");
        for (int[] linhaM:M){//para cada linha da matriz M
            for (int colunaM:linhaM){
                System.out.print(colunaM + " ");
            }
            System.out.println();
    }
  }
}
