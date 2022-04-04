package com.loops;

public class arrayreverso {

    public static void main(String[] args) {

        int [] vetor = {0,-1,2,4,7,8};

        System.out.println("Vetor :");

        int i = 0;
        while(i < vetor.length){
            System.out.println(vetor[i]+" ");

            i++;
        }

        int numero = 0;

        for(int count = (vetor.length-1); count >= 0;count--){
            System.out.println(vetor[count]);
        }


    }

}
