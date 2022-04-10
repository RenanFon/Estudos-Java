package com.loops;

import java.util.Scanner;

public class debug {
    public static void main(String[] args) {

        mostrarNome();




    }

    static void mostrarNome(){
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Olá como é seu nome ?");
        nome = entrada.next();
        if((nome.length()) <= 3){
            System.out.println("Nome muito curto");
            mostrarNome();
        }else{
            System.out.println("Ola "+nome+" Tudo bem ?");
        }



    }



}
