package tostring.override;

import java.util.Scanner;

public class Bank {
	private double amount = 100;
	private double creditbalance;
	private double debitbalance;
	private double balance;

	public void CreditBalance() {

		Scanner sc = new Scanner(System.in);
		creditbalance = sc.nextDouble();
		System.out.println("credit balance in account is: " + creditbalance);

	}

	public void DebitBalance() {

		Scanner sc = new Scanner(System.in);
		debitbalance = sc.nextDouble();
		System.out.println("debit balance in account is: " + debitbalance);

	}

	public void Balance() {
		balance = amount - creditbalance + debitbalance;
		System.out.println("remaining balance in account is" + balance);

	}
}
