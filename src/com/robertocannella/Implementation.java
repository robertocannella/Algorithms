package com.robertocannella;

import javax.management.InstanceNotFoundException;
import javax.sound.sampled.EnumControl;
import java.lang.reflect.Array;
import java.util.*;
import java.util.jar.JarOutputStream;
import java.util.stream.Stream;

public class Implementation {
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
