/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.app.lostandfoundmanagementsystems;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ruth_
 */
public class DBConnection {
    public static void main(String args[]){

    Connection con = getConnection();

    if(con != null){
        System.out.println("Database Connected Successfully");
    }
    else{
        System.out.println("Connection Failed");
    }

}
    public static Connection getConnection(){
       
        Connection con = null;

        try{

            con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/lostfound",
            "root",
            "shiro2025"
            );

        }catch(Exception e){

            System.out.println(e);

        }

        return con;
    }
}
    

