package com.robertocannella;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random r=new Random();
        int size = 59;

        int[] arr1 = {-11,2,4,5,6,7,2,3,4};
        int[] arr2 = {-11,2,4,5,6,7,3,3,4};
        int[] arr3 = {-11,2,4,5,6,7,12,3,4};
        int[] arr4 = {-11,2,4,5,-6,7,2,3,4};
        int[] arr5 = {-11,2,-4,5,6,7,2,3,4};
        int[] arr7 = {-11,2,-4,5,6,7,2,3,4};
        int[] arr6 = {-11,2,4,5,6,7,2,3,4};
        int[] arr8 = {4,5,6,3,5,-11,-100,12,9};
        int[] arr9 = {4,5,6,3,5,-11,-100,12,9};

        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        List<Integer> list3 = Arrays.stream(arr3).boxed().collect(Collectors.toList());
        List<Integer> list4 = Arrays.stream(arr4).boxed().collect(Collectors.toList());
        List<Integer> list5 = Arrays.stream(arr5).boxed().collect(Collectors.toList());
        List<Integer> list6 = Arrays.stream(arr6).boxed().collect(Collectors.toList());
        List<Integer> list7 = Arrays.stream(arr7).boxed().collect(Collectors.toList());
        List<Integer> list8 = Arrays.stream(arr8).boxed().collect(Collectors.toList());
        List<Integer> list9 = Arrays.stream(arr9).boxed().collect(Collectors.toList());
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(list1,list2,list3,list4,list5,list6,list7,list8,list9));


        System.out.println(WarmUp.diagonalDifference(matrix));

    }
}
