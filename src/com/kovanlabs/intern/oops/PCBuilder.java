package com.kovanlabs.intern.oops;

class Processor{
  void run(){
      System.out.println("Processor");
  }

}
class Storage{
void store(){
    System.out.println("Storing");
}
}
class Ram{
    int r = 32;
    void memory(){
        System.out.println(r+" ram in gb");
    }

}
class Compter{

    private Ram ram;
    private Processor processor;
    private Storage storage;

    Compter(Ram ram,Processor processor,Storage storage){
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
    }

    void start(){
        ram.memory();
        processor.run();
        storage.store();
        System.out.println("the computer has been started");
    }

    void ramUpgrade(Ram ram){
         int r = 64;
        this.ram = ram;

        System.out.println(r+" ram in gb");
    }

}
public class PCBuilder {
    public static void main(String[] args) {
        Compter c;
        c = new Compter(new Ram(),new Processor(),new Storage());
        c.start();
        c.ramUpgrade(new Ram());
    }
}
