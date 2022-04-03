package com.loops;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        int qtdnumeros ;
        int impares = 0;
        int digito;
        int pares = 0;
        int i = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos numeros voce quer adicionar ?");
        qtdnumeros = entrada.nextInt();

        while (i <= qtdnumeros){
            System.out.println("Digite mais numeros");
            digito = entrada.nextInt();

            if(digito % 2 == 0){
                pares += 1;
            }else{
                impares += 1;
            }

            i++;
        }
        System.out.println("Voce tem "+pares+" numeros pares e "+impares+" Numeros impares");






    }


}
