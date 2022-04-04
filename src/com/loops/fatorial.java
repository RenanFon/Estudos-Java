package com.loops;

import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int fatorial = 0;
        int resultado = 1;

        System.out.println("Qual numero devera ser fatorado ?:");
        numero = entrada.nextInt();

        for (int i = numero;i >= 1 ;i--){

            resultado = resultado * i;

        }

        System.out.println(resultado);


    }

}
