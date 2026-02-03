package com.kovanlabs.intern.string;

public class TextScrubber {

    public static void main(String[] args) {



        String s ="H3ll0 W0rld! Th1s is J4v4.";

        String output2 = s.replaceAll("[\\p{Punct}]","");

      String output =  output2.replaceAll("\\d","*");



        System.out.println(output);
    }
}
