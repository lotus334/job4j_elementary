package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        WolfForBall wolf = new WolfForBall();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.eat(ball);
    }
}
