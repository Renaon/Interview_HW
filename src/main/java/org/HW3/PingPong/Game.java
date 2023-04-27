package org.HW3.PingPong;

public class Game {
    PingPong p1 = new PingPong("ping");
    PingPong p2 = new PingPong("pong");

    Ball ball;

    Game() {
        ball = Ball.getBall();
    }

    public void startGame() {
        p1.start();
        p2.start();
    }
}
