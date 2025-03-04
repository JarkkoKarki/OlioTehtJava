package application;

import dao.CurrencyDao;
import entity.Currency;

import java.util.List;

public class CurrencyApp {
    CurrencyDao curdao = new CurrencyDao();

        public double getRate(int num){
            Currency cur = curdao.find(num);
            return cur.getRate();
        }

        public List<Currency> getCurrencies(){
            return curdao.findAll();
        }

        public void addCurrency(String code, String name, double rate){
            Currency cur = new Currency();
            cur.setCode(code);
            cur.setName(name);
            cur.setRate(rate);
            curdao.persist(cur);
        }

        public void updateCurrency(int id, String code, String name, double rate){
            Currency cur = curdao.find(id);
            cur.setCode(code);
            cur.setName(name);
            cur.setRate(rate);
            curdao.update(cur);
        }

        public double findCurrency(String code){
            List<Currency> cur = curdao.findAll();
            for (Currency currency : cur) {
                if(currency.getCode().equals(code)){
                    return currency.getRate();
                }
            }
            return 0;

        }
    }


