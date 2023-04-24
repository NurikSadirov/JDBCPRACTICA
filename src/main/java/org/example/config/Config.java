package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String name = "postgres";
    private static final String password = "postgres";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    url,
                    name,
                    password
            );
            System.out.println("added");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
