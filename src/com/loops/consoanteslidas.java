package com.loops;

import java.util.Scanner;

public class consoanteslidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeconsoantes = 0;


        int i = 0;
        do{
            System.out.println("Letra :");
            String letra = entrada.next();

            if (!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))



            ){
                consoantes[i]= letra;
                quantidadeconsoantes++;
            }

        i++;

        }while (i < consoantes.length);


        for ( String consoante : consoantes  ) {
            System.out.println(consoante);

        }


    }


}
