package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String abbreviation, name;
    private double rate;

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

    public void setAbbreviation(String code) {
        this.abbreviation = abbreviation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


}
