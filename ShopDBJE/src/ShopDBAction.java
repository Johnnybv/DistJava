import java.sql.*;

public class ShopDBAction {
    public static void outputProducts(String DB){
        Statement stmt = null;
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(DB);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT ProductID, ProductName, ProductDisc, Price FROM Products";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ProductID - ProductName - Price");
            System.out.println("Product Description");
            System.out.println("_____________________________________________");

            while (rs.next()){
                int id = rs.getInt("ProductID");
                String name = rs.getString("ProductName");
                String disc = rs.getString("ProductDisc");
                double price = rs.getDouble("Price");

                System.out.println(id + " - " + name + " - " + price);
                System.out.println(disc);
            }

            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }

    public static void addToCart(String DB, int Cid){
        Statement stmt = null;
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(DB);
            stmt = conn.createStatement();

            if( Cid == 1) {
                stmt.execute("INSERT INTO Cart VALUES "
                        + "(1 , 'ShoeExtreme', 'The Extreme shoe for Extreme People', 3.43)");
            }
            else if ( Cid == 2) {
                stmt.execute("INSERT INTO Cart VALUES "
                        + "(2 , 'Thing Shirt', 'The shirt with a thing on it.', 335.34)");
            }
            else if ( Cid == 3) {
                stmt.execute("INSERT INTO Cart VALUES "
                        + "(3 , 'Super Tee', 'The last Tee You will ever need', 1.11)");
            }
            else if ( Cid == 4) {
                stmt.execute("INSERT INTO Cart VALUES "
                        + "(4 , 'Best Wife Beater', 'Be the worst beater u can be in this best wife beater', 99.99)");
            }

            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }

    public static void outputCart(String DB){
        Statement stmt = null;
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(DB);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT CartID, ProductID, ProductName, ProductDisc, Price FROM Cart";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("CartID");
            System.out.println("ProductID - ProductName - Price");
            System.out.println("Product Description");
            System.out.println("_____________________________________________");

            while (rs.next()){
                int cartID = rs.getInt("CartID");
                int id = rs.getInt("ProductID");
                String name = rs.getString("ProductName");
                String disc = rs.getString("ProductDisc");
                double price = rs.getDouble("Price");

                System.out.println(cartID);
                System.out.println(id + " - " + name + " - " + price);
                System.out.println(disc);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }
}
