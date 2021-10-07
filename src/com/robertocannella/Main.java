package com.robertocannella;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<List<Integer>> matrix = new ArrayList<>();

        Random r=new Random();
        int size = 59;

        for (int i = 0;i < size; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                matrix.get(i).add(r.nextInt(100));
            }
        }
        for(var list: matrix)
            System.out.println(list);
        System.out.println(WarmUp.diagonalDifference(matrix));

    }
}
