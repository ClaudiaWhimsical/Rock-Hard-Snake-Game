package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.hackstreetboys.Controls;

public class Snake {


    private double x = 20;
    private double y = 20;
    Ellipse snake = new Ellipse(x, y, 20, 20);
    private GameFrame rectangle;

    //Ellipse snake1 = new Ellipse(50, 180, 30, 30);
    //Ellipse snake2 = new Ellipse(50, 210, 30, 30);

    public void createSnake() {
        snake.setColor(Color.BLUE);
        snake.fill();


        //snake1.setColor(Color.BLUE);
        //snake1.fill();
        //snake2.setColor(Color.BLUE);
        //snake2.fill();
    }


    private Picture snakedemo;
    private Picture apple;

    public void spawn() {
        //snakedemo = new Picture(90, 90, "snakedemo.png");
        //snakedemo.grow(0, 20);
        //snakedemo.draw();
        apple = new Picture(50, 50, "apple.png");
        apple.grow(10, 10);
        apple.draw();
    }


    public void moveRight() {
        if (snake.getX() >= 0 && snake.getX() <= 590) {
            snake.translate(10, 0);
        }
        //snake1.translate(10,0);
        //snake2.translate(10,0);
        System.out.println(snake.getX());
    }

    public void moveLeft() {
        if (snake.getX() >= 11 && snake.getX() <= 590) {
            snake.translate(-10, 0);
            //snake1.translate(-10,0);
            //snake2.translate(-10,0);
            System.out.println(snake.getX());
        }
    }


    public void moveUp() {
        if (snake.getY() >= 11 && snake.getY() <= 590){
            snake.translate(0, -10);
            System.out.println(snake.getY());
        }
        //snake1.translate(0,-10);
        //snake2.translate(0,-10);
    }


    public void moveDown(){
        if (snake.getY() >= 11 && snake.getY() <= 590){
            snake.translate(0, 10);
            System.out.println(snake.getY());}
        //snake1.translate(0,10);
        //snake2.translate(0,10);
    }
}





