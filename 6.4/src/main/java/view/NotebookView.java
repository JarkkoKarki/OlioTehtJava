package view;

import controller.NotebookController;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.List;

import javafx.scene.text.Text;
import model.Note;

public class NotebookView extends Application {

    @FXML
    private Button addButton;

    @FXML
    private TextField Text;

    @FXML
    private TextField noteTextField;

    @FXML
    private TextField Title;

    private Scene initialScene;

    @FXML
    private ListView<String> listView;

    @FXML
    private Button openButton;

    String[] notes;

    String current;


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


            listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    current = listView.getSelectionModel().getSelectedItem();

                }
            });

            openButton.setOnAction(event -> {
                List<Note> notes = controller.getNotes();
                for (Note n : notes) {

                    if (n.getTitle().equals(current)) {
                        try {
                            FXMLLoader fxml1 = new FXMLLoader(getClass().getResource("/note.fxml"));
                            Scene noteScene = new Scene(fxml1.load());
                            stage.setScene(noteScene);
                            TextArea title = (TextArea) noteScene.lookup("#Title");
                            TextArea text = (TextArea) noteScene.lookup("#Text");  // Haetaan noten tiedot
                            title.setText(controller.getTitle(current)); // Siirretään noten tiedot
                            text.setText(controller.getText(current));
                            stage.show(); // TUODAAN TIEDOT




                            Button saveButton = (Button) noteScene.lookup("#saveButton");  // TALLENNUS
                            saveButton.setOnAction(actionEvent -> {
                                if (current!=null) {
                                    String titleText = title.getText();
                                    String textText = text.getText();
                                    controller.deleteOld(titleText);
                                    controller.handleSave(titleText, textText);

                                    stage.setScene(initialScene);
                                    stage.show();
                                }
                            });
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
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
                        listView.getItems().addAll(title.getText());

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