package com.loops;

import java.util.Random;

public class numerosaleatorios {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i= 0 ; i < numerosAleatorios.length;i++){
            int numero = aleatorio.nextInt(100);

            numerosAleatorios[i]= numero;


        }

        System.out.println("Numeros Aleatorios :");

        for (int numero: numerosAleatorios
             ) {
            System.out.println(numero + " ");

        }

    }
}
