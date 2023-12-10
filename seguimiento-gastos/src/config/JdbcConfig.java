package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {
    private static final String url_DB = "jdbc:h2:~/test";
    private static final String user_DB = "sa";
    private static final String password_DB = "";

    public static Connection getConnectionDB() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url_DB, user_DB, password_DB);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
