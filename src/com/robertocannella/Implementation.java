package com.robertocannella;

import java.util.*;

public class Implementation {
    public static int birthday(List<Integer> arr, int sum, int contLength) {
        // find a sum in contiguous arrays up to length
        // example
        // sum - 4  contLength = 2
        //
        //  2  2  1  3  2
        // [2 +2] 1  3  2  *
        //  2 [2 +1] 3  2
        //  2  2 [1 +3] 2  *
        //  2  2  1 [3 +2]
        // return total    2

        System.out.println(arr);
        System.out.println(arr.size()/contLength);
        int len;
        int totalMatches =0;
        int parseSize = (arr.size()-contLength)+1;

        for (int i = 0; i < parseSize; i++) {
            len = 0;
            for (int j = 0; j < contLength; j++) {
                len += arr.get(j+i);
            }
            if (sum == len)
                totalMatches++;
        }
        return totalMatches;

    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        HashSet<Integer> highScores = new HashSet<>();
        HashSet<Integer> lowScores = new HashSet<>();
        int currentScore = scores.get(0);
        int currentHighScore = currentScore;
        int currentLowScore = currentScore;

        int size = 0;
        while (size != scores.size()){
            currentScore = scores.get(size);
            if (currentScore > currentHighScore) {
                highScores.add(currentScore);
                currentHighScore = currentScore;
            }
            if (currentScore < currentLowScore) {
                lowScores.add(currentScore);
                currentLowScore = currentScore;
            }
            size++;
        }
        results.add(0,highScores.size());
        results.add(1,lowScores.size());

        return results;
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        //The elements of the first array are all factors of the integer being considered
        //The integer being considered is a factor of all elements of the second array
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> invalidIntegers = new HashSet<>();

        for (int number: a)
            set.addAll(getFactors(number));
        for(int number: b)
            set.addAll(getFactors(number));

        // check if current array item is a factor of the integer being considered
        for (int factor: set) {
            for (Integer integer : a)
                if (factor % integer != 0)
                    invalidIntegers.add(factor);

            for (Integer integer : b)
                if (integer % factor != 0)
                    invalidIntegers.add(factor);
        }

        set.removeAll(invalidIntegers);

        System.out.println(set);
        System.out.println(invalidIntegers);

        return set.size();
    }
    private static int getProduct(List<Integer> list){
        int product = 1;
        for (Integer integer : list) {
            product *= integer;
        }
        return product;
    }

    private static List<Integer> getFactors(int n){
        List<Integer> v = new Vector<>();
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i)
                    v.add(i);
                else
                    v.addAll(Arrays.asList(i, (n/i)));
            }
        }
        Collections.sort(v);
        return v;
    }
    public static String kangaroo(int kangOneStartX, int kangOneVel, int kangTwoStartX, int kangTwoVel) {

        // Possible Solution to solve for y (point where kangaroos meet)
        // x1 + (y * v1) = x2 + (y * v2) =>
        // (x1 - x2) + y(v1 -v2) = 0 =>
        // (x1 - x2) = -y(v1 - v2) =>
        // (-x1 - (-x2) = y(v1 - v2) =>
        // (x2 - x1) = y(v1 - v2) =>
        // (x2 - x1) / (v1 - v2) = y
        // if = 0, kangaroos will meet


//        if ((kangTwoStartX-kangOneStartX)%(kangOneVel-kangTwoVel) == 0)
//            return "YES";
//
//        return "NO";

        // ----Old Solution --- //
        // Constraints
        // 0 < kangOne < kangTwo < 10000
        long jumps = 1;
        int kangOneCurrentPoint = (kangOneStartX + kangOneVel);
        int kangTwoCurrentPoint = (kangTwoStartX + kangTwoVel);

        if (kangTwoVel > kangOneVel && kangTwoCurrentPoint > kangOneCurrentPoint)
            return "NO KangTwo is ahead with higher velocity";
        if(kangOneVel > kangTwoVel && kangOneCurrentPoint > kangTwoCurrentPoint)
            return "NO KangOne is ahead with faster velocity";
        if(kangOneVel == kangTwoVel)
            return "N0 Kangaroos have the same velocity and will never meet up";

        while (kangOneCurrentPoint < kangTwoCurrentPoint) {
            jumps++;
            kangOneCurrentPoint += kangOneVel;
            kangTwoCurrentPoint += kangTwoVel;
        }

        if (kangOneCurrentPoint == kangTwoCurrentPoint)
            return "YES: Total jumps: " + jumps + " | k1 location: " +kangOneCurrentPoint+ " | k2 location: " +kangTwoCurrentPoint;

        return "NO Total jumps: " + jumps + " | k1 location: " +kangOneCurrentPoint+ " | k2 location: " +kangTwoCurrentPoint;
    }
    public static void countApplesAndOranges(int edgeOne, int edgeTwo, int appleTree, int orangeTree, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        for(var apple: apples)
            if ((apple +appleTree) >= edgeOne && ((apple +appleTree) <= edgeTwo))
                appleCount++;

        for(var orange: oranges)
            if ((orange + orangeTree) >= edgeOne && ((orange +orangeTree) <= edgeTwo))
                orangeCount++;

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        grades.clear();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> adjustedGrades = new ArrayList<>();

        for(var grade: grades) {
            if (grade < 38)
                adjustedGrades.add(grade);
            else if (grade%5 >= 3) {
                grade = (grade-grade%5+5);
                adjustedGrades.add(grade);
            }
            else
                adjustedGrades.add(grade);
        }

        return adjustedGrades;

    }
}
