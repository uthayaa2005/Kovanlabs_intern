package com.kovanlabs.intern.enums;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String response = input.nextLine().toUpperCase();

        try {
            DaySelect day = DaySelect.valueOf(response);

            switch (day) {
                case MONDAY , TUSDAY ,WEDNESDAY ,THURSDAY ,FRIDAY -> System.out.println("IT IS A WEEKDAY");
                case SATURDAY , SUNDAY-> System.out.println("IT IS A WEEKEND");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("in valid input ");
        }
    }
}
