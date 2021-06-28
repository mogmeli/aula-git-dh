package br.com.mercadolivre;

import java.util.Scanner;

public class Aulabootcampex3 {
    public static void main(String[] args) {
        System.out.println("insira um numero e descubra se ele é ou não primo - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean primo = true;

        if(n == 0 ){
            primo = false;
        }
        for(int i = 2; i < n; i++){

            if(n % i == 0){
                primo = false;
                break;
            }
        }
        if(primo){
            System.out.println(n  + " é primo");
        }else{
            System.out.println(n  + " nao é primo");
        }
    }
}