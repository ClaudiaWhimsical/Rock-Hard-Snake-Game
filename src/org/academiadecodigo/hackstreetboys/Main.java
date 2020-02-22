package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {
    public static void main(String[] args) {
        GameFrame gameframe = new GameFrame();

        gameframe.build();

        Snake snake = new Snake();
        //Snake snake1 = new Snake();
        //Snake snake2 = new Snake();
        snake.createSnake();
        //snake.createSnake1();
        snake.spawn();
        //snake1.spawn();
        //snake2.spawn();


        Controls controls = new Controls();
        controls.setSnake(snake);
        //ontrols.setSnake1(snake1);
        //controls.setSnake2(snake2);
        controls.init();
        //Position position = new Position();
        //position.setSnakedemo(snake);
        //position.init();




    }

}