package com.kovanlabs.intern.enums;

enum OrderState{
    NEW{
        @Override
        OrderState next() {
            return PROCESSING;
        }
    },

    PROCESSING {

        @Override
         OrderState next(){
            return SHIPPED;
        }

    },
    SHIPPED {
        @Override
        OrderState next(){
            return DELIVERED;
        }
    },
    DELIVERED {
        @Override
        OrderState next(){
            throw new IllegalStateException("the order already delivered");
        }
    };

     abstract OrderState next();

}

class Order{

    private OrderState state = OrderState.NEW;

    public OrderState getState() {
        return state;
    }

    public  void moveNext(){
        state =  state.next();
    }
}

public class StateMachine {

    public static void main(String[] args) {

        Order order = new Order();

        System.out.println(order.getState());
        order.moveNext();
        System.out.println(order.getState());
        order.moveNext();
        System.out.println(order.getState());
        order.moveNext();
        System.out.println(order.getState());
        order.moveNext();
        System.out.println(order.getState());


    }
}
