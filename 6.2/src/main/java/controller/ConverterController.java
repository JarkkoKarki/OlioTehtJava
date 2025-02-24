package controller;

import model.Converter;
import view.ConverterView;

public class ConverterController {
    static Converter converter = new Converter();

    public double handleSelection(double amount,String selection, String selection2) {
        if (selection.equals("EUR") && selection2.equals("USD")) {
            return converter.EURtoUSD(amount);
        } else if (selection.equals("EUR") && selection2.equals("GBP")) {
            return converter.EURtoGBP(amount);
        } else if (selection.equals("USD") && selection2.equals("GBP")) {
            return converter.USDtoGBP(amount);
        } else if (selection.equals("USD") && selection2.equals("EUR")) {
            return converter.USDtoEUR(amount);
        } else if (selection.equals("GBP") && selection2.equals("EUR")) {
            return converter.GBPtoEUR(amount);
        } else if (selection.equals("GBP") && selection2.equals("USD")) {
            return converter.GBPtoUSD(amount);
        } else {
            return amount;
        }
    }

    public static void main(String[] args) {
        ConverterView.launch(ConverterView.class);
    }
}
