package com.robertocannella;
// HackerRank exercises
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WarmUp {
    public static void plusMinus(List<Integer> arr) {
        // Print the following  lines, each to  decimals:

        //proportion of positive values
        //proportion of negative values
        //proportion of zeros

        List<Double> results = new ArrayList<>(Arrays.asList(0.00,0.00,0.00));

        double positives = 0;
        double negatives = 0;
        double zeros = 0;
        for (int integer : arr) {
            if (integer > 0)
                results.set(0, ++positives);
            else if (integer < 0)
                results.set(1, (++negatives));
            else
                results.set(2, ++zeros);
        }
        for(double result : results)
            System.out.printf("%.6f%n", result/arr.size());

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
