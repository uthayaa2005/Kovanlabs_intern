package com.kovanlabs.intern.streamsexercise;

import java.util.List;

public class FindTheSum {

    public static void main(String[] args) {

        List<Integer> list  = List.of(1,3,5,2,1);

      int sum =  list.stream()
                .mapToInt(Integer::intValue)
                .sum();

System.out.println(sum);
    }
}
