package com.kovanlabs.intern.collections;
import java.util.ArrayList;


class MyArrayList<E> extends ArrayList<E> {

    public void  removeEnd(){

        if(!this.isEmpty()){
            this.remove(this.size()-1);
        }else{
            System.out.println("list is empty");
        }
    }

    public void  removeMid(){
        if(!this.isEmpty()){
            this.remove(this.size()/2);
        }else{
            System.out.println("list is empty");
        }
    }
}
public class WriteNewFuntionInArrayList {
    public static void main(String[] args) {
        MyArrayList<String> name = new MyArrayList<>();

        name.add("uthyaaa");
        name.add("joooo");
        name.add("naveen");
        name.add("shyam");

        name.removeEnd();
        name.removeMid();
        System.out.println(name);



    }


}
