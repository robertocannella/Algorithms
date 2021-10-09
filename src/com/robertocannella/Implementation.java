package com.robertocannella;

import java.util.ArrayList;
import java.util.List;

public class Implementation {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int edgeOne = s;
        int edgeTwo = t;
        int appleTree = a;
        int orangeTree = b;
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