package br.com.dio.exercicios.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6
caracteres, e diga quantas consoantes foram lidas.
Imprima as consoantes.
  */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       //criando um arry de 6 caracteres
        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (! (letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u")) ) {
                //pega o arry na posição de contador = letra
                consoantes[count] = letra;
                quantConsoantes ++;
            }
            count++;

        }while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            //se a consoante for diferente de null, imprima a consoante

            if (consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoante: "+ quantConsoantes);
        System.out.println(consoantes.length);
    }
}
