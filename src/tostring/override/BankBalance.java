package tostring.override;

public class BankBalance {
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("enter your credit balnce");
		b.CreditBalance();
		System.out.println("enter your debit balnce");
		b.DebitBalance();
		b.Balance();

	}

}
