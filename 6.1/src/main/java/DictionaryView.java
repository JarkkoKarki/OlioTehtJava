import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controller;

    @Override
    public void start(Stage window) throws Exception {
        controller = new DictionaryController();
        Label text = new Label("Search for definitions");
        Label text2 = new Label("definition");
        Label text3 = new Label("Add word: ");
        Label text4 = new Label();
        Label text5= new Label();

        Button button = new Button("Search");
        TextField textField = new TextField();
        TextField textField1 = new TextField("Word");
        TextField textField2 = new TextField("Definition");
        Button button2 = new Button("Send");

        FlowPane componentGroup3 = new FlowPane(10, 10);
        componentGroup3.setPadding(new Insets(50));
        componentGroup3.getChildren().addAll(text3, textField1, textField2, button2, text4);

        FlowPane componentGroup4 = new FlowPane(10, 10);
        componentGroup4.setPadding(new Insets(10));
        componentGroup4.getChildren().add(text5);

        FlowPane componentGroup = new FlowPane(10, 10);
        componentGroup.setPadding(new Insets(10));
        componentGroup.getChildren().addAll(text, textField, button);

        VBox componentGroup2 = new VBox(10);
        componentGroup2.setPadding(new Insets(20));
        text2.setPadding(new Insets(10));
        componentGroup2.getChildren().addAll(componentGroup, text2);

        FlowPane bottomPanel = new FlowPane(10, 10);
        bottomPanel.setPadding(new Insets(10));
        bottomPanel.getChildren().add(componentGroup3);

        text5.getStyleClass().add("keys");
        BorderPane mainLayout = new BorderPane();
        mainLayout.setTop(componentGroup2);
        mainLayout.setCenter(componentGroup4);
        mainLayout.setBottom(bottomPanel);
        mainLayout.getStyleClass().add("root");

        Scene view = new Scene(mainLayout, 600, 500);
        view.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        text5.setText(controller.getWords());
        window.setTitle("Dictionary");
        window.setScene(view);
        window.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!textField.getText().isBlank()) {
                    String word = textField.getText();
                    String definition = controller.handleSearch(word);
                    text2.setText(definition);
                } else {
                    text2.setText("Write a word");
                }
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!textField1.getText().isBlank() && !textField2.getText().isBlank()) {
                    String word = textField1.getText();
                    String definition = textField2.getText();
                    controller.handleAdd(word, definition);
                    text4.setText("Word added");
                    text5.setText(controller.getWords());
                } else {
                    text4.setText("Write a word and a definition");
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}