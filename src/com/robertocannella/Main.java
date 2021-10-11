package com.robertocannella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)  {


       //List<Integer> s = new ArrayList<>(Arrays.asList(2,2,1,3,2));

       //List<Integer> s = new ArrayList<>(Arrays.asList(1,1,1,1,1));
       List<Integer> s = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2));
       //List<Integer> s = new ArrayList<>(Arrays.asList(4));

        int result = Implementation.birthday(s,3,2);
        System.out.println(result);

    }
}
