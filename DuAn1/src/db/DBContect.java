/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QQ
 */
public class DBContect {
    public static final String HOSTNAME = "localhost";

    public static final String USER = "sa";

    public static final String PASSWORD = "honkai123";

    public static final String DB = "QUANLYCUAHANGGIAY";

    public static final String CONNECTION_STRING = "jdbc:sqlserver://" + HOSTNAME + ":1433;databaseName=" + DB;
    private static Connection connection;
    public static Connection getDatabaseConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD);
                DatabaseMetaData metaData = connection.getMetaData();
            }
        } catch (SQLException ex) {
            System.out.println("Connection to database failed");
            return null;
        }
        return connection;
    }
     public static ResultSet runSelectQuery(Statement st, String sql) {
        ResultSet rs = null;
        try {
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
        }
        return rs;
    }
     public static void main(String[] args) {
        
    }
}
