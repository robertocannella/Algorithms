package com.robertocannella;
// HackerRank exercises
import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class WarmUp {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // the matrix can be any size.
        int sumUp = 0;
        int sumDn = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumUp = (arr.get(0).get(2)+arr.get(1).get(1)+arr.get(2).get(0));
            sumDn = (arr.get(0).get(0)+arr.get(1).get(1)+arr.get(2).get(2));
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
