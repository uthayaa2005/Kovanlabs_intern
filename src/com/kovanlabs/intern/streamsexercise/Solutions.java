package com.kovanlabs.intern.streamsexercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solutions{

    public void  sumOfNumbers(List<Integer> numbers){

        int sum = numbers.stream().
                mapToInt(x->x)
                .sum();
        System.out.println("sum of all number in the list : "+sum);

    }

    public void evenNumbers(List<Integer> numbers){
        int[] arr = numbers.stream()
                .filter(n -> n%2 ==0)
                .mapToInt(n->n)
                .toArray();
        System.out.print("even numbers in the list : ");
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public void oddnumbers(List<Integer> numbers){
        int arr[] =  numbers.stream()
                .filter(n -> n%2 != 0)
                .mapToInt(n->n)
                .toArray();
        System.out.print("odd numbers in the list : ");
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public void howManyElements(List<Integer> numbers){
        long count = numbers.stream()
                .count();

        System.out.println("how many elements in the list : "+count);
    }

    public void letterStarting(List<String> names){

        String[] arr  = names.stream()
                .filter(s -> s.toUpperCase().startsWith("A"))
                .toArray(size -> new String[size]);
        System.out.print("letter starting with A in the list : ");
        for(String s : arr){
            System.out.print(s+" ");
        }
        System.out.println();


    }

    public void groupElements(List<String> names){

        String[] arr = names.stream()
                .filter(s -> s.length() > 3)
                .toArray(size -> new String[size]);
        System.out.print("group elements in the list : ");
        for(String s : arr){
            System.out.print(s+" ");
        }
        System.out.println();
    }


}
