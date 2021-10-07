package com.robertocannella;
// HackerRank exercises
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WarmUp {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here

    }
    public static List<List<Integer>> generateRandomMatrix(int size){
        List<List<Integer>> matrix = new ArrayList<>();

        Random r=new Random();

        for (int i = 0;i < size; i++) {
            matrix.add(new ArrayList<>());
                for (int j = 0; j < size; j++) {
                    matrix.get(i).add(r.nextInt( 100+100) - 100);
                }
        }
        return matrix;
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // the matrix can be any size.
        int sumUp = 0;
        int sumDn = 0;

        for (int i = 0, j = arr.size()-1; i < arr.size() && j >= 0; i++, j--){
            sumUp += arr.get(i).get(i);
            sumDn += arr.get(i).get(j);
        }

        return Math.abs(sumUp - sumDn);
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> results = new ArrayList<>(Arrays.asList(0,0));

        int alicesScore = 0;
        int bobsScore = 0;

        for (int i = 0; i< a.size(); i++) {
            if (a.get(i) > b.get(i))
                results.set(0, ++alicesScore);
            if (a.get(i) < b.get(i))
                results.set(1, ++bobsScore);
        }
        return results;
    }
    public static int simpleArraySum(List<Integer> ar) {
        var sum = 0;
        for(var item: ar)
            sum += item;

        return sum;
    }
}
