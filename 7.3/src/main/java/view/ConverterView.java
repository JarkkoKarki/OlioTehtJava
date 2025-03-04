package view;


import controller.ConverterController;
import entity.Currency;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConverterView extends Application {

    @FXML
    Button convertButton;

    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ChoiceBox<String> choice2;

    @FXML
    private TextField amount;

    @FXML
    private Label result;

    @FXML
    private Button newCurrency;

    @FXML
    private Button addCurrency;

    @FXML
    private TextField codeField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField rateField;

    private ConverterController controller;

    @Override
    public void start(Stage stage) throws Exception {
        try {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("/Converter.fxml"));
        fxml.setController(this);
        Scene scene1 = fxml.load();
        controller = new ConverterController();
        stage.setTitle("Converter");
        stage.setScene(scene1);
        stage.show();

        updateChoiceBoxes();


        convertButton.setOnAction(event -> {
            if (choice1.getValue() != null && choice2.getValue() != null && amount.getText() != null) {
                String fromCurrency = choice1.getValue();
                String toCurrency = choice2.getValue();
                double amount1 = Double.parseDouble(amount.getText());
                result.setText(String.format("%.2f", controller.handleSelection(amount1, fromCurrency, toCurrency)));
            } else {
                result.setText("No selection");
            }
        });
        newCurrency.setOnAction(event -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/AddCurrency.fxml"));
                Scene root = fxmlLoader.load();
                CurrencyView addCurrencyView = fxmlLoader.getController();
                addCurrencyView.setController(controller);
                Stage stage2 = new Stage();
                stage2.setTitle("Add Currency");
                stage2.setScene(root);
                stage2.showAndWait();
                updateChoiceBoxes();
            } catch (Exception e) {
                result.setText("Error (addCurrency to database)");
            }
        });
    } catch (Exception e) {
            result.setText("Error (database)");
    }
    }

    private void updateChoiceBoxes() {
        choice1.getItems().clear();
        choice2.getItems().clear();
        for (Currency currency : controller.getCurrencies()) {
            choice1.getItems().add(currency.getCode());
            choice2.getItems().add(currency.getCode());
        }
    }
}