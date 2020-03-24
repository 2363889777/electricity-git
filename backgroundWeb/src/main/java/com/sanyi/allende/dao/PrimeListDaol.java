package com.sanyi.allende.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrimeListDaol{
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/electricity?serverTimezone=Asia/Shanghai";
    private static final String ROOT = "root";
    private static final String PASS = "";


    private Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, ROOT, PASS);
    }
}
