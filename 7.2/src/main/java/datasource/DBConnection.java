package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // Load the MariaDB driver
                Class.forName("org.mariadb.jdbc.Driver");
                conn = DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/CurrencyDB?user=appuser&password=root");
            } catch (ClassNotFoundException e) {
                System.out.println("MariaDB JDBC Driver not found.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Connection failed.");
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void terminate() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}