package application;

import dao.CurrencyDao;
import dao.TransactionDao;
import entity.Currency;
import entity.Transaction;

import java.util.List;

public class CurrencyApp {
    CurrencyDao curdao = new CurrencyDao();
    TransactionDao transdao = new TransactionDao();

        public double getRate(int num){
            Currency cur = curdao.find(num);
            return cur.getRate();
        }

        public List<Currency> getCurrencies(){
            return curdao.findAll();
        }

        public void addCurrency(String abbreviation, String name, double rate){
            Currency cur = new Currency();
            cur.setAbbreviation(abbreviation);
            cur.setName(name);
            cur.setRate(rate);
            curdao.persist(cur);
        }

        public void updateCurrency(int id, String abbreviation, String name, double rate){
            Currency cur = curdao.find(id);
            cur.setAbbreviation(abbreviation);
            cur.setName(name);
            cur.setRate(rate);
            curdao.update(cur);
        }

        public double findCurrency(String abbreviation){
            List<Currency> cur = curdao.findAll();
            double rate = 0;
            System.out.println(cur);
            for (Currency currency : cur) {
                if(currency.getAbbreviation().equals(abbreviation)){
                    rate = currency.getRate();
                }
            }
            return rate;
        }

        public void saveTransaction(String fromCurrency, String toCurrency, double amount, double result){
            Transaction tra = new Transaction();
            tra.setFromCurrency(fromCurrency);
            tra.setToCurrency(toCurrency);
            tra.setAmount(amount);
            tra.setResult(result);
            transdao.persist(tra);
        }
    }


