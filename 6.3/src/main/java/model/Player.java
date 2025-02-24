package model;

import utils.Direction;

public class Player {
    private double x;
    private double y;
    public static final int GRID_SIZE = 20;

    public Player(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP:
                if (y >= 1) {
                    y -= 0.1;
                }
                break;
            case DOWN:
                if (y < GRID_SIZE - 1) {
                    y += 0.1;
                }
                break;
            case LEFT:
                if(x >= 1) {
                    x -= 0.1;
                }
                break;
            case RIGHT:
                if (x < GRID_SIZE-1) {
                    x += 0.1;
                }
                break;
        }
        System.out.println("Player moved to" );
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getGridSize() {
        return GRID_SIZE;
    }
}
