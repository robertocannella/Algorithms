package com.robertocannella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        //List<Integer> a = new ArrayList<>(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
        //List<Integer> a = new ArrayList<>(Arrays.asList(12,24,10,24));
        List<Integer> a = new ArrayList<>(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));

        List<Integer> result = Implementation.breakingRecords(a);
        System.out.println(result);

    }
}
