package org.academiadecodigo.HackStreetBoys.TeamBrian;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {
    public static void main(String[] args) {
        GameFrame gameframe = new GameFrame();

        gameframe.build();


        Snake snake = new Snake();
        //snake.createSnake();


        snake.spawn();

        Position position = new Position();
        position.setSnakedemo(snake);
        position.init();

    }

}