package com.kovanlabs.intern.streamsexercise;

import java.util.ArrayList;
import java.util.List;

public class Greater10 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,31,51,22,10);

        int[] arr = list.stream()
                .filter(n -> n>10)
                .mapToInt(Integer::intValue)
                .toArray();

        for(int n : arr){
            System.out.print(n +" ");
        }
    }
}
