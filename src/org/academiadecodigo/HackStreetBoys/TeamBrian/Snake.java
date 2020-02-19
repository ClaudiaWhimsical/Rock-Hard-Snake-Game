package org.academiadecodigo.HackStreetBoys.TeamBrian;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Snake {

    public void createSnake() {

        Ellipse snake = new Ellipse(50, 50, 150, 130);
        snake.setColor(Color.ORANGE);
        snake.fill();
    }

    private Picture snakedemo;

    public void spawn() {
        snakedemo = new Picture(90, 90, "resources/snakedemo.png");
        snakedemo.grow(0, 20);
        snakedemo.draw();
    }

    public void moveRight(){
        snakedemo.translate(10,0);
        System.out.println("DIREITA!");
    }

    public void moveLeft(){
        snakedemo.translate(-10,0);
        System.out.println("ESQUERDA!");
    }

    public void moveUp(){
        snakedemo.translate(0,-10);
    }

    public void moveDown(){
        snakedemo.translate(0,10);
    }
}

