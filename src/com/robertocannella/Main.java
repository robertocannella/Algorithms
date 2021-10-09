package com.robertocannella;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)  {

        List<Integer> integers = new ArrayList<>();
        List<Long> longs = new ArrayList<>();

        Random r=new Random();
        //generate random list
        int size = 10;

        for (int j = 0; j < size; j++) {
            integers.add(r.nextInt());
        }
        for(int number: integers)
            longs.add((long) number);

        var item = WarmUp.aVeryBigSum(longs);
        System.out.println(longs);
        System.out.println(item);
    }
}
