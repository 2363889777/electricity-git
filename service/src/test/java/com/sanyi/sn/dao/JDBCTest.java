package com.sanyi.sn.dao;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @author 十年
 * @function
 * @date 2020/3/19 0019
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class JDBCTest {

    @Test
    public void getConnection() throws SQLException, ClassNotFoundException {
        JDBC.getConnection();
    }
}