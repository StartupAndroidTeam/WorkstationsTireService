package com.volkov.workstations.database;

import com.volkov.workstations.constants.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection connection;

    public DBConnection(){
        try {
            connection = DriverManager.getConnection(Constants.DB_HOST, Constants.DB_USERNAME,
                    Constants.DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
