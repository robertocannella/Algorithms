package com.robertocannella;
// HackerRank exercises

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class WarmUp {

    public static long aVeryBigSum(List<Long> ar) {
        long sum =0;
        for (Long aLong : ar) {
            sum += aLong;
        }
        return sum;
    }
    public static String timeConversion(String s) {

            //String input = "23/12/2014 10:22:12 PM";
            //Format of the date defined in the input String
            DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
            //Desired format: 24 hour format: Change the pattern as per the need
            DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
            Date date;
            String output = null;
            try{
                //Converting the input String to Date
                date= df.parse(s);
                //Changing the format of date and storing it in String
                output = outputformat.format(date);
                //Displaying the date
            }catch(ParseException pe){
                pe.printStackTrace();
            }
            return output;

    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int size=candles.size()-1;

        int currentCandle = candles.get(size);
        int previousCandle = candles.get(size-1);
        int count = 1;

        while (currentCandle == previousCandle)
        {
            count++;
            if (count == size+1)
                break;

            previousCandle = candles.get(size-count);
        }
        return count;
    }
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long maxSum;
        long minSum;
        long base = 0;
        for (var i = 1; i < 4; i++)
            base += arr.get(i);

        minSum = base + arr.get(0);
        maxSum = base + arr.get(4);
        System.out.print(minSum + " " + maxSum);
    }
    public static void staircase(int n) {
            var spaceCount = n-1;
            for (int i = 1; i <=n ; i++) {
                System.out.print(" ".repeat(spaceCount)+ "#".repeat(i) + "\n");
                spaceCount--;
            }
    }
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
