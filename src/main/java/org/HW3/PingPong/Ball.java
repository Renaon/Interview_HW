package org.HW3.PingPong;

public class Ball {
    int kicks = 0;
    static Ball instance = new Ball();
    String side = "";

    static Ball getBall() {
        return instance;
    }

    synchronized void kick(){
        kicks++;
        if (!(kicks%2==0)) System.out.println("ping");
        else System.out.println("pong");
    }

    String getSide(){
        return side;
    }

    boolean isInGame(){
        return  (kicks <10);
    }
}
