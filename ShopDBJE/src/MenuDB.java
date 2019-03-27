import java.sql.*;
import java.util.Scanner;

public class MenuDB {
    public static void menu(){
        Scanner input = new Scanner(System.in);
        final String DB_URL = "jdbc:derby:ShopDB";
        String menuChoice;

        do {

            System.out.println("Database Menu_______________");
            System.out.println("\t1) List Products Table");
            System.out.println("\t2) Add Item To Cart");
            System.out.println("\t3) List Cart Table");
            System.out.println("\t4) Exit");
            System.out.print("\tMenu Selection: ");
            menuChoice = input.nextLine();

            if(menuChoice.equals("1")){
                ShopDBAction.outputProducts(DB_URL);
            }
            else if(menuChoice.equals("2")){
                System.out.print("Product ID to Add: ");
                int id = input.nextInt();
                ShopDBAction.addToCart(DB_URL, id);
            }
            else if(menuChoice.equals("3")){
                ShopDBAction.outputCart(DB_URL);
            }
            System.out.println("===============================");
        }while (!(menuChoice.equals("4")));
    }
}
