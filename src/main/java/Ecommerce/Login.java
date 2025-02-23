package Ecommerce;

import java.util.Scanner;

public class Login {

	public static void login() {
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String name = scan.next();
		
		System.out.println("Enter password: ");
		String pass = scan.next();
		
		if(name.equals("chetan")) {
			if(pass.equals("Chetan@1234")) {
				System.out.println("Login Successfully");
			}
		}else {
			System.out.println("login failed");
			System.exit(0);
		}
	}
}
