package com.AlejandroZubillaga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
    private static Connection connection = null;

    private ConnectionFactory(){
        //This is wrong... You can not create more than one object
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("com/AlejandroZubillaga/dbConfig");

            String url = resourceBundle.getString("url");
            String username = resourceBundle.getString("username");
            String password = resourceBundle.getString("password");


            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                e.printStackTrace();
            }



        }
        return connection;
    }
}



