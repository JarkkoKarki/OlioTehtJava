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
    private TextField codeField;

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
                String code = codeField.getText();
                String name = nameField.getText();
                double rate = Double.parseDouble(rateField.getText());
                controller.addCurrency(code, name, rate);
                ((Stage) addCurrency.getScene().getWindow()).close();
            } catch (SQLException e) {
                error.setText("Database Error");
            } catch (NumberFormatException e) {
                error.setText("Input Error");
            }
        });
    }

    public String getCode() {
        return codeField.getText();
    }
}