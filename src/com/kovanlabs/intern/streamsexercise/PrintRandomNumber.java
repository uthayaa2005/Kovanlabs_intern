package com.kovanlabs.intern.streamsexercise;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;

public class PrintRandomNumber {

    public static void main(String[] args) {

        Random random = new Random();

        IntSummaryStatistics value = random.ints(100,1,300).summaryStatistics();

         System.out.println(value.getMin());
         System.out.println(value.getMax());
         System.out.println(value.getSum());
         System.out.println(value.getAverage());

    }
}
