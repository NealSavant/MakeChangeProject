//AUTHOR: Neal Savant
//DATE: November 15, 2019

import java.util.Scanner;

public class RegisterApp {
	public RegisterLogic register = new RegisterLogic();
	public Scanner kb = new Scanner(System.in);

	public void promptUser() {

		System.out.println("What is item price?");
		register.price = kb.nextDouble();

		System.out.println("How many dollars were given?");
		register.cashTendered = kb.nextDouble();

		System.out.println(register.denominations());
		kb.close();
	}

	public static void main(String[] args) {
		RegisterApp driver = new RegisterApp();
		driver.promptUser();

	}
}
