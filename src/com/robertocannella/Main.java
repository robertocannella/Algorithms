package com.robertocannella;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        var matrix = WarmUp.generateRandomMatrix(4);

        for(var list: matrix)
            System.out.println(list);
        System.out.println(WarmUp.diagonalDifference(matrix));

    }
}
