package com.robertocannella;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws ParseException {

        Random r = new Random();
        // random r.nextInt(upperBound-lowerBound)+ lowerBound;
        int year = r.nextInt(2701-1700)+1700;
        String day = Implementation.dayOfProgrammer(year);
        System.out.println(day);



    }
}
