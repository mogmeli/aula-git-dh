package br.com.mercadolivre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Aulabootcamp3ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 10, 85, 1324, 1, 13, 62, 30, 12, 127));
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr + " ordem decrescente");
        Collections.sort(arr);
        System.out.println(arr + " ordem crescente");
    }

}