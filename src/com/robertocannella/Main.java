package com.robertocannella;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)  {

        Date date = new Date();

        var item = WarmUp.timeConversion("11:05:45PM");
        System.out.println(item);

    }
}
