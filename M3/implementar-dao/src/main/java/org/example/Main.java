package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:h2:~/test";
        String username = "sa";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            String createTableQuery = "CREATE TABLE IF NOT EXISTS usuarios (id INT PRIMARY KEY, nombre VARCHAR(50))";
            statement.executeUpdate(createTableQuery);

            String insertQuery = "INSERT INTO usuarios VALUES (1, 'John Doe'), (2, 'Jane Smith')";
            statement.executeUpdate(insertQuery);

            statement.close();
            connection.close();

            System.out.println("Registros exitosos en la tabla 'usuarios'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}