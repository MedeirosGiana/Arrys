package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros e mostre os na ordem inversa
 */

public class OrdemInversa {
    public static void main(String[] args) {
        //vetor arry unidimencional com elementos definidos
        int[] vetor = { -5 , -6 , 15 , 50 , 8 , 4 };

        System.out.print("vetor: ");
        int count = 0;//contador
        //laço para que a cada loop(count) dentro do vetor, pege um elemento(lengh) e mostre na tela.
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        //para mostrar a ordem inversa
        System.out.print("\nvetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
