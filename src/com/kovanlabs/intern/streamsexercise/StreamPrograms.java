package com.kovanlabs.intern.streamsexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/*        🟢 Level 1 – Very Basic

Given a list of integers, print all elements using Streams.

Given a list of integers, filter and print only even numbers.

Given a list of integers, filter numbers greater than 10.

Given a list of strings, print all strings that start with the letter A.

Given a list of strings, convert all strings to uppercase.

Given a list of integers, count how many elements are present.

        🟡 Level 2 – Beginner + Logic

Given a list of integers, find the sum of all elements using Streams.

Given a list of integers, find the maximum value.

Given a list of integers, find the minimum value.

Given a list of strings, find the length of each string and print them.

Given a list of integers, remove duplicate elements.

Given a list of strings, sort them in ascending order.

Given a list of integers, sort them in descending order.

🟠 Level 3 – Using map, filter, collect

Given a list of integers, create a new list containing squares of each number.

Given a list of integers, filter odd numbers and store them in a new list.

Given a list of strings, filter strings whose length is greater than 5.

Given a list of integers, multiply each element by 2 and collect into a new list.

Given a list of strings, remove empty strings.

🔵 Level 4 – Slightly Advanced Basics

Given a list of integers, find the first element greater than 50.

Given a list of integers, check if all numbers are positive.

Given a list of integers, check if any number is divisible by 5.

Given a list of strings, join all strings into a single comma-separated string.

Given a list of integers, skip the first 3 elements and print the rest.

Given a list of integers, limit the stream to the first 5 elements.

🟣 Level 5 – Realistic Beginner Problems

Given a list of employees’ salaries (integers), filter salaries greater than 30,000 and sort them.

Given a list of student marks, find the average marks.

Given a list of strings representing names, find the longest name.

Given a list of integers, group numbers into even and odd.

Given a list of words, count how many words have more than 3 characters.

Given a list of integers, find the second highest number using Streams.*/


public class StreamPrograms {



    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<String> names = List.of("uthayaaa", "Apple","Ant","Arrow","anime");
        Solutions sum = new Solutions();
        sum.sumOfNumbers(numbers);
        sum.evenNumbers(numbers);
        sum.oddnumbers(numbers);
        sum.howManyElements(numbers);
        sum.letterStarting(names);
        sum.groupElements(names);






    }
}
