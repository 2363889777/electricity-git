package com.sanyi.sn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 十年
 * @function
 * @date 2020/3/19 0019
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class JDBC {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/staff";
    private static final String ROOT = "root";
    private static final String PASS = "";


    private Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, ROOT, PASS);
    }
}
