package application;

import datasource.DBConnection;
import entity.*;
import dao.*;
import entity.Currency;

import java.util.*;

public class CurrencyApp {
    CurrencyDao curdao = new CurrencyDao(DBConnection.getConnection());

        public double getRate(int num){
            Currency cur = curdao.getCurrency(num);
            return cur.getRate();
        }

        public List<Currency> getCurrencies(){
            return curdao.getAllCurrencies();
        }

    public double findCurrency(String fromCurrency) {
        List<Currency> currencies = getCurrencies();
        for (Currency c : currencies) {
            if (c.getCode().equals(fromCurrency)) {
                return c.getRate();
            }
        }
        return -1;
    }
}