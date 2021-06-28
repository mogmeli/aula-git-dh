package br.com.mercadolivre;


import java.util.Scanner;

public class Aulabootcampex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        for(int i = 0; i <= a; i++){
            if(i%2 == 0){
                System.out.println("This number is an even number - " + i);
            }
        }
    }
}