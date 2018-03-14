package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BankAccount {

	public static void main(String[] args) {

		Set<UniqueBankAccount> bank = new HashSet<UniqueBankAccount>();
		bank.add(new UniqueBankAccount(1, "Hari"));
		bank.add(new UniqueBankAccount(2, "Rajendra"));
		bank.add(new UniqueBankAccount(3, "Prem"));
		bank.add(new UniqueBankAccount(4, "Sravan"));
		bank.add(new UniqueBankAccount(5, "Sagar"));
		System.out.println("" + bank.size());

		for (Iterator<UniqueBankAccount> i = bank.iterator(); i.hasNext();) {
			while (i.hasNext()) {
				UniqueBankAccount ub = (UniqueBankAccount) i.next();
				System.out.println(ub);
			}

		}
	}
}