package com.robertocannella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        List<Integer> s = new ArrayList<>(Arrays.asList(1, 3, 2, 6, 1, 2));


        int result = Implementation.divisibleSumPairs(6,3,s);
        System.out.println(result);

    }
}
