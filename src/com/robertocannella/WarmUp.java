package com.robertocannella;

import java.util.List;

public class WarmUp {
    public static int simpleArraySum(List<Integer> ar) {

        var sum = 0;
        for(var item: ar)
            sum += item;

        return sum;
    }
}
