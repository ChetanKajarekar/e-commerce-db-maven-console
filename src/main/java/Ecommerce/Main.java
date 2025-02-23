package Ecommerce;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException{
		
		System.out.println("Welcome to ECommerce");
		
		Scanner scan = new Scanner(System.in);
		
		Login.login();
		
		while(true) {
			
			System.out.println("1. User Manaegement");
			System.out.println("2. Product Management");
			System.out.println("3. Exit");
			
			int option = scan.nextInt();
			
			if(option == 1) {
				UserManagement.userMan();
				
			}else if(option == 2) {
				
				ProductManagement.productManagement();
				
			}else if(option == 3) {
				
				System.out.println("Exitiong from ecommerce");
				return;
			}
		}
	}

}
