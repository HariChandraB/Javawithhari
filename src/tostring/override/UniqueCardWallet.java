package tostring.override;

public class UniqueCardWallet {
	String name;
	int number;

	public UniqueCardWallet(String name, int Cardnumber) {

		this.name = name;
		this.number = Cardnumber;
	}

	public String toString() {

		return "customer details  " + name;

	}

	public int hashCode() {

		return number;
	}

	public boolean equals(Object obj) {
		UniqueCardWallet other = (UniqueCardWallet) obj;
		if (number != other.number)
			return true;
		else
			return false;

	}
}
