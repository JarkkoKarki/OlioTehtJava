package dao;

import java.sql.*;
import datasource.DBConnection;
import java.util.*;

public class CurrencyDao {

    public List<Currency> getAllEmployees(String currency) {
        Connection conn = DBConnection.getConnection();
        String sql = "SELECT rate FROM Currency;";
        System.out.println(sql);
        List<Currency> currencies = new ArrayList<Currency>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                String rate = rs.getString(1); // Ensure the index is within the correct range
                System.out.println(rate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return currencies;
    }
}