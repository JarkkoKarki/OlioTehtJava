package entity;

public class Currency {
    private int id;
    private String code, name;
    private double rate;

    public Currency(int id, String code, String name, double rate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


}
