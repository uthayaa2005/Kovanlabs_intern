package com.kovanlabs.intern.oops;


interface Phone{
void call(String number);

}
interface MusicPlayer{
    void start();

}
interface Camera{

    void start();

}

class Smartphone implements Phone , MusicPlayer, Camera{

    @Override
    public void start() {
        System.out.println("Camera and musicplayer on");

    }
    @Override
    public void call(String number) {
        System.out.println("Calling to  "+number);
    }


    public void startCamera(){
        System.out.println("Camera  on");
    }

    public void startMusicPlayer(){
        System.out.println("Musicplayer on");
    }


}


public class ConflictProblem {
    public static void main(String[] args) {

        Camera cm = new Smartphone();
        cm.start();

        Phone ph = new Smartphone();
        ph.call("6369714414");

        Smartphone ss = new Smartphone();
        ss.startMusicPlayer();
    }
}
