package com.robertocannella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)  {

        List<Integer> s = new ArrayList<>();
        Random r = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            s.add(r.nextInt(5) +1);
        }

        int result = Implementation.migratoryBirds(s);
        System.out.println(result);
        System.out.println(s);

    }
}
