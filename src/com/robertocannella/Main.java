package com.robertocannella;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {-1,2,1};
        int[] arr2 = {4,1,6};
        int[] arr3 = {1,8,-1};
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        List<Integer> list3 = Arrays.stream(arr3).boxed().collect(Collectors.toList());
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(list1,list2,list3));


        System.out.println(WarmUp.diagonalDifference(matrix));

    }
}
