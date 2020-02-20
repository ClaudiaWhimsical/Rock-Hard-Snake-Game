package org.academiadecodigo.HackStreetBoys.TeamBrian;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


import java.awt.*;

public class GameFrame extends GridLayout {
    //TODO: Instantiate the rectangle and the grid in this class as they both work together in your game.

    private int width = 600;
    private int height = 600;
    private Rectangle rectangle;
    private int rows = 30;
    private int cols = 30;
    private int padding = 10;

    public Object buildGameFrame() {

        rectangle = new Rectangle(padding, padding, width, height);
        rectangle.setColor(Color.WHITE);
        rectangle.fill();

        Grid grid = new Grid();
        return grid;
    }

    public class Grid extends GridLayout {

        public GridLayout makeGrid() {
            return new GridLayout(rows, cols, 0, 0);
        }

        @Override
        public int getColumns() {
            return super.getColumns();
        }

        public int getRows() {
            return super.getRows();
        }

        public void setColumns(int number) {
            super.setColumns(number);

        }
        public void setRows (int number){
            super.setRows(number);}
    }
}
