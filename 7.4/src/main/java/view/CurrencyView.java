package view;

import controller.ConverterController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;

public class CurrencyView {

    @FXML
    private TextField abbreviationField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField rateField;

    @FXML
    private Button addCurrency;

    @FXML
    private Label error;

    private ConverterController controller;

    public void setController(ConverterController controller) {
        this.controller = controller;
    }

    @FXML
    public void initialize() {
        addCurrency.setOnAction(event -> {
            try {
                String abbreviation = abbreviationField.getText();
                String name = nameField.getText();
                double rate = Double.parseDouble(rateField.getText());
                controller.addCurrency(abbreviation, name, rate);
                ((Stage) addCurrency.getScene().getWindow()).close();
            } catch (SQLException e) {
                error.setText("Database Error");
            } catch (NumberFormatException e) {
                error.setText("Input Error");
            }
        });
    }

    public String getAbbreviation() {
        return abbreviationField.getText();
    }
}