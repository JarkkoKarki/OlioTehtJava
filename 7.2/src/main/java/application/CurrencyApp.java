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
    }