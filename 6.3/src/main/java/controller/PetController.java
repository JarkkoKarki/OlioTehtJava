package controller;

import model.Player;
import utils.Direction;
import view.PetView;

public class PetController {
    private Player player;
    private PetView view;

    public PetController(PetView view) {
        this.player = new Player(0,0);
        this.view = view;
    }

    public void handleMove(Direction direction) {
        System.out.println("Move");
        player.move(direction);
        view.updateCanvas(player.getX(), player.getY());
    }

    public double getPlayerX() {
        return player.getX();
    }

    public double getPlayerY() {
        return player.getY();
    }

    public int getGridSize() {
        return player.getGridSize();
    }
}
