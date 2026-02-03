package com.kovanlabs.intern.validation;
import java.util.regex.Pattern;



    public class EmailValidation {
        public static void main(String[] args) {



            String regex = "^[A-Za-z0-9_%.+-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,}$";

            Pattern pattern = Pattern.compile(regex);

            String[] emails = {
                    "uthayaa.gmail.com",
                    "uthayaa+@gmail.com",
                    "uthaaa*!@gmail.com",
                    "2343343@gmail.com",
                    "uthayaa+_--efe232@gmail.com",
                    "eefefe@gamil.in",
                    "uthayaa.in@gmail.c"
            };

            for(String email : emails){
                 if(pattern.matcher(email).matches()){
                     System.out.println(email + " = valid");
                 }else{
                     System.out.println(email +" = invalid");
                 }
            }
        }
    }

