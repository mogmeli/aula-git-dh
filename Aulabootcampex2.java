package br.com.mercadolivre;

import java.util.Collection;
import java.util.Scanner;


public class Aulabootcampex2 {
    public static void main(String[] args) {
        System.out.println("insira quantos multiplos voce quer ver: ");
        Scanner sc1 = new Scanner(System.in);
        int number = sc1.nextInt();
        System.out.println("do numero: ");
        Scanner sc2 = new Scanner(System.in);
        int multiplo = sc1.nextInt();

        for(int i = 2; i <= multiplo; i++){
            if(multiplo % i  == 0){
                System.out.println("o numero "+ i + " e multiplo de " + multiplo);
                number--;
                if(number == 0){
                    break;
                }
            }
        }
    }
}