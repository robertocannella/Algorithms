package com.robertocannella;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String stringInput;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            stringInput = br.readLine();
            System.out.println("Hello, World.");
            System.out.println(stringInput);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
