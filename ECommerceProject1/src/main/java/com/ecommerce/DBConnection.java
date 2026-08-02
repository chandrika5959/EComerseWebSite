package com.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static String url =
            "jdbc:mysql://localhost:3306/ecommerce";

    static String user = "root";

    static String password = "Chandu*2005";

    public static Connection getConnection() {

        try {

            Class.forName(
                "com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    url,
                    user,
                    password);

        } catch(Exception e) {

            e.printStackTrace();
        }

        return null;
    }

}
