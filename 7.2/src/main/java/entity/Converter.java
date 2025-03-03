package entity;

import application.CurrencyApp;

public class Converter {
    CurrencyApp app = new CurrencyApp();
    double amount;

    public double EURtoUSD(double value) {
        amount = value * app.getRate(2);
        return amount;
    }
    public double EURtoGBP(double value) {
        amount = value * app.getRate(3);
        return amount;
    }
    public double USDtoEUR(double value) {
        if (app.getRate(2) > 0) {
            amount = value / app.getRate(2);
            return amount;
        } else {
            return 0;
        }
    }
    public double USDtoGBP(double value) {
        if (app.getRate(2) > 0) {
            double eurToUsdRate = app.getRate(2);
            double eurToGbpRate = app.getRate(3);
            amount = (value / eurToUsdRate) * eurToGbpRate;
            return amount;
        } else {
            return 0;
        }
    }
    public double GBPtoEUR(double value) {
        if (app.getRate(3) > 0) {
            amount = value / app.getRate(3);
            return amount;
        } else {
            return 0;
        }
    }
    public double GBPtoUSD(double value) {
        if (app.getRate(2) > 0) {
            double eurToGbpRate = app.getRate(3);
            double eurToUsdRate = app.getRate(2);
            amount = (value / eurToGbpRate) * eurToUsdRate;
            return amount;
        } else {
            return 0;
        }
    }

}
