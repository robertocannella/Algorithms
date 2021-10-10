package com.robertocannella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        List<Integer> a = new ArrayList<>(Arrays.asList(2,4));
        //List<Integer> b = new ArrayList<>(Arrays.asList(24,36));
        List<Integer> b = new ArrayList<>(Arrays.asList(16,32,96));
        //List<Integer> b = new ArrayList<>(Arrays.asList(24,36));
        int result = Implementation.getTotalX(a,b);
        System.out.println(result);

    }
}
