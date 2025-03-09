package controller;

import entity.Converter;
import entity.Currency;

import java.sql.SQLException;
import java.util.List;

public class ConverterController {
    static Converter converter = new Converter();

    public double handleSelection(double amount,String selection, String selection2) {
        if (selection != null && selection2 != null) {
            return converter.convert(amount, selection, selection2);
        } else {
            return 0;
        }
    }


    public List<Currency> getCurrencies() {
        return converter.getCurrencies();
    }

    public void addCurrency(String abbreviation, String name, double rate) throws SQLException {
        converter.addCurrency(abbreviation, name, rate);
    }

    public void saveTransaction(String fromCurrency, String toCurrency, double amount, double result) {
        converter.saveTransaction(fromCurrency, toCurrency, amount, result);
    }
}
