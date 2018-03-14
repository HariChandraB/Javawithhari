package Cell;

public class BankAccount {
	double balance;
	double Debit;
	double Credit;

	public double Debit() {
		double Debitsum = Debit;
		return Debitsum;
	}

	public double Credit() {
		double Creditsum = Credit;
		return Creditsum;

	}

	public double Balance() {
		double Balancesum = Debit - Credit + balance;
		return Balancesum;
	}

	public static void main(String args[]) {
		BankAccount B = new BankAccount();
		B.Debit = 500;
		B.balance = 5000;
		double Debited = B.Debit();
		System.out.println("amount Debidited is " + Debited);
		B.Credit = 1000;
		double Credited = B.Credit();
		System.out.println("amount credited is " + Credited);
		double PrintBlance = B.Balance();
		System.out.println("balance amount is " + PrintBlance);

	}

}
