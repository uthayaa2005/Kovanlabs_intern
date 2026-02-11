package com.kovanlabs.intern.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        int n = 10_000_000;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(i);
        }

        long startTime = System.nanoTime();

        int mid = list.get(n/2);

        long endTime = System.nanoTime();

        System.out.println("Ending time for mid: " + (endTime - startTime));


        // LinkedList

        LinkedList<Integer> list1 = new LinkedList<>();


        for(int i=0;i<list.size();i++){
            list1.add(i);
        }

        long start1 = System.nanoTime();
        int mid1 = list1.get(n/2);
        long end1 = System.nanoTime();

        System.out.println("Ending time for mid1: " + (end1 - start1));


    }
}
