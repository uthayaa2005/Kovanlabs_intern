package com.kovanlabs.intern.string;

public class Engima {

    public static  String encrypt(String message , int key){

        StringBuilder s = new StringBuilder();

        for(char ch : message.toCharArray()){
            s.append((char) (ch ^ key));
        }

        return s.toString();

    }

    public static String decrypt(String chiper , int key){
        StringBuilder s = new StringBuilder();

        for(char ch : chiper.toCharArray()){
            s.append((char) (ch ^ key));
        }
        return s.toString();
    }

    public static void main(String[] args) {

        String s = "uthayaaaaa";
        int key  = 10;

        String encrypted = encrypt(s,key);
        String decrypted = decrypt(encrypted,key);


        System.out.println(encrypted);
        System.out.println(decrypted);


    }
}
