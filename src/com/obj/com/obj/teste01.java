package com.obj.com.obj;

public class teste01 {
    public static void main(String[] args) {

        /* exercicio Criando classes em java */

        class Carro{
            int rodas;
            String modelo;
            String cor;
            double motor;
            float captanque;

            Carro(){

            }
            Carro(int rodas,String modelo,String cor,double motor,float captanque){
                this.rodas = rodas;
                this.modelo = modelo;
                this.cor = cor;
                this.motor = motor;
                this.captanque = captanque;

            }


            void setRodas(int rodas){
                this.rodas = rodas;
            }
            int getRodas(){
                return rodas;
            }

            void setModelo(String modelo){
                this.modelo = modelo;
            }
            String getModelo(){
                return modelo;
            }

            void setCor(String cor){
                this.cor = cor;
            }
            String getCor(){
                return cor;
            }

            void setMotor(double motor){
                this.motor= motor;
            }
            double getMotor(){
                return motor;
            }

            void setCaptanque(float captanque){
                this.captanque= captanque;
            }
            float getCaptanque(){
                return captanque;
            }

            double valorTotalDoTanque(double valorCombustivel){
                return captanque * valorCombustivel;
            }




        }



        Carro carro1 = new Carro();


        carro1.setRodas(4);
        carro1.setCor("Azul");
        carro1.setModelo("VW Gol");
        carro1.setCaptanque(12);
        carro1.setMotor(1.4);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getMotor());
        System.out.println(carro1.getRodas());
        System.out.println(carro1.getCaptanque());
        System.out.println(carro1.valorTotalDoTanque(4.20));



    }
}
