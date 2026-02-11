package com.kovanlabs.intern.rpgbattlesystem;



abstract class Character {

    String name;
    int  health;
    int  strength;

    Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

   abstract void attack(Character enemy);


    boolean isAlive(){
        return health >0;
    }
    void takeDamage(int damage){
        health = health - damage;
        if(health < 0){
            health = 0;
        }
    }
}

class Warrior extends Character {

    Warrior(String name){
        super(name,120,15);
    }

    @Override
    void attack(Character enemy){
        int damage =  strength - (int)(Math.random()*5);
        System.out.println(name + " hits damage "+ damage);

        enemy.takeDamage(damage);
    }
}

class Mage extends   Character {

    Mage (String name){
        super(name,100,25);
    }
    @Override
    void attack(Character enemy){

        int damage =  strength - (int)(Math.random()*5);

        System.out.println(name + " hits damage " + damage);
        enemy.takeDamage(damage);


    }
}

class Rouge  extends Character {
    Rouge(String name){
        super(name,100,18);
    }
    @Override
    void attack(Character enemy){
        int damage =  strength - (int)(Math.random()*5);
       System.out.println(name + " hits damage " + damage);
       enemy.takeDamage(damage);

    }
}

class Arena {

    static void fight (Character p1, Character p2){
        System.out.println("Fight starts");

        while(p1.isAlive() && p2.isAlive()){

            p1.attack(p2);

            System.out.println(p2.name +" health : "+p2.health);

            if(!p2.isAlive()) break;

            p2.attack(p1);
            System.out.println(p1.name +" health : "+p2.health);
            
            }

        System.out.println("Fight ends");

        if(p1.isAlive()){
            System.out.println("winner "+p1.name);
        }else{
            System.out.println("winner "+p2.name);
        }
        }
    }


public class RpgBattleSystem{
    public static void main(String[] args) {

        Character p1 = new Warrior("Thor");
        Character p2 = new Mage("Ironman");

        Arena.fight(p1,p2);
    }

}
