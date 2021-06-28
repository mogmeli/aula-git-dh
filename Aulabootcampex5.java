package br.com.mercadolivre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Aulabootcampex5 {
    public static void main(String[] args) {
        int numero, qtdRepeticoes;

        Scanner scaner = new Scanner(System.in);

        int n = scaner.nextInt();
        int m = scaner.nextInt();
        int d = scaner.nextInt();

        numero = (int) Math.pow(10, m - 1) * d;

        Collection<Integer> numerosEscolhidos = new LinkedHashSet<>();


        while (numerosEscolhidos.size() < n) {
            qtdRepeticoes = 0;

            for (char ch : Double.toString(numero).toCharArray()) {
                if (Character.getNumericValue(ch) == d)
                    qtdRepeticoes++;
            }
            ;

            if (qtdRepeticoes >= m)
                numerosEscolhidos.add(numero);

            numero++;
        }

        numerosEscolhidos.forEach(System.out::println);


    }
}