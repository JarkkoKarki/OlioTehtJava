import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    @Override
    public void start(Stage window) throws Exception {
        Label text = new Label("Search for definitions");
        text.getStyleClass().add("label");

        Label text2 = new Label("definitions");
        text2.getStyleClass().add("label");

        Button button = new Button("Search");
        button.getStyleClass().add("button");

        TextField textField = new TextField();
        textField.getStyleClass().add("text-field");

        FlowPane componentGroup = new FlowPane(10, 10);
        componentGroup.setPadding(new Insets(10));
        componentGroup.getChildren().addAll(text, textField, button);

        VBox componentGroup2 = new VBox(10); // VBox with 10px spacing
        componentGroup2.setPadding(new Insets(20)); // Padding around VBox
        text2.setPadding(new Insets(10));
        componentGroup2.getChildren().addAll(componentGroup, text2);


        Scene view = new Scene(componentGroup2, 600, 400);
        view.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        window.setTitle("Dictionary");
        window.setScene(view);
        window.show();
    }
}