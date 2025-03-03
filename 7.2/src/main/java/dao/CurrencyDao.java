package dao;

import entity.Currency;

import java.awt.*;
import java.sql.*;
import datasource.DBConnection;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.*;

public class CurrencyDao {
    private Connection connection;

    public CurrencyDao(Connection connection) {
        this.connection = connection;
    }

    public Currency getCurrency(int num) {
        Connection conn = DBConnection.getConnection();
        String sql = "SELECT id, code, name, rate FROM currency WHERE id=?";

        int id = 0;
        String code = null;
        String name = null;
        double rate = 0.0;
        int count = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, num);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                count++;
                id = rs.getInt(1);
                code = rs.getString(2);
                name = rs.getString(3);
                rate = rs.getDouble(4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (count == 1) {
            return new Currency(id, code, name, rate);
        } else {
            return null;
        }
    }
}