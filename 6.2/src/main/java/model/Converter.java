package model;

public class Converter {
    double amount;
    public double EURtoUSD(double value) {
        amount = value * 1.0446314;
        return amount;
    }
    public double EURtoGBP(double value) {
        amount = value * 0.83;
        return amount;
    }
    public double USDtoEUR(double value) {
        amount = value * 0.96;
        return amount;
    }
    public double USDtoGBP(double value) {
        amount = value * 0.79;
        return amount;
    }
    public double GBPtoEUR(double value) {
        amount = value * 1.21;
        return amount;
    }
    public double GBPtoUSD(double value) {
        amount = value * 1.26;
        return amount;
    }

}
