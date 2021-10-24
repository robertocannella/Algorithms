package com.robertocannella;

// HackerRank Algorithm Exercises
import java.sql.ClientInfoStatus;
import java.util.*;

public class Implementation {

    // leetCode swap linklist nodes
    public static class ListNode {
              int val;
              ListNode next;
              ListNode() {}
              ListNode(int val) { this.val = val; }
              ListNode(int val, ListNode next) { this.val = val; this.next = next; }
          }
    public static ListNode swapPairs (ListNode head){
        if(head == null || head.next == null)
         return head;

        ListNode swap = head.next;
        head.next = swapPairs(head.next.next);
        swap.next = head;
        return swap;

    }
    // hackerRank
    public static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(x-z);
        int catB = Math.abs(y-z);

        if (catB > catA)
            return "Cat A";

        if (catA > catB)
            return "Cat B";

        else
            return "Mouse C";

    }
    public static int maxCombo(int[] a, int[]b, int max){


        int ans = -1;
        for (int j : a) {
            for (int k : b) {
                int sum = j + k;
                if (sum > max) continue;
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count = 0;
        int height = 0;

        for (char ch : path.toCharArray()) {
            int temp = height;
            height += (ch == 'U') ? 1: -1;
            System.out.println(ch);
            System.out.println("temp " + temp);
            System.out.println("height " + height);
            if (temp < 0 && height >= 0)
                count++;
        }
        return count;
    }
    public static int pageCount(int n, int p) {
        // Write your code here
        if(n%2 == 0 )
            n++;

        int fromBack = (n-p)/2;
        int fromFront = p/2;

        System.out.println(p/2);
        return Math.min(fromBack,fromFront);
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int sock : ar) {
            if (set.contains(sock)) {
                count++;
                set.remove(sock);
            }
            else
                set.add(sock);
        }
//        System.out.println(set);
//        System.out.println(ar);
        return count;
    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0;

        for (int i = 0; i < bill.size(); i++) {
            if (i==k) continue;
            sum+=bill.get(i);
        }
        int split = sum/2;
        System.out.println((b == split) ? "Bon Appetit" : b -split);
    }
    public static String dayOfProgrammer(int year){
        int days = 243;
        if (year >= 1700 && year <= 1917) {
            //System.out.println("Julian Calendar");
            if (year%4 == 0) {
               // System.out.println("Leap Year");
                days += 1;
            }
        }
        else if (year >= 1919) {
            //System.out.println("Gregorian Calendar");
            if (year%400 == 0 || year%4 == 0 && year%100 != 0) {
               // System.out.println("Leap Year");
                days += 1;
            }
        }
        else {
            //System.out.println("1918");
            days -= 13;
        }

        int day = 256-days;
        return day+"-09-"+year;
    }
    public static int migratoryBirds(List<Integer> arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : arr){
            if (map.containsKey(number))
                map.put(number, map.get(number)+1);
            else
                map.put(number, 1);
        }

        int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(map);
        return key;
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        /// O(n+k)
        Queue<Integer> queue = new ArrayDeque<>(ar);

            int[] bucket = new int[k];
            int count = 0;
            for(int a_i=0; a_i < n; a_i++){
                int number = queue.remove();
                System.out.println("number: " + number);
                number = number % k;                       // set number to mod of k
                System.out.println("number: " + number);
                int complement = number == 0 ? k : number; // i
                count += bucket[k-complement];
                bucket[number] += 1;
            }
             System.out.println(Arrays.toString(bucket));
            return count;

        /// old solution

//        int count=0;
//
//        for (int i = 0; i < ar.size(); i++)
//            for (int j = i; j < ar.size(); j++)
//                if ((ar.get(i)+ar.get(j))%k==0 && j!=i)
//                    count++;
//
//        return count;
    }
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
