package controller;

import entity.Converter;
import entity.Currency;
import view.ConverterView;

public class ConverterController {
    static Converter converter = new Converter();

    public double handleSelection(double amount,String selection, String selection2) {
        return converter.convert(amount, selection, selection2);
    }
}
