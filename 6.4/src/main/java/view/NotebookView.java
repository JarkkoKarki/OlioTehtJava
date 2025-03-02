package view;

import controller.NotebookController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.scene.text.Text;
import model.Note;

public class NotebookView extends Application {

    @FXML
    private Button openButton;

    @FXML
    private Button addButton;

    @FXML
    private TextField Text;

    @FXML
    private TextField noteTextField;

    @FXML
    private TextField Title;

    private Scene initialScene;

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("/notebook.fxml"));
            fxml.setController(this);
            initialScene = new Scene(fxml.load());
            NotebookController controller = new NotebookController();



            stage.setTitle("Notebook");
            stage.setScene(initialScene);
            stage.show();
            openButton.setOnAction(event -> { //OPEN
                try {
                    String note = noteTextField.getText();
                    if (controller.showNotes().equals(note)) System.out.println("Löytyi"); //DEBUG
                    FXMLLoader fxml1 = new FXMLLoader(getClass().getResource("/note.fxml"));
                    Scene noteScene = new Scene(fxml1.load());
                    stage.setScene(noteScene);
                    TextArea title = (TextArea) noteScene.lookup("#Title");
                    TextArea text = (TextArea) noteScene.lookup("#Text");  // HAETAAN TIEDOT
                    title.setText(controller.getTitle(note));
                    text.setText(controller.getText(note));
                    stage.show(); // TUODAAN TIEDOT

                    Button saveButton = (Button) noteScene.lookup("#saveButton");  // TALLENNUS
                    saveButton.setOnAction(actionEvent -> {
                        String titleText = title.getText();
                        String textText = text.getText();
                        controller.deleteOld(titleText);
                        controller.handleSave(titleText, textText);
                        Text text1 = (Text) initialScene.lookup("#show");
                        text1.setText(controller.showNotes());

                        stage.setScene(initialScene);
                        stage.show();
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });



            addButton.setOnAction(event -> {
                try {
                    FXMLLoader fxml1 = new FXMLLoader(getClass().getResource("/note.fxml"));
                    Scene noteScene = new Scene(fxml1.load());
                    stage.setScene(noteScene);
                    stage.show();

                    Button saveButton = (Button) noteScene.lookup("#saveButton");
                    saveButton.setOnAction(actionEvent -> {
                        TextArea title = (TextArea) noteScene.lookup("#Title");
                        TextArea text = (TextArea) noteScene.lookup("#Text");
                        controller.handleSave(title.getText(), text.getText());
                        Text text1 = (Text) initialScene.lookup("#show");
                        text1.setText(controller.showNotes());


                        stage.setScene(initialScene);
                        stage.show();
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}