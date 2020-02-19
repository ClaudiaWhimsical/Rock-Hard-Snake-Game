package org.academiadecodigo.HackStreetBoys.TeamBrian;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import javax.swing.*;

public class GameFrame extends JPanel {

    private int width, height;
    private char[][] boardMatrix;
    Rectangle rectangle;
    /*
    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.boardMatrix = new char[this.height][this.width];
    }
    */
    public void build(){
        rectangle = new Rectangle(10,10, 600,600);
        rectangle.draw();
    }



}