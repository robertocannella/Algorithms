package com.robertocannella;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random r=new Random();
        int size = 5;

            for (int j = 0; j < size; j++) {
                list.add(Math.abs(r.nextInt(1000000000)));
            }


        WarmUp.miniMaxSum(list);

    }
}
