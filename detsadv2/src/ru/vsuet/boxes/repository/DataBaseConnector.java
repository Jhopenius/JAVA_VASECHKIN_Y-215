package ru.vsuet.boxes.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {

    private static final String DB_URL = "jdbc:h2:./groups";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "sa";
    private final Connection connection;


    public DataBaseConnector() throws RuntimeException {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
