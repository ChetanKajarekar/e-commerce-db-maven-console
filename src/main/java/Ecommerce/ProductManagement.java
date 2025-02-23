package Ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductManagement {
	
	public static void productManagement() throws SQLException{
		String url = "jdbc:mysql://127.0.0.1:3306/add_product";
		String userName = "root";
		String password ="Chet@n3124";
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		
		Statement statement = connection.createStatement();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Product");
			System.out.println("2. Search Product");
			System.out.println("3. Delete Product");
			System.out.println("4. Display Product");
			System.out.println("5. Exit");
			
			int option = scan.nextInt();
			
			if(option == 1) {
				System.out.println(" Add product");
				
				System.out.println("Enter product id: ");
				int id = scan.nextInt();
				
				System.out.println("Enter product name: ");
				String Productname = scan.next();
				
				System.out.println("Enter product price: ");
				String Price = scan.next();
				
				System.out.println("Enter product quantity: ");
				String Quantiy = scan.next();
				
				String query = "INSERT INTO add_product.addproduct(id, Productname, Price, Quantiy)"+
											"VALUES("+id + ",'" + Productname +"','" + Price + "','" +Quantiy +"');";
				
				statement.execute(query);
				System.out.println("New Product Added");
			}
			else if(option == 2) {
				System.out.println(" Search Prodct");
				
				System.out.println("Enter product name: ");
				String search = scan.next();
				
				String query = "SELECT * FROM add_product.addproduct WHERE productname = '" + search + "';";
				
				ResultSet result =statement.executeQuery(query);
				while(result.next()) {
					for(int i = 1; i < 5; i++) {
						System.out.println(result.getString(i));
					}
			}
		}
			else if(option == 3) {
			
			System.out.println("Remove product");
			
			System.out.println("Enter product name :");
			String remove = scan.next();
			
			String query = "DELETE FROM add_product.addproduct WHERE Productname = '" +remove+"'";
			statement.execute(query);
			
			System.out.println("Product removed successfully");
			}
		
			else if(option == 4) {
				System.out.println("Display Product");
			
				String query = "SELECT * FROM add_product.addproduct";
			
				ResultSet display = statement.executeQuery(query);
				while(display.next()) {
					for(int i = 1; i< 5; i++) {
						System.out.println(display.getString(i));
					}
				}
			}
			else if(option == 5) {
				connection.close();
				System.out.println("Exiting product management");
				return;
			}
			else {
				System.out.println("Invalid Option ");
			}

		}
	}
}
