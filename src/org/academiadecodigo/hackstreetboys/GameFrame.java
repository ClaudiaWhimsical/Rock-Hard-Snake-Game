package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import javax.swing.*;

public class GameFrame extends JPanel {

    private int width, height;
    private char[][] boardMatrix;
    Rectangle rectangle;
    Ellipse fruit = new Ellipse(90,140,20,20);

    /*
    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.boardMatrix = new char[this.height][this.width];
    }
    */
    public void build(){
        rectangle = new Rectangle(10,10, 600,600);
        rectangle.setColor(Color.GRAY);
        rectangle.draw();
        rectangle.fill();
    }

    public void createFruit(){
        fruit.setColor(Color.RED);
        fruit.fill();

    }

    public boolean fruitInCanvas() {
        return true;

    }

    @Override
    public int getWidth() {
        return width;
    }
}