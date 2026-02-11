package com.kovanlabs.intern.enums;


enum Level{
    BEGINNER("you in the starting stage") , INTERMIDIATE("you are in the half of the stage") , ADVANCED("you are in the advanced stage like high stage");

    private String abbr;
    Level(String abr){
        abbr = abr;
    }
    public String getAbber(){
        return abbr;
    }

}

public class EnumsLevel {

    public static void main(String[] args) {

        Level level1 = Level.INTERMIDIATE;
        Level level2 = Level.ADVANCED;


        System.out.println(level1.getAbber()+" and after that  "+level2.getAbber());
    }
}
