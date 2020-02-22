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
    private int direction;



    // 0 - direction right, 1 - direction down, 2 - direction left, 3 - direction up

    //Ellipse snake1 = new Ellipse(50, 180, 30, 30);
    //Ellipse snake2 = new Ellipse(50, 210, 30, 30);

    public boolean insideRectangle() {
        return (snake.getX() >= 0 && snake.getX() <= 590) && (snake.getY() >= 11 && snake.getY() <= 590);
    }

    public void setUp() {
        direction = 3;
    }

    public void setDown() {
        direction = 1;
    }

    public void setLeft() {
        direction = 2;
    }

    public void setRight() {
        direction = 0;
    }

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
        apple = new Picture(50, 50, "resources/apple.png");
        apple.grow(10, 10);
        apple.draw();
    }

    public void moveSnake() {
        switch (direction) {


            case 0:
            if (snake.getX() >= 0 && snake.getX() <= 590) {
                snake.translate(10, 0);
            }
            //snake1.translate(10,0);
            //snake2.translate(10,0);
            System.out.println(snake.getX());
            break;


            case 2:
                if (snake.getX() > 12 && snake.getX() < 590) {
                    snake.translate(-10, 0);
                    //snake1.translate(-10,0);
                    //snake2.translate(-10,0);
                    System.out.println(snake.getX());
                    break;
                }



            case 3:
                if (snake.getY() >= 11 && snake.getY() <= 590) {
                    snake.translate(0, -10);
                    System.out.println(snake.getY());
                    break;
                }
                //snake1.translate(0,-10);
                //snake2.translate(0,-10);



            case 1:
                if (snake.getY() >= 11 && snake.getY() <= 590) {
                    snake.translate(0, 10);
                    System.out.println(snake.getY());
                    break;
                }
                //snake1.translate(0,10);
                //snake2.translate(0,10);
            }
        }
    }






