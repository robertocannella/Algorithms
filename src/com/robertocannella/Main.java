package com.robertocannella;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] array = {-4, 3, -9, 0, 4, 1};
        List<Integer> list1 = Arrays.stream(array).boxed().collect(Collectors.toList());
        WarmUp.plusMinus(list1);
    }
}
