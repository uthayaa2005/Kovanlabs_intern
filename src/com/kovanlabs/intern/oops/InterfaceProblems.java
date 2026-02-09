package com.kovanlabs.intern.oops;


interface Students{
   default void goToClass(){
       System.out.println("Student must go to class");
   }
}
interface Teachers{
   default void goToClass(){
       System.out.println("Teacher not must go to class");

   }
class  School implements Students , Teachers {
       @Override
    public void goToClass(){
           System.out.println("Student must go to class");
       }
}
}
public class InterfaceProblems {

    public static void main(String[] args) {
        Teachers t = new Teachers.School();

        t.goToClass();
    }
}
