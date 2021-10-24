package com.robertocannella;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
        int steps = 8;
        String path =  "UDDDUDUUUUDDDDUUU";
        int pageCount = Implementation.countingValleys(steps,path);
        System.out.println("----------");
        System.out.println(pageCount);
    }
}
