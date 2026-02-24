package com.kovanlabs.intern.collections;

import java.util.ArrayList;
import java.util.List;
 class Wild{
    public void add(List<? extends Number> list , List<? super Number> list2){
        for(Number n : list){
            list2.add(n);
        }

        System.out.println(list2);
    }
}

public class WildCardsmethods {


    public static void main(String[] args) {

        List<? extends Number> list = List.of(1, 2, 3.44, 4, 5.88, 6, 7, 8, 9.0, 10);
        List<? super Number > list2 = new ArrayList<>();

        Wild wild = new Wild();
        wild.add(list, list2);

    }

}
