package com.kovanlabs.intern.streamsexercise;

import java.util.ArrayList;
import java.util.List;

public class HowManyElement {
    public static void main(String[] args) {

//        List<String> list = List.of("uthayaa", "ram","sanjaii");

        List<Integer> list = List.of(1,31,51,22,10);
        long s = list.stream()
                .count();

        System.out.println(s);


    }
}
