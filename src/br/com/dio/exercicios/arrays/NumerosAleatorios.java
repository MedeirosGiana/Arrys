package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que leia 20 números inteiros aleatórios(entre 0e 100)
armazene-os em um vetor, ao final mostre os números e seus sucessores.
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
       //classe Random gera números aleatórios
        Random radom = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = radom.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print(" Numeros Aleatórios: ");
        for (int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessor Numeros Aleatórios: ");
        for (int numero : numerosAleatorios){
            System.out.print((numero+1) + " ");
        }
    }
}
