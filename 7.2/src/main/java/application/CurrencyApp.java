package application;

import dao.CurrencyDao;

import java.util.*;

public class CurrencyApp {

    public static void main(String[] args) {
        CurrencyDao dao = new CurrencyDao();
        List <Currency> currrencies = dao.getAllEmployees("EURO");

    }
}