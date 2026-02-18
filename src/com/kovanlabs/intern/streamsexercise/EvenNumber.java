package com.kovanlabs.intern.streamsexercise;

import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,3,4,2,6);

        int[] arr = list.stream()
                .filter(n -> n%2 == 0)
                .mapToInt(Integer::intValue)
                .toArray();

        for(int n : arr){
            System.out.print(n+" ");
        }

    }
}
