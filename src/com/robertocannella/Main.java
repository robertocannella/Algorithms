package com.robertocannella;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Random r = new Random();
        int n = 10;
        List<Integer> ar = new ArrayList<>();
        while (n > 0) {
            ar.add(r.nextInt(10));
            n--;
        }

        int pairs =  Implementation.sockMerchant(n, ar);
        System.out.println(pairs);

    }
}
