package entity;

import application.CurrencyApp;

public class Converter {
    CurrencyApp app = new CurrencyApp();

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

}
