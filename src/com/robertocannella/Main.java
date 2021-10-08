package com.robertocannella;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random r=new Random();
        //generate random list
        int size = 5;
        int bound = 10;

        for (int j = 0; j < size; j++) {
            list.add(Math.abs(r.nextInt(bound)));
        }
        System.out.println(WarmUp.birthdayCakeCandles(list));
        System.out.println(list);
    }
}
