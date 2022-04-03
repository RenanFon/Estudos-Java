package com.loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int numero = 0;
        int maior = 0;
        while(i < 5){
            System.out.println("Digite um numero ");

            numero = entrada.nextInt();

            if(numero > maior){
                maior = numero;
            }



            i++;

        }
        System.out.println("O maior numero é "+maior);
    }
}
