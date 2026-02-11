package com.kovanlabs.intern.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class NewFunction{

    void removeLast(ArrayList<String> name){
        if(name.size()>0){
            name.remove(name.size()-1);
        }else{
            System.out.println("list is empty");
        }
    }
}

public class Arraylist {

    public static void main(String[] args) {

        NewFunction nf = new NewFunction();

        ArrayList<String> name = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

       while(true){
           String s = sc.nextLine();

           if(s.equals("exit")){
               break;
           }
           name.add(s);
       }

//       name.set(4,"thor");
//       name.set(1,"naveen");
//       name.remove(3);

//        int n = name.size();
//        System.out.println(n);

        nf.removeLast(name);

        Iterator<String> it = name.iterator();

        while(it.hasNext()) {
            String s = it.next();

            if (s.equals("uthayaaa")) {
                it.remove();
            } else{
                System.out.println(s);
        }
        }
    }
}
