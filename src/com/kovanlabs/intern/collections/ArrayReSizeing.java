package com.kovanlabs.intern.collections;

class MyStack<T>{
    Object[] arr;
    int capacity;
    int top;
    MyStack(){
        capacity=5;
        arr=new Object[capacity];
        top= -1;
    }

    void push(T value){
        if(top==capacity-1){
            resize();
        }
        arr[++top]=value;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    T pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        }
        return (T) arr[top--];
    }

    T peek(){
        if(isEmpty()) return null;
        return (T) arr[top];
    }

    void resize(){
        capacity =capacity*2;
        Object[] newArr = new Object[capacity];
        for(int i=0;i<=top;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
        System.out.println("Stack Expanded = "+ capacity);
    }
    void printStack(){
        for (int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
public class ArrayReSizeing {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.pop();
        myStack.push(10);
        myStack.push(50);
        myStack.push(52);
        myStack.push(55);
        myStack.push(78);
        myStack.push(44);
        myStack.pop();
        myStack.push(47);
        myStack.printStack();

    }
}
