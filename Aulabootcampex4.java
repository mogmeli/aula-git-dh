package br.com.mercadolivre;

import java.util.Scanner;

public class Aulabootcampex4 {
    public static void main(String[] args) {
        System.out.println("quantos numeros primos voce quer ver?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ct = 0, n = 0, i = 1, j = 1;
        while (n < a) {
            j = 1;
            ct = 0;
            while (j <= i) {
                if (i % j == 0)
                    ct++;
                j++;
            }
            if (ct == 2) {
                System.out.printf("%d ", i);
                n++;
            }
            i++;
        }


    }


}