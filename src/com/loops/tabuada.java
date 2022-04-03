package com.loops;

import java.util.Scanner;

public class tabuada {



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        int i;

        System.out.println("Insira o numero da tabuada desejada :");

        numero = entrada.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(numero+" x "+i+" = "+(numero * i));

        }

    }

}
