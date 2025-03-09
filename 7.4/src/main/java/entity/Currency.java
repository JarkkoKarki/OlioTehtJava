package entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String abbreviation, name;
    private double rate;

    @OneToMany(mappedBy = "currency")
    private List<Transaction> transactions;

    public Currency(int id, String abbreviation, String name, double rate, List<Transaction> transactions) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.name = name;
        this.rate = rate;
        this.transactions = transactions;
    }

    public Currency() {
    }

    public int getId() {
        return id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}