package com.kovanlabs.intern.lambda;

import java.util.List;
import java.util.function.Predicate;

public class PredicateWorking {

    public static void main(String[] args) {

//        Predicate<Integer> isEven = n -> n % 2 == 0;
//
//        System.out.println(isEven.test(4));
//        System.out.println(isEven.test(23));

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(n -> n%2 ==0)
//                .forEach(n -> System.out.println(n))
               .forEach(System.out::println);



    }
}
