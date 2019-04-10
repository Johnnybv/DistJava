package edu.wctc.simple.Model;

import java.sql.*;

public class CreateShopDB {
    public CreateShopDB(){
        try{
            final String DB_URL = "jdbc:derby:ShopDB;create=true";

            Connection conn = DriverManager.getConnection(DB_URL);

            dropTables(conn);

            buildCartTable(conn);

            buildProductsTable(conn);

            conn.close();
        }catch (Exception e){
            System.out.println("Error Creating the Database.");
            System.out.println(e.getMessage());
        }
    }

    public static void dropTables(Connection conn){
        System.out.println("Checking for existing tables.");

        try
        {
            // Get a Statement object.
            Statement stmt = conn.createStatement();

            try
            {
                stmt.execute("DROP TABLE Cart");
                System.out.println("Cart table dropped.");
            } catch (SQLException ex)
            {
                // No need to report an error.
                // The table simply did not exist.
            }

            try
            {
                stmt.execute("DROP TABLE Products");
                System.out.println("Products table dropped.");
            } catch (SQLException ex)
            {
                // No need to report an error.
                // The table simply did not exist.
            }
        } catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void buildCartTable(Connection conn){
        try{
            Statement stmt = conn.createStatement();

            stmt.execute("Create table Cart"
                    + "( CartID INT NOT NULL PRIMARY KEY ,"
                    + "  ProductID INT NOT NULL,"
                    + "  ProductName VARCHAR (100),"
                    + "  ProductDisc VARCHAR (200),"
                    + "  Price DOUBLE )");

            System.out.println("Cart Table Created.");
        }catch (SQLException ex){
            System.out.println("Error Building Cart Table.");
            System.out.println(ex.getMessage());
        }
    }

    public static void buildProductsTable(Connection conn){
        try{
            Statement stmt = conn.createStatement();

            stmt.execute("Create table Products"
                    + "( ProductID INT NOT NULL PRIMARY KEY ,"
                    + "  ProductName VARCHAR (100),"
                    + "  ProductDisc VARCHAR (200),"
                    + "  Price DOUBLE )");

            // Insert Products into rows
            stmt.execute("INSERT INTO Products VALUES "
                    + "(1 , 'ShoeExtreme', 'The Extreme shoe for Extreme People', 3.43)");
            stmt.execute("INSERT INTO Products VALUES "
                    + "(2 , 'Thing Shirt', 'The shirt with a thing on it.', 335.34)");
            stmt.execute("INSERT INTO Products VALUES "
                    + "(3 , 'Super Tee', 'The last Tee You will ever need', 1.11)");
            stmt.execute("INSERT INTO Products VALUES "
                    + "(4 , 'Best Wife Beater', 'Be the worst beater u can be in this best wife beater', 99.99)");

        }catch (SQLException ex){
            System.out.println("Error Building Products Table.");
            System.out.println(ex.getMessage());
        }

    }
}

