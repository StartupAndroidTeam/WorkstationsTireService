package com.volkov.workstations.database;

import com.volkov.workstations.constants.Constants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

public class DBConnectionTest {
    private Connection connection;

    @Before
    public void setUp() throws SQLException {
        connection = DriverManager.getConnection(Constants.DB_HOST, Constants.DB_USERNAME,
                Constants.DB_PASSWORD);
    }
    @Test
    public void testGetAll() throws Exception{
        String query = "select * from users";//" WHERE id = 2";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        Assert.assertNotNull(resultSet);
        while (resultSet.next()){
            String login = resultSet.getString("login");
            System.out.println(login);
        }
    }
}
