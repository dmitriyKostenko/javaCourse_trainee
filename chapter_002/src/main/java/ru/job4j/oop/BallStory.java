package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        ball.runFromHome();
        wolf.tryEat(ball);
        ball.runFromHare();
        fox.tryEat(ball);
        ball.runFromWolf();
        fox.eat(ball);
    }
}
