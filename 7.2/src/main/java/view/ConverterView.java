package view;

import application.CurrencyApp;
import controller.ConverterController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ConverterView extends Application {
    @Override
    public void start(Stage window) throws Exception {
        ConverterController controller = new ConverterController();
        CurrencyApp cur = new CurrencyApp();
        Button button = new Button("Convert");

        Label label1 = new Label("Amount to convert");
        Label label2 = new Label("Converted amount");
        Label label3 = new Label("0");
        TextField text1 = new TextField();
        Label errorLabel = new Label("407");
        errorLabel.setStyle("-fx-text-fill: red;");

        ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
        choiceBox1.getItems().addAll("EUR", "USD", "GBP");
        choiceBox1.setValue("EUR");

        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.getItems().addAll("EUR", "USD", "GBP");
        choiceBox2.setValue("USD");

        text1.addEventFilter(javafx.scene.input.KeyEvent.KEY_TYPED, event -> {
            if (!event.getCharacter().matches("\\d*")) {
                event.consume();
            }
        });

        button.setOnAction(event -> {
            try {
                double amount = Double.parseDouble(text1.getText());
                String selection1 = choiceBox1.getValue();
                String selection2 = choiceBox2.getValue();
                double result = controller.handleSelection(amount, selection1, selection2);
                if (result == 0.0) {
                    errorLabel.setText("Error: Rate not found");
                } else {
                    errorLabel.setText("");
                }
                label3.setText(String.valueOf(result));
            } catch (Exception e) {
                errorLabel.setText("Error: Unable to connect to database");
            }
        });
        VBox vbox1 = new VBox(label1, text1, label2);
        VBox vbox2 = new VBox(label2, label3, choiceBox2, button);
        VBox vbox3 = new VBox(choiceBox1);
        BorderPane top = new BorderPane();
        BorderPane bottom = new BorderPane();
        BorderPane center = new BorderPane();
        top.setTop(vbox1);
        bottom.setBottom(vbox2);
        center.setCenter(vbox3);

        VBox.setMargin(label1, new Insets(40, 10, 10, 10));
        VBox.setMargin(text1, new Insets(10));
        VBox.setMargin(label2, new Insets(60, 10, 10, 10));
        VBox.setMargin(label3, new Insets(10));
        VBox.setMargin(choiceBox1, new Insets(10));
        VBox.setMargin(choiceBox2, new Insets(10, 10, 60, 10));
        VBox.setMargin(button, new Insets(10, 10, 40, 10));
        VBox.setMargin(errorLabel, new Insets(10, 10, 10, 10));

        VBox layout = new VBox();
        layout.getChildren().addAll(top, center, bottom, errorLabel);
        layout.getStyleClass().add("layout");

        window.setTitle("Currency Converter");
        Scene scene = new Scene(layout, 400, 500);
        scene.getStylesheets().add("/style.css");
        window.setScene(scene);
        window.show();
    }
}