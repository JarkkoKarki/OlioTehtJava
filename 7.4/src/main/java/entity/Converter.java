package entity;

import application.CurrencyApp;

import java.util.List;

public class Converter {
    CurrencyApp app = new CurrencyApp();

    public List<Currency> getCurrencies() {
        return app.getCurrencies();
    }

    public void addCurrency(String abbreviation, String name, double rate) {
        app.addCurrency(abbreviation, name, rate);
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double fromRate = app.findCurrency(fromCurrency);
        System.out.println(fromRate);
        double toRate = app.findCurrency(toCurrency);
        System.out.println(toRate);
        if (fromRate > 0 && toRate > 0) {
            return (amount / fromRate) * toRate;
        } else {
            throw new IllegalArgumentException("Invalid currency rates");
        }
    }

    public void saveTransaction(String fromCurrency, String toCurrency, double amount, double result) {
        app.saveTransaction(fromCurrency, toCurrency, amount, result);
    }

}
