package com.robertocannella;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args)  {

        Random r = new Random();
        // random r.nextInt(upperBound-lowerBound)+ lowerBound;
        int n = r.nextInt(100001-2)+2;
        int k = r.nextInt(n-2)+2;
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(r.nextInt(10000));
        }
        int b=0;
        for (Integer integer : arr) {
            b += integer;
        }
        // uncomment this section to get "Bon Appetit"
        //b -= arr.get(k);
        b = b/2;

        System.out.println(b);
//        List<Integer> arr = new ArrayList<>();
//        arr.add(3);
//        arr.add(10);
//        arr.add(2);
//        arr.add(9);
//
//        int k = 1;
//        int b = 12;

        Implementation.bonAppetit(arr,k,b);
       // System.out.println(n);
        //System.out.println(k);
        //System.out.println(b);
        //System.out.println(Arrays.toString(arr));
       // System.out.println(arr.get(k));



    }
}
