package com.kovanlabs.intern.oops;

interface Engine{
    void start();
}

class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine started");
    }
}

class DeveloperEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Developer Engine started");
    }
}

class Boat{
    public Engine engine;

    public Boat(Engine engine){
        this.engine = engine;
    }

    void drive(){
        engine.start();
        System.out.println("Boat moves");
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();
        Boat boat = new Boat(engine);

        boat.drive();
    }
}
