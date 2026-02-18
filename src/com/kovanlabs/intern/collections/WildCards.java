package com.kovanlabs.intern.collections;
import java.util.List;
public class WildCards {




        public static double sumList(List<? extends Number> list) {
            double sum = 0;

            for (Number n : list) {
                sum += n.doubleValue();
            }

            return sum;
        }

        public static void main(String[] args) {

            List<Integer> intList = List.of(10, 20, 30);
            List<Double> doubleList = List.of(10.5, 20.5, 30.5);

            System.out.println(sumList(intList));    // 60.0
            System.out.println(sumList(doubleList)); // 61.5
        }
    }


