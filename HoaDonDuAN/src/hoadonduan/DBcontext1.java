/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoadonduan;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
/**
 *
 * @author dinhq
 */
public class DBcontext1 {
     private static String URL ="jdbc:sqlserver://localhost:1433;databaseName=QUANLYCUAHANGGIAY_DUAN1";
     private static String USERNAME="sa";
     private static String PASSWORD ="123";
     
     static {
         try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DBcontext1.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    public  static  Connection getConnection(){
       Connection cn = null;
         try {
             cn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
         } catch (SQLException ex) {
             Logger.getLogger(DBcontext1.class.getName()).log(Level.SEVERE, null, ex);
         }
         return cn;
    }
    
    public static void main(String[] args) {
        Connection cn = getConnection();
        if(cn!=null){
            System.out.println("Kết nối thành công");
        }else{
              System.out.println("Lỗi kết nối");  
                }
    }
}
