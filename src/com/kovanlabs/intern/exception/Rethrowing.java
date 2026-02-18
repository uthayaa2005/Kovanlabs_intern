package com.kovanlabs.intern.exception;

import java.util.Scanner;

class Value{
    public void add(){
        try(Scanner input = new Scanner(System.in)){
          int  a = input.nextInt();
          int   b = input.nextInt();

            System.out.println(a+b);
        }catch(Exception e){
            System.out.println(e);
            throw new RuntimeException("throw new exception");
        }


    }
}

public class Rethrowing {
    public static void main(String[] args) {

         Value v1 = new Value();

         try{
             v1.add();

         }catch(RuntimeException e){
             System.out.println(e);
         }

        }







    }

