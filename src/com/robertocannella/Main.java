package com.robertocannella;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)  {

        List<Integer> list = new ArrayList<>();

        Random r=new Random();
        //generate random list
        int size = 5;

        for (int j = 0; j < size; j++)
            list.add(r.nextInt(100));



        System.out.println(list);
        var item = Implementation.gradingStudents(list);
        System.out.println(item);


    }
}
