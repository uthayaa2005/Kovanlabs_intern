package com.kovanlabs.intern.rpgbattlesystem;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

abstract class Character implements Serializable {

    private static final long serialVersionUID = 1L;

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

    public String getStatus() {
        return null;
    }
}

class Warrior extends Character {
    private static final long serialVersionUID = 1L;

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
    private static final long serialVersionUID = 1L;

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
    private static final long serialVersionUID = 1L;
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

    static void fight(Character p1, Character p2) {

        System.out.println("Fight starts");

        while (p1.isAlive() && p2.isAlive()) {

            p1.attack(p2);
            System.out.println(p2.name + " health : " + p2.health);

            if (!p2.isAlive()) break;

            p2.attack(p1);
            System.out.println(p1.name + " health : " + p1.health);
        }

        System.out.println("Fight ends");

        if (p1.isAlive()) {
            System.out.println("Winner: " + p1.name);
        } else {
            System.out.println("Winner: " + p2.name);
        }
    }
}


class GameStorage {

    private static final Path path = Paths.get("player.dat");

    public static void save(Character character) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(Files.newOutputStream(path))) {

            oos.writeObject(character);
            System.out.println("Game Saved");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Character load() {
        if (Files.notExists(path)) {
            System.out.println("Save file not found");
            return null;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(Files.newInputStream(path))) {

            System.out.println("Game Loaded");
            return (Character) ois.readObject();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



public class RpgBattleSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n RPG Battle with Save & Load");
            System.out.println("1. New Game");
            System.out.println("2. Load Game");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    scanner.nextLine();
                    System.out.print("Enter player name: ");
                    String name = scanner.nextLine();

                    Character player = new Warrior(name);
                    Character enemy = new Mage("Enemy Mage");

                    Arena.fight(player, enemy);
                    GameStorage.save(player);
                    break;

                case 2:
                    Character loadedPlayer = GameStorage.load();
                    if (loadedPlayer != null) {
                        System.out.println("Player Status: " + loadedPlayer.getStatus());

                        Character newEnemy = new Mage("Enemy Mage");
                        Arena.fight(loadedPlayer, newEnemy);
                        GameStorage.save(loadedPlayer);
                    }
                    break;

                case 3:
                    System.out.println("Exiting Game");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}




