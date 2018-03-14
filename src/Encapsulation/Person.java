package Encapsulation;
import java.util.Scanner;
public class Person {
	
	 private double amt = 500;
	 private double creditbal;
	 private double debitbal;
	 private double bal;

	 public void CreditBal() {

	  Scanner sc = new Scanner(System.in);
	  creditbal = sc.nextDouble();
	  System.out.println("credit balance in account is: " + creditbal);

	 }

	 public void DebitBal() {

	  Scanner sc = new Scanner(System.in);
	  debitbal = sc.nextDouble();
	  System.out.println("debit balance in account is: " + debitbal);
	  
	 }

}

