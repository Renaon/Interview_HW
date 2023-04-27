package org.HW3.PingPong;

public class PingPong extends Thread{
    String name;

    public PingPong(String name){
        this.name = name;
    }

    @Override
    public void run() {
        Ball ball = Ball.getBall();
        while (ball.isInGame()) kickBal(ball);
    }

    void kickBal(Ball ball){
        if (!ball.getSide().equals(getName())) ball.kick();
    }
}
