package com.robertocannella;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Implementation.ListNode list = new Implementation.ListNode();
        list.val = 1;
        list.next = new Implementation.ListNode(2);
//        list.next.next = new Implementation.ListNode(3);
//        list.next.next.next =new Implementation.ListNode(4);

        Implementation.ListNode rest = Implementation.swapPairs(list);
        System.out.println(rest);
    }
}
