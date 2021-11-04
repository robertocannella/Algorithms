package com.robertocannella;

import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void calculate(int a, int b, int n){

        calculate(0, 1,a,b,n);
    }
    private static void calculate(int initResult, int t, int a, int b, int n){
        if (n == 0)
            return;

        System.out.printf(a + (t*b) + initResult + " ");
        initResult = ((t*b) + initResult);
        n = n-1;

        calculate(initResult,t*2, a, b, n);
    }
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calculate(a,b,n);
            System.out.println();
        }
        in.close();
    }

    }


