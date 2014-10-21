package com.javabegin.unit06.walktrow01;

import java.io.IOError;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/**
 * Created by user01 on 23.09.14.
 */
public class MultiRethrow {
    public static void main(String[] args) {
        try {
            readSomeData();

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

    }
    static void readSomeData() throws IOException, SQLException {
        try {
            SQLException esql = new SQLException("Table Cust doesn't exists");
            throw esql;
        } catch (Exception e) {
            throw e;
        }
    }
}
