package com.kovanlabs.intern.streamsexercise;

import java.util.List;

public class StartWithString {

    public static void main(String[] args) {

        List<String> list = List.of("uthayaa","Apple","Ant");

        list.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);


    }
}
