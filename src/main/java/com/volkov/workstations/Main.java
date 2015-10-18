package com.volkov.workstations;

import com.volkov.workstations.database.DBConnection;
import com.volkov.workstations.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        DBConnection connection = new DBConnection();

        String query = "select * from users";

        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                User user = new User();
                user.setmId(resultSet.getInt("id"));
                user.setmLogin(resultSet.getString("login"));
                user.setmPassword(resultSet.getString("password"));
                user.setmEmail(resultSet.getString("email"));
                System.out.println(user);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
