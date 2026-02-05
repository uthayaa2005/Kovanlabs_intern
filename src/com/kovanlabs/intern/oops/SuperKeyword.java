package com.kovanlabs.intern.oops;

  class Server {
      void state(){
          System.out.println("Server is running on base");
      }
  }

  class PaymentServer extends Server{
      @Override
      void  state() {

          System.out.println("PaymentServer is running on base");
          super.state();

      }
  }


public class SuperKeyword {
      public static void main(String[] args) {

          Server s;

          s = new PaymentServer();
          s.state();
      }
}
