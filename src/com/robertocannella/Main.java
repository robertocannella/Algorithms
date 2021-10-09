package com.robertocannella;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)  {

        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();
        Random r=new Random();

        int totalApples = 5;
        int totalOranges = 5;
        // set range of 30 integers beginning at -10
        for (int i = 0; i < totalApples; i++) {
            apples.add(r.nextInt(30)-10);
        }
        for (int i = 0; i < totalOranges; i++) {
            oranges.add(r.nextInt(30)-10);
        }

        Implementation.countApplesAndOranges(2,15,5,15,apples,oranges);
        System.out.println(apples);
        System.out.println(oranges);

    }
}
