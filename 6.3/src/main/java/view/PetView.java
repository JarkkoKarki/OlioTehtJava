package view;

import controller.PetController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Player;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import utils.Direction;
import java.awt.*;
import java.util.Objects;

public class PetView extends Application{
    private static final int CELL_SIZE = 50;
    private Canvas canvas;
    private GraphicsContext gc;
    private PetController controller;
    private Image playerimage;

    @Override
    public void start(Stage stage) {
        controller = new PetController(this);
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;
        canvas = new Canvas(canvasSize, canvasSize);
        gc = canvas.getGraphicsContext2D();

        playerimage = new Image(Objects.requireNonNull(getClass().getResource("/kissu.png")).toExternalForm());


        canvas.setFocusTraversable(true);
        canvas.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();
            Direction direction = getDirectionFromMousePosition(x, y, controller.getPlayerX(), controller.getPlayerY());
            if (direction != null) {
                controller.handleMove(direction);
                updateCanvas(controller.getPlayerX(), controller.getPlayerY());
            }
        });

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, canvasSize, canvasSize);
        stage.setTitle("Pet Game");
        stage.setScene(scene);
        stage.show();
        updateCanvas(controller.getPlayerX(), controller.getPlayerY());
    }

    private Direction getDirectionFromMousePosition(double x, double y, double playerX, double playerY) {
        if (x > playerX * CELL_SIZE + (double) CELL_SIZE / 2) {
            return Direction.RIGHT;
        } else if (x < playerX * CELL_SIZE - (double) CELL_SIZE / 2) {
            return Direction.LEFT;
        } else if (y > playerY * CELL_SIZE + (double) CELL_SIZE / 2) {
            return Direction.DOWN;
        } else if (y < playerY * CELL_SIZE - (double) CELL_SIZE / 2) {
            return Direction.UP;
        } else {
            return null;
        }
    }

    public void updateCanvas(double playerX, double playerY) {
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;
        gc.clearRect(0, 0, canvasSize, canvasSize);
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0, 0, canvasSize, canvasSize);
        double x = playerX * CELL_SIZE;
        double y = playerY * CELL_SIZE;
        gc.drawImage(playerimage,x, y, CELL_SIZE, CELL_SIZE);
    }
}