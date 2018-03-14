package exceptions;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) throws Exception {
		String credentials[] = loginUser();
		System.out.println("Username is " + credentials[0] + " and Password is " + credentials[1]);
		String mypassword = "harihrps";
		String userpassword = credentials[1];

		if (mypassword.equals(userpassword)) {
			System.out.println("your password matches");
		} else {
			throw new Exception("Invalid password exception");
		}
	}

	public static String[] loginUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String userName = sc.nextLine();
		System.out.println("Enter Password:");
		String password = sc.nextLine();
		sc.close();
		return new String[] { userName, password };
	}
}
