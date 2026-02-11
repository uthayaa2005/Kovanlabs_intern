package com.kovanlabs.intern.oops;

class  CoffeeMachine{
    void prepareCoffee(){
        System.out.println("CoffeeMachine on");
    }
}

class Coffee extends CoffeeMachine{
    private CoffeeMachine coffeeMachine;

    Coffee(CoffeeMachine coffeeMachine){

        this.coffeeMachine = coffeeMachine;
    }

    void CoffeeReady(){
        coffeeMachine.prepareCoffee();
        System.out.println("Coffee ready");
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
     CoffeeMachine coffeeMachine = new CoffeeMachine();

     Coffee coffee = new Coffee(coffeeMachine);

     coffee.CoffeeReady();

    }
}
